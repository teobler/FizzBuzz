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

  private static String handleCaseContains7(Integer number) {
    String result = "";

    result = handleDivide3(number, result);
    result = handleDivide7(number, result);

    if (number.toString().contains("3") && "".equals(result)) {
      result = "Fizz";
    }

    return getResult(number, result);
  }

  private static String handleCaseContains5(Integer number) {
    String result = "";

    result = handleDivide5(number, result);
    result = handleDivide7(number, result);

    return getResult(number, result);
  }

  private static String handleCaseDoesNotContains357(Integer number) {
    String result = "";

    result = handleDivide3(number, result);
    result = handleDivide5(number, result);
    result = handleDivide7(number, result);

    return getResult(number, result);
  }

  private static String handleDivide3(Integer number, String result) {
    if (number % 3 == 0) {
      result += "Fizz";
    }

    return result;
  }

  private static String handleDivide5(Integer number, String result) {
    if (number % 5 == 0) {
      result += "Buzz";
    }

    return result;
  }

  private static String handleDivide7(Integer number, String result) {
    if (number % 7 == 0) {
      result += "Whizz";
    }

    return result;
  }

  private static String getResult(Integer number, String result) {
    return "".equals(result) ? number.toString() : result;
  }
}
