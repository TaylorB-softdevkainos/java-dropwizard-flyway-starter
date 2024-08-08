package org.example.models;

public class Sales {
    private int id;
    private double commissionRate;
    private int employeeID;


    public Sales(final int id,
                 final double commissionRate,
                 final int employeeID) {
        this.id = id;
        this.commissionRate = commissionRate;
        this.employeeID = employeeID;
    }

    public int getId() {
        return id;
    }

    public void id(final int id) {
        this.id = id;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(final double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(final int employeeID) {
        this.employeeID = employeeID;
    }
}
