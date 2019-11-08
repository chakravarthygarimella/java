package com.java.corejava.string;

public class StringExample1 {

    public static void main(String[] args) {
        String str = "+------------------------------------------------------------------------------+\r\n"
                        + "| Port Table       |           Operational Status            |  Admin Config   |\r\n"
                        + "|---------+--------+----+--------------+----+---+-------+----+----+-------+----|\r\n"
                        + "| Port    | Port   |    |  Link State  |    |   |       |Auto|    |       |Auto|\r\n"
                        + "| Name    | Type   |Link|   Duration   |XCVR|STP| Mode  |Neg |Link| Mode  |Neg |\r\n"
                        + "|---------+--------+----+--------------+----+---+-------+----+----+-------+----|\r\n"
                        + "| 1       |Uncertif|Down| 388d 1h23m38s|UCTF|Dis|       |    | Dis|1000/FD| Off|\r\n"
                        + "| 2       |10/100/G|Down|   0d 0h 0m 0s|    |Dis|       |    | Dis|1000/FD| On |\r\n"
                        + "| 3       |10/100/G|Down|   0d 0h 0m 0s|    |Dis|       |    | Dis|1000/FD| On |\r\n"
                        + "| 4       |10/100/G|Down|   0d 0h 0m 0s|    |Dis|       |    | Dis|1000/FD| On |\r\n"
                        + "| 5       | 100/G  |Down|   0d 0h 0m 0s|    |Dis|       |    | Dis|1000/FD| On |\r\n"
                        + "| 6       | 100/G  |Down|   0d 0h 0m 0s|    |Dis|       |    | Dis|1000/FD| On |\r\n"
                        + "| 7       | 100/G  |Down|   0d 0h 0m 0s|    |Dis|       |    | Dis|1000/FD| On |\r\n"
                        + "| 8       | 100/G  |Down|   0d 0h 0m 0s|    |Dis|       |    | Dis|1000/FD| On |\r\n"
                        + "| 9       | G/10Gig|Down|   0d 0h 0m 0s|    |Dis|       | Off| Dis|Auto/FD| On |\r\n"
                        + "| 10      |Uncertif| Up | 466d19h 9m46s|UCTF|FWD|1000/FD| On |Ena |Auto/FD| On |\r\n"
                        + "+---------+--------+----+--------------+----+---+-------+----+----+-------+----+";

        // System.out.println(str);
        String subStrforWindows = str.substring(str.length() - 1);
        String resultStr = "";
        if (!subStrforWindows.contains("\n")) {
            resultStr = str.concat(System.lineSeparator());
            System.out.println(resultStr);
        }
        if (resultStr.contains("\n")) {
            System.out.println("new line added to device response");
        } else {
            System.out.println("new line found");
        }

    }

}
