package Demoapp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		// No. of elements
		List<WebElement> list =driver.findElements(By.xpath("//*[@id='selectable']/li")); // Note-Xpath
		int alllist =list.size(); 
		System.out.println(alllist);
		
		Actions actions= new Actions(driver);
		actions.keyDown(Keys.CONTROL).click(list.get(0)).click(list.get(1)).build().perform();
		// OR
		
		actions.clickAndHold(list.get(0)).build().perform();
		
		
		 
	}
	
	

}
