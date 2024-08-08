package org.example.models;

public class Sales {
    private int id;
    private double commissionRate;
    private int employeeID;


    public Sales(final int salesId, final double salesCommissionRate, final int salesEmployeeID) {
        this.id = salesId;
        this.commissionRate = salesCommissionRate;
        this.employeeID = salesEmployeeID;
    }

    public int getId() {
        return id;
    }

    public void id(final int salesId) {
        this.id = salesId;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(final double salesCommissionRate) {
        this.commissionRate = salesCommissionRate;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(final int salesEmployeeID) {
        this.employeeID = salesEmployeeID;
    }
}
