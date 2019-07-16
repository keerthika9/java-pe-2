package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.security.InvalidParameterException;

import static org.junit.Assert.*;

public class PowerOfFourTest {

 private PowerOfFour powerOfFour;

  @Before
  public void setUp() {

    this.powerOfFour = new PowerOfFour();
  }

  @After
  public void tearDown()  {

    powerOfFour= null;
  }

  @Test
  public void givenAnIntegerShouldReturnPowerOfFour() {
    //act
    String actualResult = powerOfFour.(64);
    //assert
    assertEquals("Given integer is power of 4",actualResult);
  }

  @Test
  public void givenAnIntegerShouldReturnNotAPowerOfFour() {
    //act
    String actualResult = powerOfFour.(20);
    //assert
    assertEquals("Given integer is not a power of 4",actualResult);
  }

  @Test
  public void givenANegativeIntegerShouldReturnIsPowerOfFour() {
    //act
    String actualResult = powerOfFour.(-64);
    //assert
    assertEquals("Given integer is power of 4",actualResult);
  }
  @Test(expected = InvalidParameterException.class)
  public void givenLongIntegerShouldThrowInvalidParameterException() {
    //act
    String actualResult = powerOfFour.(1111111111);
  }

  @Test(expected = NullPointerException.class)
  public void givenNullShouldThrowNullPointerException() {
    //act
    String actualResult = powerOfFour.(null);
  }

}
