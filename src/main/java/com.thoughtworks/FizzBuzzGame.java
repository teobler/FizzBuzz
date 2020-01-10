package com.thoughtworks;

public class FizzBuzzGame {
  public static String fizzBuzz(Integer number) {
    String stringNumber = String.valueOf(number);

    if (stringNumber.contains("7") && number % 7 == 0 && number % 3 == 0) {
      return "FizzWhizz";
    }

    if (stringNumber.contains("7") && number % 3 == 0) {
      return "Fizz";
    }

    if (stringNumber.contains("7") && number % 7 == 0) {
      return "Whizz";
    }

    if (stringNumber.contains("5") && number % 5 == 0) {
      return "Buzz";
    }

    return stringNumber;
  }
}
