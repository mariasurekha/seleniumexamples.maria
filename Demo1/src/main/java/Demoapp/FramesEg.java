package Demoapp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		
		//frame - 1st frame is denoted as "0"
		driver.switchTo().frame(0);
		WebElement button1 = driver.findElement(By.id("click"));
		button1.click();
		
		String text =driver.findElement(By.id("click")).getText();
		System.out.println(text);
		
		//nested frame
		driver.switchTo().defaultContent(); // frame handling method for getting back to original content
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement button2 = driver.findElement(By.id("click1"));
		button2.click();
		
		//To find total no of frames...
		driver.switchTo().defaultContent();
		List<WebElement> totalframe = driver.findElements(By.tagName("iframe"));
		int total = totalframe.size();
		System.out.println(total);
		
		
		
		
	}

}
