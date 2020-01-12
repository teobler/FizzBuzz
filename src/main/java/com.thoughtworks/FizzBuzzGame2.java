package com.thoughtworks;

public class FizzBuzzGame2 {
  public static String fizzBuzz(Integer number) {
    String stringNumber = number.toString();

    if (stringNumber.contains("7")) {
      return handleCaseContains7(number, stringNumber);
    }

    return number.toString();
  }

  private static String handleCaseContains7(Integer number, String stringNumber) {
    String result = "";

    if (number % 3 == 0) {
      result += "Fizz";
    }

    if (number % 7 == 0) {
      result += "Whizz";
    }

    if (stringNumber.contains("3") && "".equals(result)) {
      result = "Fizz";
    }

    return "".equals(result) ? number.toString() : result;
  }
}
