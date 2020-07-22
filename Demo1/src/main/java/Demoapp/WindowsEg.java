package Demoapp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsEg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		
		String oldwindow =driver.getWindowHandle(); //parent window identity
		WebElement parent= driver.findElement(By.id("home"));
		parent.click();
		
		Set<String> handles =driver.getWindowHandles();  // NEW & OLD WINDOW
		for (String newwindow : handles) {
			driver.switchTo().window(newwindow);
		}
		
		
		 WebElement editboxs= driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[1]/a/img"));
		 editboxs.click();
		 driver.close();
		 
		 driver.switchTo().window(oldwindow);
		 
		 WebElement multiwindow =driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/button"));
		 int windowcount = driver.getWindowHandles().size(); // count of open windows
		 System.out.println("no.of.windows opened ="+ windowcount);
		 
		 WebElement dontclosewin = driver.findElement(By.id("color"));
		 dontclosewin.click();
		 Set<String> multiplewindow =driver.getWindowHandles();
		 
		 for (String allwindows : multiplewindow) {
			if(!allwindows.equals(oldwindow))
			{
				driver.switchTo().window(allwindows);
				driver.close();
				
			}
		}
		 
		  
		 
		 
		 
	}
	

}
