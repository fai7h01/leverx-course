package com.leverx.course.sealedclasses;

public abstract sealed class Vehicle permits Car, Truck{

    private final String registrationNumber;

    protected Vehicle(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }
}
