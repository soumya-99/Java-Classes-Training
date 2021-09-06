package com.soumyadeep;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public Employee(int baseSalary) { // Constructor Overloading
        this(baseSalary, 0);
    }

    public Employee(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }

    public int calculateWage(int extraHours) {
        return baseSalary + (extraHours * getHourlyRate());
    }

    public int calculateWage() { // Method Overloading
        // return baseSalary;
        // or
        return calculateWage(0);
    }

    private int getBaseSalary() { // Getters
        return baseSalary;
    }

    private void setBaseSalary(int baseSalary) { // Setters
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary can't be 0 or less.");
        this.baseSalary = baseSalary;
    }

    private int getHourlyRate() { // Getter
        return hourlyRate;
    }

    private void setHourlyRate(int hourlyRate) { // Setter
        if (hourlyRate < 0)
            throw new IllegalArgumentException("Hourly Rate can't be 0 or less.");
        this.hourlyRate = hourlyRate;
    }
}
