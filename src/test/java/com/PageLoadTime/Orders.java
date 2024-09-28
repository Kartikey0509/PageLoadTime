package com.PageLoadTime;

import static org.testng.Assert.assertEquals;
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

public class Orders  {
		
	public void LoadOrders() throws Exception {
		
        PageLoadTime.pageLoad.start();
        PageLoadTime.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(10000);
        
        WebElement we = PageLoadTime.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//nav/ul/li[3]/a")));
        Actions action= new Actions(PageLoadTime.driver);
        action.moveToElement(we).click().build().perform();
      
        PageLoadTime.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
       PageLoadTime.pageLoad.stop();
        //Get the time
        long pageLoadTime_ms = PageLoadTime.pageLoad.getTime();
        long pageLoadTime_Seconds = pageLoadTime_ms / 1000;
        System.out.println("----Orders----");
        System.out.println("Total Page Load Time: " + pageLoadTime_ms + " milliseconds");
        System.out.println("Total Page Load Time: " + pageLoadTime_Seconds + " seconds");
        
        PageLoadTime.driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
		
       
	//	 PageLoadTime.driver.close();

   
	   
       }
	}


