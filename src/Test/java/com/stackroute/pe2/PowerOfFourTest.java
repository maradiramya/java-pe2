package com.stackroute.pe2;

import org.junit.*;

import static org.junit.Assert.*;

public class PowerOfFourTest {
    private PowerOfFour powerOfFour;
    @Before
    public void setup()
    {
        //arrange
        System.out.println("Inside Before");
        this.powerOfFour=new PowerOfFour();

    }
    @After
    public void tearDown()
    {
        System.out.println("Inside After");
        powerOfFour=null;
    }

    @Test
    //this testcase checks for given input is power of four
    public void givenNumberShouldReturnPowerofFour()
    {
        //act
        String actualResult=powerOfFour.powerOfFour(64);
        String expectedResult="the given number is power of four";
        //assert
        assertEquals(expectedResult,actualResult);


    }
    @Test
    //this testcase checks for given input is not a power of four
    public void givenNumberShouldNotReturnPowerofFour()
    {
        //act
        String actualResult=powerOfFour.powerOfFour(15);
        String expectedResult="the given number is not a power of four";
        //assert
        assertEquals(expectedResult,actualResult);


    }
    @Test
    //this testcase checks for ErrorMessage if given input is incorrect
    public void givennumberAndnullShouldReturnErrorMassege()
    {
        //act
        String actualResults = powerOfFour.powerOfFour(0);
        assertNotNull(actualResults);
        //assert
        assertEquals("null values are not allowed", actualResults);
    }
    @Test
    //this testcase checks for ErrorMessage if given input is wrong
    public void givenStringShouldReturnErrorMassege()
    {
        //act
        String actualResults=powerOfFour.powerOfFour("abc");
        //assert
        assertEquals("enter correct input",actualResults);


    }
}