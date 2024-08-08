package org.example.models;

public class Sales {
    private int id;
    private double commissionRate;
    private int employeeID;


    public Sales(int id, double commissionRate, int employeeID) {
        this.id = id;
        this.commissionRate = commissionRate;
        this.employeeID = employeeID;
    }

    public int getId() {
        return id;
    }

    public void id(int id) {
        this.id = id;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }
}
