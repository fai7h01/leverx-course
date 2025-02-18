package com.leverx.course;

import com.leverx.course.sealedclasses.interfaces.Car;
import com.leverx.course.sealedclasses.interfaces.Service;
import com.leverx.course.sealedclasses.interfaces.Truck;

public class Main {
    public static void main(String[] args) {

        Service serviceCar = new Car(4);
        Service serviceTruck = new Truck(15000);

        System.out.println(serviceCar.getMaxServiceIntervalInMonths());
        System.out.println(serviceTruck.getMaxServiceIntervalInMonths());


    }

}