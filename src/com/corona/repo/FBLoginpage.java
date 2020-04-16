package com.corona.repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FBLoginpage {
	WebDriver driver;
	public FBLoginpage(WebDriver driver)
	{
		this.driver=driver;
	}

	public WebElement firstnameTextBox()
	{
		WebElement element=driver.findElement(By.xpath("//*[@id='u_0_m']"));
		return element;
	}
	public WebElement surnameTextBox()
	{
		WebElement element=driver.findElement(By.xpath("//*[@id='u_0_o']"));
	    return element;
	}
	public void waitforpageload()
	{
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='content']/div/div/div/div")));
	}
}
