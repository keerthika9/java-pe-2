package com.stackroute.pe2;

import org.junit.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GradesInputTest {
    private static GradesInput gradesInput;

    @Before
    // This methods runs, before running any one of the test case
    // This method is used to initialize the required variables
    public static void setup() {
      gradesInput = new GradesInput();
    }

    @After
    // This method runs, after running all the test cases
    // This method is used to clear the initialized variables
    public static void teardown() {
      gradesInput = null;

    }

    @Test
    public  void givenInputShouldReturnHighestGrade() {
      //act
      int actualResult = gradesInput.(30);
      //assert
      assertEquals("maximum number", actualResult);
    }

    @Test
    public  void givenInputShouldReturnLowestGrade(){
      //act
      int actualResult=gradesInput.(10);
      //assert
      assertEquals("minimum number",actualResult);
    }
    @Test
    public  void givenInputShouldReturnAverage(){
      //act
      int actualResult=gradesInput.(15);
      //assert
      assertEquals("average number",actualResult);
    }
  @Test
  public void givenNumberMoreThan1000ShouldReturnError(){
      //act
    String actualResult=gradesInput.(150);
    //assert
    assertEquals("Number should not be greater than 1000",actualResult);

  }
  @Test
  public void givenZeroShouldReturnErrorMessage(){
      //act
    String actualResult=gradesInput.(0);
    //assert
    assertEquals("Error",actualResult);
  }

  }


}
