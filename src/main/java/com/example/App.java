package com.example;

public class App {
    public static String table(int number) {
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= 10; i++) {
            result.append(number).append(" x ").append(i).append(" = ").append(number * i).append("\n");
        }

        return result.toString();
    }
}
