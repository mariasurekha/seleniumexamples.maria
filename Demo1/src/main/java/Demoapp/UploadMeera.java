package Demoapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadMeera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/upload.html");
		
		
		WebElement up =driver.findElement(By.name("filename"));
	    up.sendKeys("C:\\Users\\Rakesh\\Downloads\\testleaf.xlsx");
	    up.click();
		
	}

}
