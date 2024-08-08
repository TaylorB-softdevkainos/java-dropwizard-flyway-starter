package org.example.models;

public class Delivery {
    private int id;
    private int employeeID;

    public Delivery(final int deliveryId, final int deliveryEmployeeID) {
        this.id = deliveryId;
        this.employeeID = deliveryEmployeeID;
    }

    public int getId() {
        return id;
    }

    public void id(final int deliveryId) {
        this.id = deliveryId;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(final int salesEmployeeID) {
        this.employeeID = salesEmployeeID;
    }
}
