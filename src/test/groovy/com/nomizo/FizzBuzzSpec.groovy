package com.nomizo

import com.nomizo.model.FizzBuzz
import spock.lang.Specification

class FizzBuzzSpec extends Specification {
    def "should return fizz"() {
        when: 'We are going to play 3'
        def fizzBuzz = new FizzBuzz()
        def play = fizzBuzz.play(3)

        then: 'Should be Fizz'
        assert play, 'Fizz'
    }
}
