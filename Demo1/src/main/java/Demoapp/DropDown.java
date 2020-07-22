package Demoapp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
	// To select any dropdown value	we need to use SELECT class
		
		WebElement dropDown1 = driver.findElement(By.id("dropdown1"));
		//create class / obj / = / new select / webelement //
	    Select select1 = new Select (dropDown1);
	    
	// To use select value,index,visibleText etc ... we have to create "select class" //
	    select1.selectByIndex(4);
	    Thread.sleep(3000);
	    select1.selectByValue("3");
	    Thread.sleep(3000);
	    select1.selectByVisibleText("Appium");
	
	// To find no.of.Elements, list of drop down OPTIONS (use SIZE parameter)
	  List<WebElement> listofoptions = select1.getOptions();
	  int size1= listofoptions.size();
	  System.out.println("listofoptiions=" + size1);
	  
   // By using sendkeys 
	  dropDown1.sendKeys("Selenium");
	  
   // selecting all the options
	  
	  WebElement multiselect = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
	  Select multiselectBox= new Select(multiselect);
	  multiselectBox.selectByIndex(3);
	  multiselectBox.selectByIndex(1);
	  multiselectBox.selectByIndex(2);
	  	
	}

}
