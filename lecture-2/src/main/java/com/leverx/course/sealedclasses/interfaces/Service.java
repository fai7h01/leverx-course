package com.leverx.course.sealedclasses.interfaces;

public sealed interface Service permits Car,  Truck {

    int getMaxServiceIntervalInMonths();

    default int getMaxDistanceBetweenServicesInKilometers() {
        return 100000;
    }

}
