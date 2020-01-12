package com.thoughtworks;

public class FizzBuzzGame {
  public static String fizzBuzz(Integer number) {
    String stringNumber = String.valueOf(number);

    if (isStringNumberContains357(stringNumber)) {
      return handleStringNumberContains357(stringNumber, number);
    }

    return handleMultipleCase(number);
  }

  private static boolean isStringNumberContains357(String stringNumber) {
    return stringNumber.contains("3") || stringNumber.contains("5") || stringNumber.contains("7");
  }

  private static String handleStringNumberContains357(String stringNumber, Integer number) {
    String result = "";

    if (stringNumber.contains("7")) {
      if (number % 3 == 0) {
        result = result + "Fizz";
      }

      if (number % 7 == 0) {
        result = result + "Whizz";
      }

      if (!"".equals(result)) {
        return result;
      }
    }

    if (stringNumber.contains("5") && !stringNumber.contains("7")) {
      if (number % 5 == 0) {
        result = result + "Buzz";
      }

      if (number % 7 == 0) {
        result = result + "Whizz";
      }

      if (!"".equals(result)) {
        return result;
      }
    }

    if (stringNumber.contains("3") && !stringNumber.contains("5")) {
      return "Fizz";
    }

    return stringNumber;
  }

  private static String handleMultipleCase(Integer number) {
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

    return "".equals(result) ? String.valueOf(number) : result;
  }
}
