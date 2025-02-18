package com.leverx.course;

import com.leverx.course.sealedclasses.Car;
import com.leverx.course.sealedclasses.Service;
import com.leverx.course.sealedclasses.Truck;
import com.leverx.course.sealedclasses.Vehicle;

public class Main {
    public static void main(String[] args) {

        Service serviceCar = new Car(4);
        Service serviceTruck = new Truck(15000);

        System.out.println(serviceCar.getMaxServiceIntervalInMonths());
        System.out.println(serviceTruck.getMaxServiceIntervalInMonths());

        Vehicle vehicleCar = new Car(4);
        Vehicle vehicleTruck = new Truck(10000);

        System.out.println(vehicleCar.getRegistrationNumber());
        System.out.println(vehicleTruck.getRegistrationNumber());

    }

}