package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }

    public static boolean isPositive(int number) {
        return number >= 0;
    }

    public static int multiply(int number1, int number2) {
        return number1 * number2;
    }

    public static String getFirstLetter(String text) {
        if (text == null || text.isEmpty()) {
            return null;
        }
        return text.substring(0, 1);
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divide by zero");
        }
        return a / b;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}