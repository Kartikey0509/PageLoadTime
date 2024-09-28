package com.PageLoadTime;

import static org.testng.Assert.assertFalse;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Account {

	public void Acc() {
		
		
		PageLoadTime.pageLoad.start();
		
		
		  WebElement we =
		  PageLoadTime.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//nav/ul/li[7]/a"))); 
		  Actions action = new Actions(PageLoadTime.driver);
		  action.moveToElement(we).click().build().perform();
		
		 

		PageLoadTime.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement accounthier =PageLoadTime.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//nav/ul/li[7]/a"))); 
				  Actions actionhier = new Actions(PageLoadTime.driver);
				  action.moveToElement(accounthier).click().build().perform();
				  
	//	PageLoadTime.driver.findElement(By.xpath("//h4[text()='Account Hierarchy']")).click();



		PageLoadTime.pageLoad.stop();
		// Get the time
		long pageLoadTime_ms = PageLoadTime.pageLoad.getTime();
		long pageLoadTime_Seconds = pageLoadTime_ms / 1000;
		System.out.println("----Accounts----");
		System.out.println("Total Page Load Time: " + pageLoadTime_ms + " milliseconds");
		System.out.println("Total Page Load Time: " + pageLoadTime_Seconds + " seconds");

	

	}

}
