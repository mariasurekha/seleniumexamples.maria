package Demoapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Editfield {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		//driver.findElement(By.id("email")).sendKeys("test@gmail.com");
		//driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/input")).sendKeys("Text");
		//String value = driver.findElement(By.className("username")).getAttribute("value");
		//System.out.println(value);
		//driver.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/div/div/input")).clear();
		
		WebElement emailbox =driver.findElement(By.id("email"));
		emailbox.sendKeys("test@gmail.com");
		
		WebElement appendbox= driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/input"));
        appendbox.sendKeys("Text");
        
        WebElement getTextbox = driver.findElement(By.name("username"));
        String value= getTextbox.getAttribute("value");
        System.out.println(value);
        
        WebElement clearbox = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/div/div/input"));
        clearbox.clear();
        
        WebElement disabeledBox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/div/div"));
      boolean disabeled = disabeledBox.isDisplayed();
      System.out.println(disabeled);
      
      
        
        
        
        
        
        
        
        
	
	}
}
	
	
	
	

