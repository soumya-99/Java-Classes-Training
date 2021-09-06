package com.soumyadeep;

public class Main {

    public static void main(String[] args) {

        var employee = new Employee(50_000, 50); // Default Constructor
        var emp2 = new Employee(40_000); // Another Constructor

        System.out.println(employee.calculateWage(10));
    }
}
