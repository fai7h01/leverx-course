package com.leverx.course.sealedclasses;

public final class Truck implements Service{

    private final int loadCapacity;

    public Truck(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public int getMaxServiceIntervalInMonths() {
        return 2;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }
}
