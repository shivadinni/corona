package com.corona.smoke;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestFBinvalidLogin {
	WebDriver driver;
	 com.corona.repo.FBLoginpage login;
  @Test
  public void f() {
			 //wait for loginpage to load
				login.waitforpageload();
			//Enter valid firstname
			login.firstnameTextBox().sendKeys("shivakumar");
			login.surnameTextBox().sendKeys("sundarraj"); 
  }
  @BeforeMethod
	  public void preconditions()
	  { 
	  driver=com.corona.config.TestConfiguration.getinstance();
		login=new com.corona.repo.FBLoginpage(driver); 
  }

  @AfterMethod
	  public void postcondition()
	  {
	  	driver.close();
	  }
  }
