package com.stackroute.pe2;

import org.junit.*;

import static org.junit.Assert.*;

public class MemberTest {
    private Member memberValues;

    @Before
    public static void setup()
    {
        //arrange
        System.out.println("Inside Before");

    }
    @After
    public static void tearDown()
    {

        System.out.println("Inside After");
    }

    @Test
    //this testcase check for the given input should be converted to string
    public void givenArrayShouldReturnMemberValue()
    {
        //act
        String[] actualResult=memberValues.memberValues("Harry Potter",30,2500.3);
        String[] expectedResult={"Harry Poter","30","2500.3"};
        //assert
        assertArrayEquals(expectedResult,actualResult);

    }
    @Test
    //this testcase check for ErrorMessege if given input is wrong
    public void givenNumberandnullShouldReturnErrorMessage()
    {
        //act
        String[] actualResult=memberValues.memberValues(null);
        assertNotNull(actualResult);
        //assert
        assertEquals("null value not allowed",actualResult);

    }
}