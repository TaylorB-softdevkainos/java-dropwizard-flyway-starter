package org.example.models;

public class Delivery {
    private int id;
    private int employeeID;

    public Delivery(final int id, final int employeeID) {
        this.id = id;
        this.employeeID = employeeID;
    }

    public int getId() {
        return id;
    }

    public void id(final int id) {
        this.id = id;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(final int employeeID) {
        this.employeeID = employeeID;
    }
}
