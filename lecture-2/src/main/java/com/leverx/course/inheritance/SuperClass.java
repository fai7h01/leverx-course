package com.leverx.course.inheritance;

public class SuperClass {

    public SuperClass returnMe() {
        return this;
    }
}

class SubClass extends SuperClass {

    @Override
    public SubClass returnMe() {
        return this;
    }

}