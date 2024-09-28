package com.PageLoadTime;

import static org.testng.Assert.assertFalse;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ServicesResource {

	public void Resources() {
		
		//PageLoadTime.driver.navigate().back();
		
		PageLoadTime.pageLoad.start();
		
		PageLoadTime.driver.get("https://we.windstream.com/Support/HelpCenter/WEConnectU#VoIP");
		
		PageLoadTime.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Services
	//	WebElement res = PageLoadTime.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//nav/ul/li[2]/a")));
		
		
		//JavascriptExecutor executor = (JavascriptExecutor)PageLoadTime.driver;
	//	executor.executeScript("arguments[0].click();", res);
		
	/*	  Actions action = new Actions(PageLoadTime.driver);
		  action.moveToElement(res).click().build().perform();
		  PageLoadTime.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Products
		PageLoadTime.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement product = PageLoadTime.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='currency submenu']"*/
		
	//	JavascriptExecutor executor1 = (JavascriptExecutor)PageLoadTime.driver;
	//	executor1.executeScript("arguments[0].click();", product);
		
		/*Actions action1 = new Actions(PageLoadTime.driver);
		action1.moveToElement(product).click().build().perform();
		
		PageLoadTime.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//voip
		WebElement voip = PageLoadTime.wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='VoIP']")));
		Actions action2 = new Actions(PageLoadTime.driver);
		action2.moveToElement(voip).click().build().perform();
		
		PageLoadTime.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement features = PageLoadTime.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/Support/HelpCenter/WEConnectU#VoIP']")));
      Actions action3= new Actions(PageLoadTime.driver);
      action3.moveToElement(features).click().build().perform();*/

		/*
		 * PageLoadTime.driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		 * PageLoadTime.driver.findElement(By.xpath(
		 * "//a[starts-with(text(),'Resources')]")).click();
		 */

		PageLoadTime.pageLoad.stop();
		// Get the time
		long pageLoadTime_ms = PageLoadTime.pageLoad.getTime();
		long pageLoadTime_Seconds = pageLoadTime_ms / 1000;
		System.out.println("-----Resource----");
		System.out.println("Total Page Load Time: " + pageLoadTime_ms + " milliseconds");
		System.out.println("Total Page Load Time: " + pageLoadTime_Seconds + " seconds");
	   // PageLoadTime.driver.navigate().back();
			
			 PageLoadTime.driver.close();
	}

}
