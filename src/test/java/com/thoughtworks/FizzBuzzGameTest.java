package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzGameTest {
  @Test
  public void should_return_Fizz_given_number_is_multiples_of_3() {
    assertEquals(FizzBuzzGame.fizzBuzz(33), "Fizz");
  }

  @Test
  public void should_return_Buzz_given_number_is_multiples_of_5() {
    assertEquals(FizzBuzzGame.fizzBuzz(55), "Buzz");
  }

  @Test
  public void should_return_Whizz_given_number_is_multiples_of_7() {
    assertEquals(FizzBuzzGame.fizzBuzz(77), "Whizz");
  }

  @Test
  public void should_return_FizzBuzz_given_number_is_multiples_of_3_and_5() {
    assertEquals(FizzBuzzGame.fizzBuzz(15), "FizzBuzz");
  }

  @Test
  public void should_return_FizzWhizz_given_number_is_multiples_of_3_and_7() {
    assertEquals(FizzBuzzGame.fizzBuzz(21), "FizzWhizz");
  }

  @Test
  public void should_return_BuzzWhizz_given_number_is_multiples_of_5_and_7() {
    assertEquals(FizzBuzzGame.fizzBuzz(35), "BuzzWhizz");
  }

  @Test
  public void should_return_FizzBuzzWhizz_given_number_is_multiples_of_3_and_5_and_7() {
    assertEquals(FizzBuzzGame.fizzBuzz(105), "FizzBuzzWhizz");
  }
}
