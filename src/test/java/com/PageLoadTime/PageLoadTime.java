package com.PageLoadTime;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



import io.github.bonigarcia.wdm.WebDriverManager;

public class PageLoadTime {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static StopWatch pageLoad;
	
	public static void main(String[] args) throws Throwable {
		
		ChromeOptions chromeOptions = new ChromeOptions();
		
		WebDriverManager.chromedriver().setup();
		
			driver=new ChromeDriver();
		
		 pageLoad = new StopWatch();
		
        pageLoad.start();
        //Open your web app (In my case, I opened WE)
        driver.get("https://we.windstream.com/");
        
        driver.manage().window().maximize();
        
        wait= new WebDriverWait(driver, Duration.ofSeconds(35));
       
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username")));
        
        driver.findElement(By.id("username")).sendKeys("SreeTOS");
        driver.findElement(By.id("btnNext")).click();
        
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        
        driver.findElement(By.id("password")).sendKeys("OfficeSuitettest99");
        driver.findElement(By.id("signOnButton")).click();
        pageLoad.stop();
        
        long pageLoadTime_ms1 = pageLoad.getTime();
        long pageLoadTime_Seconds1 = pageLoadTime_ms1 / 1000;
        System.out.println("----Login Time----");
        System.out.println("Total Page Load Time: " + pageLoadTime_ms1 + " milliseconds");
        System.out.println("Total Page Load Time: " + pageLoadTime_Seconds1 + " seconds");
        
        
        pageLoad.reset();
		  PageLoadTime.driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		  Account ac =new Account(); ac.Acc();
    
			
			  pageLoad.reset();
			  
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			   Orders obj=new Orders(); 
			   obj.LoadOrders();
			 
	        
	        pageLoad.reset(); 
			  PageLoadTime.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  ServiceManageResources man = new ServiceManageResources();
			  man.ManageResources();
	        
		  pageLoad.reset();
		  PageLoadTime.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		  ServicesResource res = new ServicesResource();
		  res.Resources();
		 
       
       
	}

}
