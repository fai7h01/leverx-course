package com.leverx.course;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

//java.lang.Class<T> class represents the metadata of a class
public class ClassAPI {

    public static void main(String[] args) {

        Class<?> clazz = String.class;
        System.out.println(clazz.getName());
        System.out.println(clazz.getSimpleName());
        System.out.println(clazz.getSuperclass().getName());

        System.out.println("==========Methods==========");

        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }

        System.out.println("==========Fields==========");

        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }

        System.out.println("==========Interfaces==========");

        Class<?>[] interfaces = clazz.getInterfaces();
        for (Class<?> iface : interfaces) {
            System.out.println(iface.getName());
        }
    }

}
/*
Class Loaders

A class loader is an object that is responsible for loading classes. It loads classes dynamically
to the JVM during runtime. They are part of the JRE. Therefore, the JVM does not need to know about
files or file systems to run java programs.

JVM does not load java classes into memory all at once, but rather when an application requires them.
Class loaders have 2 main functions: Load Classes, Locate Resources.
Types of Built-in Class Loaders:
    - Bootstrap class loader: loads core java classes from the rt.jar or module system.
    - Platform Class loader: loads classes from the JDK's extensions directory.
    - System (Application) class loader: loads classes on the application class path, module path, and JDK specific tools.

 */
