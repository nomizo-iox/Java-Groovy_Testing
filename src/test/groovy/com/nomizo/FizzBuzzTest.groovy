package com.nomizo

import org.junit.Before
import org.junit.Test

class FizzBuzzTest {

    def fizBuzz

    @Before
    void setup() {
        fizBuzz = new FizzBuzz()
    }

    @Test
    void 'should be fizz'() {
        assert fizBuzz.play(3) == "Fizz"
    }

    @Test
    void 'should be buzz'() {
        assert fizBuzz.play(5) == "Buzz"
    }
}
