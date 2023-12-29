/**

@file CarMaintenanceTest.java
@brief This file contains the test cases for the CarMaintenance class.
@details This file includes test methods to validate the functionality of the CarMaintenance class. It uses JUnit for unit testing.
*/
package com.test_source.car_maintenance;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.source.car_maintenance.CarMaintenance;

/**

@class CarMaintenanceTest
@brief This class represents the test class for the CarMaintenance class.
@details The CarMaintenanceTest class provides test methods to verify the behavior of the CarMaintenance class. It includes test methods for addition, subtraction, multiplication, and division operations.
@author ugur.coruh
*/
public class CarMaintenanceTest {
	String testString;
	int fail = -1;
    int success = 0;
  /**
   * @brief This method is executed once before all test methods.
   * @throws Exception
   */
  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
  }

  /**
   * @brief This method is executed once after all test methods.
   * @throws Exception
   */
  @AfterClass
  public static void tearDownAfterClass() throws Exception {
  }

  /**
   * @brief This method is executed before each test method.
   * @throws Exception
   */
  @Before
  public void setUp() throws Exception {
  }

  /**
   * @brief This method is executed after each test method.
   * @throws Exception
   */
  @After
  public void tearDown() throws Exception {
  }

@Test
public void TestFileRead()
{
	CarMaintenance car = new CarMaintenance();
	testString = "0-)TEXT STRING0\n1-)TEXT STRING1\n2-)TEXT STRING2\n3-)TEXT STRING3\n4-)TEXT STRING4\n";
	assertEquals(testString, car.FileRead("test1.bin"));
    
}

@Test
public void TestFileAppend()
{
    CarMaintenance car = new CarMaintenance();
	testString = "0-)TEXT STRING0\n1-)TEXT STRING1\n2-)TEXT STRING2\n3-)TEXT STRING3\n4-)TEXT STRING4\n5-)TEXT STRING5\n";
    String appendString = "TEXT STRING5";
    car.FileAppend("test2.bin", appendString);
    assertEquals(testString, car.FileRead("test2.bin"));
}

@Test
public void TestFileEdit()
{
    CarMaintenance car = new CarMaintenance();
	testString = "0-)TEXT STRING0\n1-)TEXT STRING1\n2-)TEXT STRING2\n3-)TEXT STRING EDIT\n4-)TEXT STRING4\n";
    String editString = "TEXT STRING EDIT";
    car.FileEdit("test3.bin", 3, editString);
    assertEquals(testString, car.FileRead("test3.bin"));
}

@Test
public void TestFileDelete()
{
    CarMaintenance car = new CarMaintenance();
	testString = "0-)TEXT STRING0\n1-)TEXT STRING2\n2-)TEXT STRING3\n3-)TEXT STRING4\n";
    car.FileLineDelete("test4.bin", 1);
    assertEquals(testString, car.FileRead("test4.bin"));
}

@Test
public void TestFileWrite()
{
    CarMaintenance car = new CarMaintenance();
    testString = "0-)TEXT STRING WRITE\n";
    String writeString = "TEXT STRING WRITE";
    car.FileWrite("test5.bin", writeString);
    assertEquals(testString, car.FileRead("test5.bin"));
}

@Test
public void TestFileReadFail()
{
    CarMaintenance car = new CarMaintenance();
    assertEquals("-1", car.FileRead("test1f.bin"));
}

@Test
public void TestFileAppendFail()
{
    CarMaintenance car = new CarMaintenance();
    String appendString = "TEXT STRING5";
    assertEquals(fail, car.FileAppend("test2f.bin", appendString));
}

@Test
public void TestFileEditFail()
{
    CarMaintenance car = new CarMaintenance();
    String editString = "TEXT STRING EDIT";
    assertEquals(fail, car.FileEdit("test3f.bin", 3, editString));
}

@Test
public void TestFileEditFail_2()
{
    CarMaintenance car = new CarMaintenance();
    String editString = "TEXT STRING EDIT";
    assertEquals(fail, car.FileEdit("test3.bin", 100, editString));
}

@Test
public void TestFileDeleteFail()
{
    CarMaintenance car = new CarMaintenance();
    assertEquals(fail, car.FileLineDelete("test4f.bin", 2));
}

@Test
public void TestFileDeleteFail_2()
{
    CarMaintenance car = new CarMaintenance();
    assertEquals(fail, car.FileLineDelete("test4.bin", 100));
}

}