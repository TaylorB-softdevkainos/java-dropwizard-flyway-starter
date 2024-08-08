package org.example.models;

public class Delivery {
    private int id;
    private int employeeID;

    public Delivery(int id, int employeeID) {
        this.id = id;
        this.employeeID = employeeID;
    }

    public int getId() {
        return id;
    }

    public void id(int id) {
        this.id = id;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }
}
