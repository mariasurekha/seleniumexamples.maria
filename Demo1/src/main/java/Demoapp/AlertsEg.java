package Demoapp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		WebElement alert1= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
		alert1.click();
		Alert alertbox = driver.switchTo().alert();
		alertbox.accept();
		
		WebElement confirmalert =driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		confirmalert.click();
		Alert confirmalertbox = driver.switchTo().alert();
		confirmalertbox.dismiss();
		
		WebElement promptalert =driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
		promptalert.click();
		Alert promptbox=driver.switchTo().alert();
		promptbox.sendKeys("MAGGI");
		promptbox.accept();
		
		
		
		
		
		
		
	}

}
