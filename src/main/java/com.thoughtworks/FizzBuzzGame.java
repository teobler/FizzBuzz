package com.thoughtworks;

public class FizzBuzzGame {
  public static String fizzBuzz(Integer number) {
    String stringNumber = String.valueOf(number);
    String result = "";

    if (stringNumber.contains("7")) {
      if (number % 3 == 0) {
        result = result + "Fizz";
      }

      if (number % 7 == 0) {
        result = result + "Whizz";
      }

      return result;
    }

    if (stringNumber.contains("5")) {
      if (number % 5 == 0) {
        result = result + "Buzz";
      }

      if (number % 7 == 0) {
        result = result + "Whizz";
      }

      return result;
    }

    if (stringNumber.contains("3")) {
      result = result + "Fizz";

      return result;
    }

    return stringNumber;
  }
}
