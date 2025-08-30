package org.example.basics01;

public class Hello {
    public static String greet(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name is required");
        }
        String normalized =name.substring(0,1).toUpperCase()+name.substring(1);
        return "Hello, " + normalized+"!";
    }
}
