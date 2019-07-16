package com.stackroute.pe2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOfFourTest {
    private static PowerOfFour var;
    @BeforeClass
    public static void setup()
    {
        System.out.println("Before Class");
        var=new PowerOfFour();

    }
    @AfterClass
    public static void tearDown()
    {
        System.out.println("After Class");
        var=null;
    }

    @Test
    public void givenNumberShouldReturnPowerofFour() {
        int num=64;
        String actualResult=var.powerOfFour(num);
        String expectedResult="the given number is power of four";
        assertEquals(expectedResult,actualResult);


    }
    @Test
    public void givenNumberShouldNotReturnPowerofFour() {
        int number=15;
        String actualResult=var.powerOfFour(number);
        String expectedResult="the given number is not a power of four";
        assertEquals(expectedResult,actualResult);


    }
    @Test
    public void givennumberAndnullShouldReturnErrorMassege() {
        String actualResults = var.powerOfFour(0);
        assertNotNull(actualResults);
        assertEquals("null values are not allowed", actualResults);
    }
}