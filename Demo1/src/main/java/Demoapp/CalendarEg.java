package Demoapp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Calendar.html");
		
		WebElement datebox = driver.findElement(By.id("datepicker"));
		//datebox.sendKeys("04/26/2020"+Keys.ENTER);
	   // OR //
		datebox.click();
		
		//*[@id='ui-datepicker-div']/div/a[2]/span
		//a[@title='Next']
		
		WebElement nextbutton = driver.findElement(By.xpath("//a[@title='Next']"));
		nextbutton.click();
		
		WebElement date = driver.findElement(By.xpath("//a[contains(text(),'10')]"));
		date.click();
		
	
	}

}
