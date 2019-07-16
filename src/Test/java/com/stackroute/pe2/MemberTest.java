package com.stackroute.pe2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberTest {
    private static Member memberVar;

    @BeforeClass
    public static void setup()
    {
        System.out.println("Before Class");
        memberVar = new Member();

    }
    @AfterClass
    public static void tearDown()
    {
        System.out.println("After Class");
        memberVar=null;
    }

    @Test
    public void givenArrayShouldReturnMemberValue() {
        String[] actualResult=memberVar.memberValues("Harry Potter",30,2500.3);
        String[] expectedResult={"Harry Poter","30","2500.3"};
        assertArrayEquals(expectedResult,actualResult);

    }
    @Test
    public void givenNumberandnullShouldReturnErrorMessage()
    {
        String[] actualResult=memberVar.memberValues(null);
        assertNotNull(actualResult);
        assertEquals("null value not allowed",actualResult);

    }
}