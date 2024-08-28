package com.Test.service;

import org.junit.jupiter.api.*;

public class CalculatorServiceTestJunit5 {


    @BeforeAll
    public static void init(){
        System.out.println("Working before each case!!");
    }

    @BeforeEach
    public void eachTestCase(){

        System.out.println("Before Each");
    }

    @AfterEach
    public void afterEachTestCase(){
        System.out.println("After Each");
    }

    @AfterAll
    public static void cleanUp(){
        System.out.println("After All test Case!");
    }
    @Test
    @DisplayName("Number Adder")
    public void addTwoNumbersTest(){

        int result=CalculatorService.addTwoNumbers(5,7);
        int expectedResult=12;
        Assertions.assertEquals(expectedResult,result,"Test Failed!");
        System.out.println("first case!");
    }
    @Test
    @Disabled
    public void addAnyNumbersTest(){
        int result=CalculatorService.sumAnyNumbers(12,22,33,44);
        int expectedResult=111;
        Assertions.assertEquals(expectedResult,result);
        System.out.println("Second Case!");

    }
    //Assertions method are used to validate the value it takes expected resulted and compare with the actual
    //result to pass or fail the test.

}
