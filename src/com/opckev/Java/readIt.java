package com.opckev.Java;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class readIt {
    public static void main(String[] args) {

        try (InputStream input = new FileInputStream("config.properties")) {

            Properties prop = new Properties();

            // load a properties file
            prop.load(input);

            // get the property value and print it out
            System.out.println(prop.getProperty("name"));
            System.out.println(prop.getProperty("age"));

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

}

