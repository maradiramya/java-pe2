package com.stackroute.pe2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumberTest {
    private static EvenNumber evennum;
    @BeforeClass
    public static void setup()
    {
        System.out.println("After Class");
         evennum = new EvenNumber();
    }
    @AfterClass
    public static void tearDown()
    {
        System.out.println("After Class");
        evennum=null;
    }

    @Test
    public void givenNumberShouldReturnEvenNumber() {

        boolean actualResults=evennum.isEven(20);
        boolean expectedResult=true;
        assertEquals(expectedResult,actualResults);

    }
    @Test
    public void givenNumberShouldNotReturnEvenNumber()
    {
        boolean actualResult=evennum.isEven(21);
        boolean expectedResult=true;
        assertNotEquals(expectedResult,actualResult);

    }
}