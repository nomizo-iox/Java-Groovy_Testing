package com.nomizo

import com.nomizo.model.FizzBuzz
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class FizzBuzzTest {

    def fizBuzz

    @BeforeEach
    void setup() {
        fizBuzz = new FizzBuzz()
    }

    @Test
    @DisplayName('Fizz Test')
    void 'should be fizz'() {
        assert fizBuzz.play(3) == "Fizz"
    }

    @Test
    @DisplayName('Fizz Test')
    void 'should not be fizz'() {
        assert fizBuzz.play(3) != "Fizz"
    }

    @Test
    @DisplayName('Buzz Test')
    void 'should be buzz'() {
        assert fizBuzz.play(5) == "Buzz"
    }

    @Test
    void 'should be FizBuzz'() {
        assert fizBuzz.play(1) == "FizBuzz"
    }
}
