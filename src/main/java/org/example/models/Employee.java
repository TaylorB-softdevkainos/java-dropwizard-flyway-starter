package org.example.models;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private String bankNumber;
    private String nationalInsurance;


    public Employee(final int id, final String name, final double salary,
                    final String bankNumber, final String nationalInsurance) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.bankNumber = bankNumber;
        this.nationalInsurance = nationalInsurance;
    }

    public int getEmployeeId() {
        return id;
    }

    public void setEmployeeId(final int id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return name;
    }

    public void setEmployeeName(final String name) {
        this.name = name;
    }

    public double getEmployeeSalary() {
        return salary;
    }

    public void setEmployeeSalary(final double salary) {
        this.salary = salary;
    }

    public String getEmployeeBankNumber() {
        return bankNumber;
    }

    public void setEmployeeBankNumber(final String bankNumber) {
        this.bankNumber = bankNumber;
    }

    public String getEmployeeNationalInsurance() { return nationalInsurance; }

    public void setEmployeeNationalInsurance(final String nationalInsurance) {
        this.nationalInsurance = nationalInsurance;
    }
}
