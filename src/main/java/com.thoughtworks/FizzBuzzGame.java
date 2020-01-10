package com.thoughtworks;

public class FizzBuzzGame {
    public static String fizzBuzz(Integer number) {
        String stringNumber = String.valueOf(number);

        if (stringNumber.contains("7") && number % 3 == 0) {
            return "Fizz";
        }

        return stringNumber;
    }
}
