package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordFrequencyTest {
  private WordFrequency wordFrequency;
  @Before
  // This methods runs, before running any one of the test case
  // This method is used to initialize the required variables
  public void setUp() throws Exception {
    this.wordFrequency=new WordFrequency();
  }

  @After
  // This method runs, after running all the test cases
  // This method is used to clear the initialized variables
  public void tearDown() throws Exception {
    wordFrequency=null;
  }

  @Test
  public void givenFileShouldReturnWordFrequency() {
    //act
    String actualResult=wordFrequency.("file.txt");
    //assert
    assertEquals("Content of the file",actualResult);

  }
  @Test
  public void givenFileShouldReturnErrorMessage(){
    //act
    String actualResult=wordFrequency.(0);
    //assert
    assertEquals("Error",actualResult);
  }
}
