package Demoapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxEg {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("http://www.leafground.com/pages/checkbox.html");
	  
	  WebElement checkbox1= driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div[1]/input"));	  
	  boolean box1= checkbox1.isSelected();
	  System.out.println(box1);
	  
	  WebElement checkbox2= driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div[2]/input"));	  
	  
	 
	  if(checkbox1.isSelected()) {
		 checkbox1.click();
	 }
	 
	 if(checkbox2.isSelected()) {
		 checkbox2.click();
	 }
		  
	  }
	
	}
	

	


