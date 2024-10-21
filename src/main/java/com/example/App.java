package com.example;

public class App {
    public static void table(int number) {
        int result;

        for (int i = 1; i <= 10; i++) {
            result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }
    }
}
