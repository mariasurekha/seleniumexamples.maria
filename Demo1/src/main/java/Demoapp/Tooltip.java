package Demoapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/tooltip.html");
		
		WebElement gettingtext =driver.findElement(By.id("age"));
		
		// use get attribute = to get the text
		
	String text	=gettingtext.getAttribute("title");
	System.out.println(text);
	}
	

}
