package com.soumyadeep;

public class Main {

    public static void main(String[] args) {

        var employee = new Employee();

        employee.baseSalary = 50_000;
        employee.hourlyRate = 50;

        System.out.println(employee.calculateWage(10));
    }
}
