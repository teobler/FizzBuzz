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

  @Test
  public void should_return_Fizz_given_a_number_contains_3_and_not_match_any_other_previous_conditions() {
    assertEquals(FizzBuzzGame.fizzBuzz(33), "Fizz");
    assertEquals(FizzBuzzGame.fizzBuzz(13), "Fizz");
  }

  @Test
  public void should_return_FizzWhizz_given_a_number_is_multiples_of_37_and_not_match_any_other_previous_conditions() {
    assertEquals(FizzBuzzGame.fizzBuzz(21), "FizzWhizz");
    assertEquals(FizzBuzzGame.fizzBuzz(189), "FizzWhizz");
  }

  @Test
  public void should_return_Fizz_given_a_number_is_multiples_of_3_and_not_match_any_other_previous_conditions() {
    assertEquals(FizzBuzzGame.fizzBuzz(3), "Fizz");
    assertEquals(FizzBuzzGame.fizzBuzz(6), "Fizz");
    assertEquals(FizzBuzzGame.fizzBuzz(9), "Fizz");
  }

  @Test
  public void should_return_Buzz_given_a_number_is_multiples_of_5_and_not_match_any_other_previous_conditions() {
    assertEquals(FizzBuzzGame.fizzBuzz(5), "Buzz");
    assertEquals(FizzBuzzGame.fizzBuzz(10), "Buzz");
    assertEquals(FizzBuzzGame.fizzBuzz(20), "Buzz");
  }

  @Test
  public void should_return_Whizz_given_a_number_is_multiples_of_7_and_not_match_any_other_previous_conditions() {
    assertEquals(FizzBuzzGame.fizzBuzz(7), "Whizz");
    assertEquals(FizzBuzzGame.fizzBuzz(14), "Whizz");
    assertEquals(FizzBuzzGame.fizzBuzz(28), "Whizz");
  }

  @Test
  public void should_return_number_string_given_a_number_does_not_match_any_conditions() {
    assertEquals(FizzBuzzGame.fizzBuzz(37), "37");
  }
}
