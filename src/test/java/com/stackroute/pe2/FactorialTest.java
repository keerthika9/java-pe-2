package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {
  Factorial factorial;
  @Before
  public void setUp() throws Exception {
  }

  @After
  public void tearDown() throws Exception {
  }
  @Test public void givenNumberShouldRetunFactorial(){
    //act
    Integer actualResult=factorial.(6);
    //assert
    assertEquals("720",actualResult);
  }
  @Test public void givenZeroShoulReturnOne(){
    //act
    Integer actualResult=factorial.(0);
    //assert
    assertEquals("1",actualResult);
  }
}
