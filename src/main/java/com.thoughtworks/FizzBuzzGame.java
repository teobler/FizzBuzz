package com.thoughtworks;

public class FizzBuzzGame {
  public static String fizzBuzz(Integer number) {
    if (isContains357(number)) {
      return handleNumberContains357(number);
    }

    if (isMultiplesOf357(number)) {
      return handleNumberMultiplesOf357(number);
    }

    return String.valueOf(number);
  }

  private static String handleNumberMultiplesOf357(Integer number) {
    String result = "";

    if (number % 3 == 0) {
      result = result + "Fizz";
    }

    if (number % 5 == 0) {
      result = result + "Buzz";
    }

    if (number % 7 == 0) {
      result = result + "Whizz";
    }

    return result;
  }

  private static boolean isMultiplesOf357(Integer number) {
    return number % 3 == 0 || number % 5 == 0 || number % 7 == 0;
  }

  private static boolean isContains357(Integer number) {
    return String.valueOf(number).contains("3")
        || String.valueOf(number).contains("5")
        || String.valueOf(number).contains("7");
  }

  private static String handleNumberContains357(Integer number) {
    if (String.valueOf(number).contains("7")) {
      return "Fizz";
    }

    if (String.valueOf(number).contains("5")) {
      return "BuzzWhizz";
    }

    return "Fizz";
  }
}
