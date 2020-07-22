package Demoapp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadfileEg {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/upload.html");
		
		
		WebElement up =driver.findElement(By.name("filename"));
	    up.click();
		Thread.sleep(3000);
		
		// Windows control begins here
		// C:\\Users\\Rakesh\\Downloads\\testleaf.xlsx
		
		String file = "C:\\Users\\Rakesh\\Downloads\\testleaf.xlsx";
		StringSelection selection= new StringSelection(file);   // create a class for upload such as "StringSelection"//
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null); // ctlr+V paste content is stored here//
		
		// paste operation ctrl+v then press Enter
		//For windows based operation - keyboard action "we need to use ROBOT CLASS"
		Robot robot = new Robot();
		
		// VK_CONTROL means virtual keyboard
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    Thread.sleep(3000);
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	    	
		
		
		
	}

}
