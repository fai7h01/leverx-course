package com.leverx.course;

import com.leverx.course.sealedclasses.Car;
import com.leverx.course.sealedclasses.Service;
import com.leverx.course.sealedclasses.Truck;
import com.leverx.course.sealedclasses.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //note: every permitted subclass must define modifier: final, sealed or non-sealed

        Service serviceCar = new Car(4);
        Service serviceTruck = new Truck(15000);

        System.out.println(serviceCar.getMaxServiceIntervalInMonths());
        System.out.println(serviceTruck.getMaxServiceIntervalInMonths());

        Vehicle vehicleCar = new Car(4);
        Vehicle vehicleTruck = new Truck(10000);

        System.out.println(vehicleCar.getRegistrationNumber());
        System.out.println(vehicleTruck.getRegistrationNumber());

        //traditional way
        if (vehicleTruck instanceof Service) {
            int maxServiceIntervalInMonths =
                    ((Service) vehicleTruck).getMaxServiceIntervalInMonths();
            System.out.println(maxServiceIntervalInMonths);
        }

        //pattern matching
        if (vehicleCar instanceof Service service) {
            int maxServiceIntervalInMonths = service.getMaxServiceIntervalInMonths();
            System.out.println(maxServiceIntervalInMonths);
        }

        List<String> names = new ArrayList<>() {
            @Override
            public boolean add(String s) {
                System.out.println("Name added to list");
                return super.add(s);
            }
        };

        names.add("Java");


    }

}