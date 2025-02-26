package com.leverx.course.io;

import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class IOExample {

    public static void main(String[] args) throws IOException {

        // 1. From file
//        InputStream inputStream1 = Files.newInputStream(Paths.get("inFile"));
//        OutputStream outputStream1 = Files.newOutputStream(Paths.get("outFile"));

        // 2. from URL
        URL url = new URL("https://leverx.com");
        InputStream inputStream2 = url.openStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream2));

        StringBuilder content = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            content.append(line).append("\n");
        }

        reader.close();
        inputStream2.close();

        System.out.println(content.toString());

        // 3. from/to array of bytes
//        byte[] bytesInput = new byte[]{};
//        InputStream inputStream3 = new ByteArrayInputStream(bytesInput);
//
//        ByteArrayOutputStream outputStream2 = new ByteArrayOutputStream();
//        byte[] bytesOutput = outputStream2.toByteArray();

    }

}
