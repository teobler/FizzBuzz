package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzGameTest {
  @Test
  public void should_return_Fizz_given_a_number_contains_7_and_is_multiples_of_3() {
    assertEquals(FizzBuzzGame.fizzBuzz(75), "Fizz");
    assertEquals(FizzBuzzGame.fizzBuzz(174), "Fizz");
  }

  @Test
  public void should_return_Whizz_given_a_number_contains_7_and_is_multiples_of_7() {
    assertEquals(FizzBuzzGame.fizzBuzz(77), "Whizz");
    assertEquals(FizzBuzzGame.fizzBuzz(7), "Whizz");
  }

  @Test
  public void should_return_FizzWhizz_given_a_number_contains_7_and_is_multiples_of_3_and_7() {
    assertEquals(FizzBuzzGame.fizzBuzz(567), "FizzWhizz");
  }

  @Test
  public void should_return_Buzz_given_a_number_contains_5_and_is_multiples_of_5() {
    assertEquals(FizzBuzzGame.fizzBuzz(55), "Buzz");
  }

  @Test
  public void should_return_BuzzWhizz_given_a_number_contains_5_and_is_multiples_of_7() {
    assertEquals(FizzBuzzGame.fizzBuzz(35), "BuzzWhizz");
  }
}
