package com.soumyadeep;

public class Main {

    public static void main(String[] args) {

        var employee = new Employee();

        employee.setBaseSalary(50_000);
        int baseSalary = employee.getBaseSalary();

        employee.setHourlyRate(50);
        int hourlyRate = employee.getHourlyRate();

        System.out.println(employee.calculateWage(10));
    }
}
