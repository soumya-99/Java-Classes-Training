package com.soumyadeep;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public int calculateWage(int extraHours) {
        return baseSalary + (extraHours * getHourlyRate());
    }

    public int getBaseSalary() { // Getters
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) { // Setters
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary can't be 0 or less.");
        this.baseSalary = baseSalary;
    }

    public int getHourlyRate() { // Getter
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) { // Setter
        if (hourlyRate <= 0)
            throw new IllegalArgumentException("Hourly Rate can't be 0 or less.");
        this.hourlyRate = hourlyRate;
    }
}
