package com.crm.Pages;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.base.TestBase;

public class HomePage extends TestBase{

	public void verifyApplicationinHome() {
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a//span[contains(text(),'Home')]")));
	}
	
	
	public ContactPage clickContactButton() {
		driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
		return new ContactPage();
	}
	
	
	
	
	
}
