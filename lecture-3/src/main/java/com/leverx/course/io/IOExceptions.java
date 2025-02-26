package com.leverx.course.io;

import java.io.*;
import java.net.URL;

public class IOExceptions {

    public static void main(String[] args) {

        URL url = null;

        InputStream inputStream = null;

        try {
            inputStream = url.openStream();
            OutputStream out = new FileOutputStream("someOutputFile");
            try {
                byte[] buf = new byte[4096];
                int len;
                while ((len = inputStream.read(buf)) >= 0) {
                    out.write(buf, 0, len);
                }
            } catch (IOException e) {

            } finally {
                try {
                    out.close();
                } catch (IOException e) {

                }
            }
        } catch (IOException e) {

        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {

            }
        }

    }

}
