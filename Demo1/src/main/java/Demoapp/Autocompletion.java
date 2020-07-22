package Demoapp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocompletion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/autoComplete.html");
		
	WebElement input=driver.findElement(By.id("tags"));
	input.sendKeys("s");
	Thread.sleep(5000);
	
	List<WebElement> optionlist= driver.findElements(By.xpath("//*[@id='ui-id-1']/li"));  // xpath - ul (unordered list)
	System.out.println(optionlist.size());
	
	// SELECT FOR EACH LOOP =CTRL + SPACE //
	for (WebElement optionswebElement : optionlist) {
		
		if(optionswebElement.getText().equals("SOAP")) {
			
			optionswebElement.click();
		break;
		
		
		
		}
	}
	}
}