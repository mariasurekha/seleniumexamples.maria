package Demoapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/drop.html");
		
		//Mouse related activities = create Actions class... (Notes)
		WebElement from = driver.findElement(By.id("draggable"));
		WebElement to = driver.findElement(By.id("droppable"));
		
		Actions actions = new Actions(driver);
		// TO carry all the actions build.perform is must for actions
		actions.clickAndHold(from).moveToElement(to).release(to).build().perform(); 
		// OR
		actions.dragAndDrop(from, to).build().perform();
		
		
	}

}