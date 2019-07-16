package com.stackroute.pe2;

import org.junit.*;

import static org.junit.Assert.*;

public class ReversePallindromeTest {
    private ReversePallindrome reversePallindrome;
    @Before
    public void setup()
    {
        //arrange
        System.out.println("Inside Before");
      this.reversePallindrome=new ReversePallindrome();

    }
    @After
    public  void tearDown()
    {
        System.out.println("Inside After");
        reversePallindrome=null;
    }


    @Test
    //this testcase checks for the  given input is pallindrome
    public void givenStringShouldReturnPallindromeString()
    {
        //act
        String actualResult=reversePallindrome.reversePallindrome("aba");
        String expectedResult="is a pallindrome";
        //assert
        assertEquals(expectedResult,actualResult);

    }
    @Test
    //this testcase checks for the given input is not a pallindrome
    public void givenStringShouldReturnCounterPallindromeString()
    {
        //act
        String actualResult=reversePallindrome.reversePallindrome("abcd");
        String expectedResult="is not a pallindrome";
        //assert
        assertEquals(expectedResult,actualResult);

    }
    @Test
    //this testcase checks for  ErrorMessage if given input is incorrect
    public void givenStringAndNullShouldReturnErrorMessage()
    {
        //act
        String actualResults=reversePallindrome.reversePallindrome(null);
        assertNotNull(actualResults);
        //assert
        assertEquals("null values are not allowed",actualResults);
    }
    

}