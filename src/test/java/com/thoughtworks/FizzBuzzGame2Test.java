package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzGame2Test {
  @Test
  public void should_return_Fizz_given_a_number_contains_7_and_is_multiple_of_3() {
    assertEquals("Fizz", FizzBuzzGame2.fizzBuzz(75));
    assertEquals("Fizz", FizzBuzzGame2.fizzBuzz(174));
  }

  @Test
  public void should_return_Whizz_given_a_number_contains_7_and_is_multiple_of_7() {
    assertEquals("Whizz", FizzBuzzGame2.fizzBuzz(77));
    assertEquals("Whizz", FizzBuzzGame2.fizzBuzz(7));
  }
}
