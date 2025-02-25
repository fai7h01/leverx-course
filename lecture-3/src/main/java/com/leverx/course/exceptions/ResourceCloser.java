package com.leverx.course.exceptions;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

public class ResourceCloser {

    public static void main(String[] args) {

        List<String> lines = Arrays.asList("Sun is 8 light minutes(150m km) away from earth", "Mercury is smallest planet.");
//        PrintWriter out = null;
//        try {
//            out = new PrintWriter("output.txt");
//            for (String line : lines) {
//                out.println(line.toLowerCase());
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } finally {
//            if (out != null) {
//                out.close();
//            }
//        }

        try (PrintWriter autoCloseableOut = new PrintWriter("output.txt")){
            lines.forEach(line -> autoCloseableOut.println(line.toLowerCase()));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
