package com.stackroute.pe2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReversePallindromeTest {
    private static ReversePallindrome reversepallindrome;
    @BeforeClass
    public static void setup()
    {
        System.out.println("Before Class");
        reversepallindrome=new ReversePallindrome();

    }
    @AfterClass
            public static void tearDown()
    {
        System.out.println("After Class");
        reversepallindrome=null;
    }


    @Test
    public void givenNumberShouldReturnReverseString()
    {
        String s="aba";
        String actualResult=reversepallindrome.reversePallindrome(s);
        String expectedResult="is a pallindrome";
        assertEquals(expectedResult,actualResult);

    }
    @Test
    public void givenNumberShouldNotReturnTheReverseString()
    {
        String s1="abcd";
        String actualResult=reversepallindrome.reversePallindrome(s1);
        String expectedResult="is not a pallindrome";
        assertEquals(expectedResult,actualResult);

    }
    @Test
    public void givennumberAndnullShouldReturnErrorMassege()
    {
        String actualResults=reversepallindrome.reversePallindrome(null);
        assertNotNull(actualResults);
        assertEquals("null values are not allowed",actualResults);
    }

}