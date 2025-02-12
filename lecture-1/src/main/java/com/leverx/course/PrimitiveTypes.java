package com.leverx.course;

public class PrimitiveTypes {

    byte b = 100;                       // 1 byte, from -128 to 127
    short s = 10_000;                   // 2 bytes, from -32,768 to 32,767
    int i = 1_000_000_000;              // 4 bytes, from -2,147,483,648 to 2,147,483,647
    long l = 100_000_000_000L;          // 8 bytes, from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

    float f = 3.14F;                    // 4 bytes, sufficient for storing 6 to 7 decimal digits
    double d = 1.7e20; //1.7 * 10²⁰     // 8 bytes, sufficient for storing 15 decimal digits

    char ch1 = 'a';                     // 2 bytes
    char ch2 = '\b';                    // 2 bytes

    boolean bool = true;                // it's JVM dependent, usually its 1 byte

    byte b2 = 126 / 2; // int divided to int is int, and since value int fits in byte, casting happens automatically
    //byte b3 = B / 2; // JVM does not know about B in compile time so explicit casting is needed
    byte b3 = (byte) (b / 2);
}
