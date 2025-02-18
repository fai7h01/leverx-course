package com.leverx.course.sealedclasses;

public final class Car implements Service{

    private final int numberOfSeats;

    public Car(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public int getMaxServiceIntervalInMonths() {
        return 1;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }
}
