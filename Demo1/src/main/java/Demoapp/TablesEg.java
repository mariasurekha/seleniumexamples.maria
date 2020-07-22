package Demoapp;

import java.util.ArrayList;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.javac.util.List;

public class TablesEg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		
	// To find no.of columns	
	java.util.List<WebElement> column = driver.findElements(By.tagName("th"));
	int colsize = column.size();
	System.out.println("column" + colsize);
	
	// To find no.of rows
	java.util.List<WebElement> row = driver.findElements(By.tagName("tr"));
	int rowsize = column.size();
	System.out.println("row" + rowsize);
	
	// robust type code
	WebElement getPercent = driver.findElement(By.xpath("//td[ normalize-space()='Learn to interact with Elements']//following::td[1]"));
	 String percentage = getPercent.getText();
	System.out.println(percentage);
	
	// to find minimum percentage value in the table //
	java.util.List<WebElement> allPercent=driver.findElements(By.xpath("//td[2]"));
	
		// to convert string into integer for comparison = create a class "ArrayList<Integer>"  //
	ArrayList<Integer> numberlist = new ArrayList<Integer>(); // creating an object (individual val is stored here)
	
	    // To store all the list of values   
	for (WebElement webelement : allPercent) {
		
		String individualValue = webelement.getText().replace("%", "");  // replace is to ignore special characters
		numberlist.add(Integer.parseInt(individualValue));
	}
	   
	    System.out.println(numberlist);
	
	    int smallvalue = Collections.min(numberlist);  // to find the minimum value
	    System.out.println(smallvalue);
	
	    // to convert num to string = method "Integer.toString" // = smallvalue to string
	    
	    String smallvaluestring = Integer.toString(smallvalue)+"%";
	    
	    String finalXpath = "//td[normalize-space()="+"\""+smallvaluestring+"\""+"]"+"//following::td[1]";
	    
	    WebElement check = driver.findElement(By.xpath(finalXpath));
	    Thread.sleep(5000);
		check.click();
		
	//td[ normalize-space()='30']//following::td[1]
	 
		
	
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
