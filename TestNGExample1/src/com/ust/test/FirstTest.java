package com.ust.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class FirstTest { //testing based on alphabetical order
  @Test(priority=1,description="excecuted first")//priority is added to change the priority of evaluating methods
  public void f() {
	  System.out.println("from test method f()");
  }
  @Test(priority=2,description="writting description")//description will show after the passed message
  public void a() {
	  System.out.println("from test method a()");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("from before test method beforeTest()");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("from after test method afterTest()");
  }

}
