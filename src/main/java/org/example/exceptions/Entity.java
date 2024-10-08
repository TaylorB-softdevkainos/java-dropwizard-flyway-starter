package org.example.exceptions;

public enum Entity {
    EMPLOYEE("Employee"),
    SALESEMPLOYEE("Sale Employee"),
    DELIVERYEMPLOYEE("Delivery Employee"),
    PROJECT("Project"),
    USER("User");

    private final String entity;

    Entity(final String entity) {
        this.entity = entity;
    }

    public String getEntity() {
        return this.entity;
    }
}
