package Demoapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class verify {
    
  @Test
  public void openGoolge() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.google.com/"); 
    }
  
  public void openBing() {
  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
  driver.get("https://www.bing.com/");

}

}

