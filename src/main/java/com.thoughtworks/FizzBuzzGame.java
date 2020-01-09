package com.thoughtworks;

public class FizzBuzzGame {
  public static String fizzBuzz(Integer number) {
    if (number % 3 == 0) {
      return "Fizz";
    }

    return String.valueOf(number);
  }
}
