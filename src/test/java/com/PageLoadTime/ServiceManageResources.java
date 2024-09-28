package com.PageLoadTime;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

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

public class ServiceManageResources {

	public void ManageResources() {

		PageLoadTime.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		PageLoadTime.pageLoad.start();
		
		PageLoadTime.driver.get("https://we.windstream.com/Services/Voip/AvailableFeatures?isBack=false");
		
		
		/*
		 * //Services WebElement manage =
		 * PageLoadTime.wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
		 * "//nav/ul/li[2]/a")));
		 * 
		 * Actions action = new Actions(PageLoadTime.driver);
		 * action.moveToElement(manage).click().build().perform();
		 * 
		 * PageLoadTime.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 * //Products WebElement prod =
		 * PageLoadTime.wait.until(ExpectedConditions.elementToBeClickable(By.
		 * xpath("//a[@class='currency submenu']"))); Actions action1 = new
		 * Actions(PageLoadTime.driver);
		 * action.moveToElement(prod).click().build().perform();
		 * 
		 * //Voip WebElement voip = PageLoadTime.wait
		 * .until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='VoIP']")
		 * )); Actions action2 = new Actions(PageLoadTime.driver);
		 * action2.moveToElement(voip).click().build().perform();
		 * 
		 * WebElement features =
		 * PageLoadTime.wait.until(ExpectedConditions.elementToBeClickable(By.id(
		 * "voipManageFeature"))); Actions action3= new Actions(PageLoadTime.driver);
		 * action3.moveToElement(features).click().build().perform();
		 */

      PageLoadTime.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



      PageLoadTime.pageLoad.stop();
		// Get the time
		long pageLoadTime_ms = PageLoadTime.pageLoad.getTime();
		long pageLoadTime_Seconds = pageLoadTime_ms / 1000;
		System.out.println("-----Manage Resource----");
		System.out.println("Total Page Load Time: " + pageLoadTime_ms + " milliseconds");
		System.out.println("Total Page Load Time: " + pageLoadTime_Seconds + " seconds");
			
		
		 PageLoadTime.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	}

}
