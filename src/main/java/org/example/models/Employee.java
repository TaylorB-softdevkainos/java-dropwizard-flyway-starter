package org.example.models;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private String bankNumber;
    private String nationalInsurance;


    public Employee(int id, String name, double salary, String bankNumber, String nationalInsurance) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.bankNumber = bankNumber;
        this.nationalInsurance = nationalInsurance;
    }

    public int getEmployeeId() {
        return id;
    }

    public void setEmployeeId(int id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return name;
    }

    public void setEmployeeName(String name) {
        this.name = name;
    }

    public double getEmployeeSalary() {
        return salary;
    }

    public void setEmployeeSalary(double salary) {
        this.salary = salary;
    }

    public String getEmployeeBankNumber() {
        return bankNumber;
    }

    public void setEmployeeBankNumber(String bankNumber) {
        this.bankNumber = bankNumber;
    }

    public String getEmployeeNationalInsurance() { return nationalInsurance; }

    public void setEmployeeNationalInsurance(String nationalInsurance) {
        this.nationalInsurance = nationalInsurance;
    }
}
