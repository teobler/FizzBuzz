package com.thoughtworks;

public class FizzBuzzGame2 {
  public static String fizzBuzz(Integer number) {
    String stringNumber = number.toString();

    if (stringNumber.contains("7")) {
      return handleCaseContains7(number);
    }

    if (stringNumber.contains("5")) {
      return handleCaseContains5(number);
    }

    if (stringNumber.contains("3")) {
      return "Fizz";
    }

    return handleCaseDoesNotContains357(number);
  }

  private static String handleCaseDoesNotContains357(Integer number) {
    String result = "";

    if (number % 3 == 0) {
      result += "Fizz";
    }

    if (number % 5 == 0) {
      result += "Buzz";
    }

    if (number % 7 == 0) {
      result += "Whizz";
    }

    return "".equals(result) ? number.toString() : result;
  }

  private static String handleCaseContains5(Integer number) {
    String result = "";

    if (number % 5 == 0) {
      result += "Buzz";
    }

    if (number % 7 == 0) {
      result += "Whizz";
    }

    return "".equals(result) ? number.toString() : result;
  }

  private static String handleCaseContains7(Integer number) {
    String result = "";

    if (number % 3 == 0) {
      result += "Fizz";
    }

    if (number % 7 == 0) {
      result += "Whizz";
    }

    if (number.toString().contains("3") && "".equals(result)) {
      result = "Fizz";
    }

    return "".equals(result) ? number.toString() : result;
  }
}
