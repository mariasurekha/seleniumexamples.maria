package Demoapp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadsEg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/download.html");
		
		WebElement link= driver.findElement(By.linkText("Download Excel"));
		link.click();
		Thread.sleep(3000);
		
		// C:\Users\Rakesh\Downloads
		
		File fileLocation = new File("C:\\Users\\Rakesh\\Downloads"); // create a class file
		File[] totalfiles = fileLocation.listFiles();  // store all the files in that location in this name
		// use for each loop
		for (File file : totalfiles) {
			if(file.getName().equals("testleaf.xlsx")) {
				
				System.out.println("file is present");
				break;
			}
		}
	}

}
