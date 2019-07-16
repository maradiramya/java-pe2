package com.stackroute.pe2;

import org.junit.*;

import static org.junit.Assert.*;

public class EvenNumberTest {
    private EvenNumber evenNumber;

    @Before
    public void setup()
    {
        //arrange
        System.out.println("Inside Before");
        this.evenNumber=new EvenNumber();

    }
    @After
    public void tearDown()
    {
        System.out.println("Inside After");
        evenNumber=null;

    }

    @Test
    //this testcase check for given number is EvenNumber
    public void givenNumberShouldReturnEvenNumber()
    {
          //act
        boolean actualResults=evenNumber.isEven(20);
        boolean expectedResult=true;
        //assert
        assertEquals(expectedResult,actualResults);

    }
    @Test
    //this testcase check for given number is not a EvenNumber
    public void givenNumberShouldNotReturnEvenNumber()
    {    //act
        boolean actualResult=evenNumber.isEven(21);
        boolean expectedResult=true;
        //assert
        assertNotEquals(expectedResult,actualResult);

    }
    @Test
    //this testcase check for ErrorMessege if given input is wrong
    public void givenNumberShouldReturnErrorMessage()
    {
        String actualResults=evenNumber.isEven(" ");
        assertEquals("enter correct input",actualResults);
    }
}