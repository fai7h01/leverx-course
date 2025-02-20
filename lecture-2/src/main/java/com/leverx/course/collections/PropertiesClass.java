package com.leverx.course.collections;

import java.util.BitSet;
import java.util.Properties;

public class PropertiesClass {

    public static void main(String[] args) {

        //commonly used for storing configs and application properties
        Properties properties = System.getProperties();
        System.out.println(properties);

        //not recommended
        System.out.println(properties.get("java.version"));
        System.out.println(properties.get("os.version"));
        System.out.println(properties.get("os.arch"));

        String javaVersion = properties.getProperty("java.version");
        System.out.println(javaVersion);

    }

}
