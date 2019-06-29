package com.java.oops.aggregation;

/**
 * Student HAS-A address
 * we can achieve code re usability
 * @author Chakravarthy Garimella (cgarim823)
 * Jun 6, 2019
 *
 */
public class Student {
    
    private String studentName;
    private int studentId;
    private Address address;
    
    public Student(String studentName, int studentId, Address address) {
        super();
        this.studentName = studentName;
        this.studentId = studentId;
        this.address = address;
    }

    public static void main(String[] args) {
        Address address = new Address("chex", "1800 market st", "227", "philly", "PA", "19105", "USA");
        Student student = new Student("chakri", 442, address);
        System.out.println(student.toString());
        
    }

    @Override
    public String toString() {
        return "Student [studentName=" + studentName + ", studentId=" + studentId + ", address=" + address + "]";
    }

}
