package com.leverx.course.collections;

import java.util.EnumSet;
import java.util.Set;

public class EnumSetExample {

    enum Currency {USD, EUR, GEL}

    public static void main(String[] args) {

        Set<Currency> always = EnumSet.allOf(Currency.class);
        System.out.println(always);

        Set<Currency> never = EnumSet.noneOf(Currency.class);
        System.out.println(never);

        Set<Currency> global = EnumSet.range(Currency.USD, Currency.EUR);
        System.out.println(global);

        Set<Currency> ge = EnumSet.of(Currency.GEL, Currency.EUR);
        System.out.println(ge);
    }

}
