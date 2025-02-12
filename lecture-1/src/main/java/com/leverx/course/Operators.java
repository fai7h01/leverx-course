package com.leverx.course;

public class Operators {

    public static void main(String[] args) {

        bitwiseAnd();

    }

    static void bitwiseAnd() {

        int a = 9; // 1001
        int b = 12; // 1100

        System.out.println(a + " in binary: " + Integer.toBinaryString(a));
        System.out.println(b + " in binary: " + Integer.toBinaryString(b));

        int result = a & b; // RESULT: 8 => if both bits are 1 then its 1, otherwise 0,
                            // so answer is 1000, which is 8 in decimal
        System.out.println(result);
    }

}
