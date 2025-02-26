package com.leverx.course.io;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class IOExample3 {

    public static void main(String[] args) throws IOException {

        InputStream inputStream = null;
        Reader reader = new InputStreamReader(inputStream, StandardCharsets.UTF_16);

        // (from 0 to 65_536 or -1)
        int ch = reader.read();

        // for short text
        String content = Files.readString(
                Paths.get("someShortFile"), StandardCharsets.UTF_16);

        // read line by line
        try (Stream<String> lines = Files.lines(Paths.get("someFile"))) {


        }

        // using scanner to read numbers or words
        try (Scanner sc = new Scanner(new File("fileWithNumbers"))) {
            while (sc.hasNextLong()) {
                long l = sc.nextLong();
            }
        }

        // using buffered reader
        try (BufferedReader br = Files.newBufferedReader(
                Paths.get("logFile"), StandardCharsets.UTF_16
        )) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        }
    }

}
