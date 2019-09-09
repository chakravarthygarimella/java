package com.java.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaExample5 {

    private int id;
    private String name;
    private String address;

    public LambdaExample5(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public static void main(String[] args) {
        List<LambdaExample5> empList = new ArrayList<>();
        LambdaExample5 emp1 = new LambdaExample5(12, "bob", "1000 arch st");
        LambdaExample5 emp2 = new LambdaExample5(1, "will", "1001 arch st");
        LambdaExample5 emp3 = new LambdaExample5(10, "alex", "1100 arch st");
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);

        Collections.sort(empList, (n1, n2) -> {
            return n1.address.compareTo(n2.address);
        });

        empList.forEach(emp -> {
            System.out.println("id: " + emp.id + " name: " + emp.name + " address: " + emp.address);
        });

    }
}
