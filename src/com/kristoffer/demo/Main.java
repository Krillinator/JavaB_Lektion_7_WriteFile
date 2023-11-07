package com.kristoffer.demo;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {

        // VARIABLES
        String osName = System.getProperty("os.name").toLowerCase();
        String osNameOneWord = osName.substring(0, osName.indexOf(' '));
        String compUsername = System.getProperty("user.name");

        // DEBUGGING
        System.out.println(osName);
        System.out.println(osNameOneWord);
        System.out.println(compUsername);
        System.out.println(System.getProperty("user.dir")); // Get path of Project

        // Determine OS
        switch (osNameOneWord) {
            case "linux" -> System.out.println("LINUX OS");
            case "mac" -> System.out.println("MAC OS");
            case "windows" -> System.out.println("WINDOWS OS");

            default -> System.out.println("Unknown OS, contact developer for more features");
        }

        // Create Writer
        try (
            Writer writer =
                    new BufferedWriter(
                    new OutputStreamWriter(
                    new FileOutputStream("myFile.txt"), StandardCharsets.UTF_8)
            )
        )

        {
            // Logic
            int age = 5;
            String name = "Benny ";

            writer.write(name + age);  // Write to file

            // TODO - Error Handling
            // TODO - TIPS : Could be a good in-depth unit test

        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}
