package com.stackroute.pe2;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class FolderFileReaderTest {
  FolderFileReader folderFileReader;
  @Before
  public void setUp()  {
    folderFileReader=new FolderFileReader();
  }
  @After
  public void tearDown()  {
    folderFileReader=null;
  }
  @Test  public void givenFoldereShouldReturnContent(){
    //act
    String actualResult=folderFileReader.contentReader("First Program");
    //assert
    assertEquals("First Program",actualResult);
  }
  @Test public void givenAEmptyFolderShouldReturnErrorMessage(){
    //act
    String actualResult=folderFileReader.contentReader("EmptyFolder");
    //assert
    assertEquals("Empty Folder",actualResult);
  }
  @Test public void givenNotExistFileShouldReturnError(){
    //act
    String actualResult=folderFileReader.contentReader("NotFound");
    //assert
    assertEquals("Folder Not Found",actualResult);
  }
}

