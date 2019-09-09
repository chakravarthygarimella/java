package com.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class RegexPractice {

    @Test
    public void test() {
        String input = "re0-ce-hkstnhec02w.hooksett.nh.boston";
        Pattern p = Pattern.compile("^(?<rePath>re\\d{1,2}-)(?<origSysName>.*)");
        Matcher m = p.matcher(input);
        if (m.find()) {
            System.out.println(m.group("origSysName"));
        }
    }
}
