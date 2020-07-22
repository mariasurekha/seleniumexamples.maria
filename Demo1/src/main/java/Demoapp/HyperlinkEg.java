package Demoapp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperlinkEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//'navigate' can be used instead of 'get' (difference )
		driver.navigate().to("http://www.leafground.com/pages/Link.html");
		
		WebElement homepage = driver.findElement(By.linkText("Go to Home Page"));
		homepage.click();
		driver.navigate().back();
		
		// To find whr this link is going....
		WebElement whr2go = driver.findElement(By.partialLinkText("Find where am"));
		String where= whr2go.getAttribute("href");
		System.out.println("this link is going to "+ where);
		
		
		WebElement brokenlink = driver.findElement(By.linkText("Verify am I broken?"));
		brokenlink.click();
		
		// getting title of the webpage 
       String title=driver.getTitle();
       if (title.contains("404"))
       {
    	   System.out.println("link is broken");
       }
		driver.navigate().back();
		WebElement home = driver.findElement(By.linkText("Go to Home Page"));
		home.click();
		driver.navigate().back();
		
	List<WebElement> totallinks=driver.findElements(By.tagName("a")); // finding no.of links use tag "a", for image use"img" //
	
	int total= totallinks.size();
	System.out.println(total);
	
	
	
	
	
	
	
	
	
	
       
	}

}
