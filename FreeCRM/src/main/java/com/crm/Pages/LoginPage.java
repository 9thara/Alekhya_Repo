package com.crm.Pages;

import java.util.Set;

import org.openqa.selenium.By;

import com.crm.base.TestBase;

public class LoginPage extends TestBase{

	public void enterthecredentials(String user, String password) {
		System.out.println("Enter the credentials");
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys(user);
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	}
	
	public HomePage clickLoginBtn() {
		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
		return new HomePage();
	}
	
	public void verifyFeild() {
		String parentwindow=driver.getWindowHandle();
		Set<String> allwindow= driver.getWindowHandles();
		
		for(String s:allwindow) {
			if (!(s.contentEquals(parentwindow))) {
				
				driver.switchTo().window(s);
			}
		}
		
		driver.findElement(By.xpath("//input[@name='email']")).isDisplayed();
		driver.findElement(By.xpath("//input[@name='password']")).isDisplayed();	
	}
	
}
