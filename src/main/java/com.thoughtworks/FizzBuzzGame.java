package com.thoughtworks;

public class FizzBuzzGame {
  public static String fizzBuzz(Integer number) {
    if (number % 3 == 0) {
      return "Fizz";
    }

    if (number % 5 == 0) {
      return "Buzz";
    }

    return String.valueOf(number);
  }
}
