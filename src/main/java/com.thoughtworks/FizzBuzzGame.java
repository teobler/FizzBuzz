package com.thoughtworks;

public class FizzBuzzGame {
  public static String fizzBuzz(Integer number) {
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
