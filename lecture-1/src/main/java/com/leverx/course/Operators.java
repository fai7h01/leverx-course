package com.leverx.course;

public class Operators {

    //int -> 32 bits
    static int A = 9;  // 1001
    static int B = 12; // 1100

    public static void main(String[] args) {

        System.out.println(A + " in binary: " + Integer.toBinaryString(A));
        System.out.println(B + " in binary: " + Integer.toBinaryString(B));

        System.out.println("================BITWISE OPERATORS================");

        bitwiseAnd();
        bitwiseOr();
        bitwiseExclusiveOr();
        bitwiseNot();
        leftBitShift();
        rightBitShift();
        unsignedRightBitShift();
        assignment();
    }

    static void bitwiseAnd() { // returns 1 if both are 1, otherwise 0

        int result = A & B; // RESULT: 8 => if both bits are 1 then its 1, otherwise 0,
        // so answer is 1000, which is 8 in decimal
        System.out.println("Bitwise & (and): \nbinary -> " + Integer.toBinaryString(result) + "\ndecimal -> " + result);
    }

    static void bitwiseOr() { // returns 1 if one of them is 1, if both 0 then returns 0

        int result = A | B; // RESULT: 1101 -> 13
        System.out.println("Bitwise | (or): \nbinary -> " + Integer.toBinaryString(result) + "\ndecimal -> " + result);
    }

    static void bitwiseExclusiveOr() { // return 1 only if exactly one of them is 1, otherwise 0

        int result = A ^ B;
        System.out.println("Bitwise ^ (exclusive OR): \nbinary -> " + Integer.toBinaryString(result) + "\ndecimal -> " + result);
    }

    static void bitwiseNot() { //flips each bit of its operand, it inverts 1 to 0 and 0 to 1

        int result = ~A;
        System.out.println("Bitwise ~ (NOT): \nbinary -> " + Integer.toBinaryString(result) + "\ndecimal -> " + result);
    }

    static void leftBitShift() {

        int result = A << 1;
        System.out.println("Left shift <<: \nbinary -> " + Integer.toBinaryString(result) + "\ndecimal -> " + result);
    }

    static void rightBitShift() {

        int result = A >> 1;
        System.out.println("Right shift >>: \nbinary -> " + Integer.toBinaryString(result) + "\ndecimal -> " + result);
    }

    static void unsignedRightBitShift() {

        int a = -5 >>> 1;
        System.out.println("Unsigned right shift >>>: \nbinary -> " + Integer.toBinaryString(a) + "\ndecimal -> " + a);
    }

    static void assignment() {

        int a = 6;  // 0110
        int b = 3;  // 0011
        int c = 9;  // 1001
        int d = 12; // 1100

        a >>= 1;
        b <<= 1;

        // c &= d;
        // c ^= d;
        c |= d;


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
