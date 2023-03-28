package com.katas.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzbuzzTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void fizzbuzzReturnsFizzIfNumIsDivisibleBy3() {
        var fizzbuzz = new Fizzbuzz();
        var result = fizzbuzz.fizzbuzz(6);
        assertEquals("Fizz", result);
    }
    @Test
    void fizzbuzzReturnsBuzzIfNumIsDivisibleBy5() {
        var fizzbuzz = new Fizzbuzz();
        var result = fizzbuzz.fizzbuzz(10);
        assertEquals("Buzz", result);
    }
}