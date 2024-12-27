package com.crm.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.crm.base.TestBase;

public class LaunchPage extends TestBase{

	public void verifyAppilicationLaunchPage() {
		System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Cogmento Free CRM"));
	}
	
	
	public LoginPage navigateToLoginPage() {
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		return new LoginPage();
	}
	
	
}
