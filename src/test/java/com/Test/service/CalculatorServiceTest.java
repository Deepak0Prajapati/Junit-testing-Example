//package com.Test.service;
//
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//
//public class CalculatorServiceTest {
//    //test method
//
//    int counter=0;
//
//    @Before
//    public void beforeEach(){
//        System.out.println("Before each test case");
//        counter=0;
//    }
//
//    @Test(timeout = 2000)
//    public void addTwoNumbersTest() throws InterruptedException {
//        for (int i=1;i<20;i++){
//            counter+=i;
//        }
//        //Thread.sleep(3000);
//        System.out.println(counter);
//       int result= CalculatorService.addTwoNumbers(12,45);
//       int expected=57;
//        Assert.assertEquals(expected,result);
//
//    }
//
//    @Test
//    public void sumAnyNumbersTest(){
//        for (int i=1;i<100;i++){
//            counter+=i;
//        }
//        System.out.println(counter);
//        int result=CalculatorService.sumAnyNumbers(2,7,8,9);
//        int expected =26;
//        Assert.assertEquals(expected,result);
//    }
//
//    //anotation
//    //@test
//    //@before
//    //@after
//    //@beforeclass
//    //@afterclass
//    //@test(timeout=2000)
//
//}
