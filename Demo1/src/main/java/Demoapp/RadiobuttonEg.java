package Demoapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadiobuttonEg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/radio.html");
		
		
		WebElement boxyes= driver.findElement(By.xpath("//*[@id=\'first\']/label[1]"));
		boolean yes =boxyes.isSelected();
		boxyes.click();
		
		WebElement unchecked= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/input[1]"));
		WebElement checked= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/input[2]"));
		
		boolean status1 =unchecked.isSelected();
		
		boolean status2 =checked.isSelected();
		
		
		System.out.println("status1= "+status1+ "status2= "+status2);
		
        unchecked.click();
        
	}

}
