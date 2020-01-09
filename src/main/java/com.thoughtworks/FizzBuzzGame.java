package com.thoughtworks;

public class FizzBuzzGame {
  public static String fizzBuzz(Integer number) {
    if (number % 3 == 0 && number % 5 == 0 && number % 7 == 0) {
      return "FizzBuzzWhizz";
    }

    if (number % 5 == 0 && number % 7 == 0) {
      return "BuzzWhizz";
    }

    if (number % 3 == 0 && number % 7 == 0) {
      return "FizzWhizz";
    }

    if (number % 3 == 0 && number % 5 == 0) {
      return "FizzBuzz";
    }

    if (number % 3 == 0) {
      return "Fizz";
    }

    if (number % 5 == 0) {
      return "Buzz";
    }

    if (number % 7 == 0) {
      return "Whizz";
    }

    return String.valueOf(number);
  }
}
