package com.leverx.course.exceptions;

public class FinallyContent {

    private String methodWithFinally() {
        try {
            System.exit(0);
        } finally {
            System.out.println("finally block");
        }
        return "method return";
    }

    public static void main(String[] args) {

        FinallyContent finallyContent = new FinallyContent();
        System.out.println(finallyContent.methodWithFinally());

    }

}
