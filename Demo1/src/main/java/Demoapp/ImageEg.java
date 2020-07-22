package Demoapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Image.html");
		
		WebElement img =driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/img"));
		// To find the img is broken or not we need to use "naturalWidth" it is a CSS property attribute //
	    
		if (img.getAttribute("naturalWidth").equals("0"))
	    	
	    {
       System.out.println("image is broken");	 
        }
	    else 
	    {
	   System.out.println("img is not broken");
	    }
		
		
	}

}
