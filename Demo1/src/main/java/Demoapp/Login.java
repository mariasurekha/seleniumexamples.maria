package Demoapp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static void main(String[] args) {
	WebDriver driver;
	  // browser name & location
	
	                 System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
	                 driver=new ChromeDriver();
	                 driver.manage().window().maximize();
	                 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	                 driver.get("http://demowebshop.tricentis.com/");
	                 // get - is a method
	  }

}
