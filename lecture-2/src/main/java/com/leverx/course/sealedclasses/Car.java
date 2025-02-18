package com.leverx.course.sealedclasses;

public final class Car extends Vehicle implements Service{

    private final int numberOfSeats;

    public Car(int numberOfSeats) {
        super("A100");
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
