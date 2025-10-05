package com.luv2code.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzDemo {

    @Test
    public void testDivisbleByThree(){
        String expected="Fizz";

        Assertions.assertEquals(expected,FizzBuzz.compute(6));
    }

    @Test
    public void testDivisbleByFive(){
        String expected="Buzz";

        Assertions.assertEquals(expected,FizzBuzz.compute(10));
    }

    @Test
    public void testDivisbleByFiveAndThree(){
        String expected="FizzBuzz";

        Assertions.assertEquals(expected,FizzBuzz.compute(15));
    }

    @Test
    public void testForNOtDivisbleByFiveAndThree(){
        int expected=4;

        Assertions.assertEquals(expected,Integer.parseInt(FizzBuzz.compute(4)));
    }
}
