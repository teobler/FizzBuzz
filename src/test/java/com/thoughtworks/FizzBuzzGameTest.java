package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzGameTest {
  @Test
  public void should_return_number_it_self_if_number_does_not_match_any_condition() {
    assertEquals(FizzBuzzGame.fizzBuzz(1), "1");
  }

  @Test
  public void should_return_Fizz_given_number_is_multiples_of_3() {
    assertEquals(FizzBuzzGame.fizzBuzz(33), "Fizz");
  }

  @Test
  public void should_return_FizzWhizz_given_number_is_multiples_of_3_and_7() {
    assertEquals(FizzBuzzGame.fizzBuzz(21), "FizzWhizz");
  }

  @Test
  public void should_return_Fizz_given_number_contains_3() {
    assertEquals(FizzBuzzGame.fizzBuzz(13), "Fizz");
  }

  @Test
  public void should_return_BuzzWhizz_given_number_contains_5() {
    assertEquals(FizzBuzzGame.fizzBuzz(35), "BuzzWhizz");
  }

  @Test
  public void should_return_Fizz_given_number_contains_7() {
    assertEquals(FizzBuzzGame.fizzBuzz(75), "Fizz");
  }
}
