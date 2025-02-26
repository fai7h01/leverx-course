package com.leverx.course.io;

import java.io.*;

public class IOExample2 {

    private static final int BLOCK_SIZE = 4096;

    public static void main(String[] args) {

        File inputFile = new File("input.txt");
        File outputFile = new File("output.txt");

        try (InputStream in = new FileInputStream(inputFile);
             OutputStream out = new FileOutputStream(outputFile)) {

            copy(in, out);
            System.out.println("File copied successfully");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void copy(InputStream in, OutputStream out) throws IOException {
        byte[] bytes = new byte[BLOCK_SIZE];
        int len;
        while ((len = in.read(bytes)) != -1) {
            out.write(bytes, 0, len);
        }

    }

}
