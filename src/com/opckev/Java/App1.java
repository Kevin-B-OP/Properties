package com.opckev.Java;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class App1 {

    public static void main(String[] args) {

        try (OutputStream output = new FileOutputStream("config.properties")) {

            Properties prop = new Properties();

            prop.setProperty("name", "Kevin");
            prop.setProperty("age", "28");

            prop.store(output, null);

            System.out.println(prop);

        } catch (IOException io) {
            io.printStackTrace();
        }

    }
}