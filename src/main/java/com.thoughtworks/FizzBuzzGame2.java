package com.thoughtworks;

public class FizzBuzzGame2 {
  public static String fizzBuzz(Integer number) {
    String stringNumber = number.toString();

    if (stringNumber.contains("7") && number % 7 == 0 && number % 3 == 0) {
      return "FizzWhizz";
    }

    if (stringNumber.contains("7") && number % 3 == 0) {
      return "Fizz";
    }

    if (stringNumber.contains("7") && number % 7 == 0) {
      return "Whizz";
    }

    return number.toString();
  }
}
