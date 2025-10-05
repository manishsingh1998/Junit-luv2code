package com.luv2code.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class FizzBuzzCsvDemo {


    @ParameterizedTest(name = "value={0},expected={1}")
    @CsvFileSource(resources = "/test-file-fizzbuzz.csv")
    void testFizzBuzzCsv(int value,String expected){

        Assertions.assertEquals(expected,FizzBuzz.compute(value));
    }
}
