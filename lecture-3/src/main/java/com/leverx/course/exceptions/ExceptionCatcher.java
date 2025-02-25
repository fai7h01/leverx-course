package com.leverx.course.exceptions;

import java.io.IOException;

public class ExceptionCatcher {

    public void write(Object object, String fileName) throws IOException, ReflectiveOperationException {

    }

    public static void main(String[] args) {
        ExceptionCatcher exceptionCatcher = new ExceptionCatcher();

        try {
            exceptionCatcher.write(null, "fileThatNotExists");
        } catch (IOException e) {

        } catch (ReflectiveOperationException e) {

        }


    }
}
