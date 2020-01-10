package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzGameTest {
  @Test
  public void should_return_Fizz_given_a_number_contains_7_and_is_multiples_of_3() {
      assertEquals(FizzBuzzGame.fizzBuzz(75), "Fizz");
      assertEquals(FizzBuzzGame.fizzBuzz(174), "Fizz");
  }
}