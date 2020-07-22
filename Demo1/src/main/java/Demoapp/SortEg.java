package Demoapp;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SortEg {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/sortable.html");
		
		//*[id='sortable']/li //
		
		List<WebElement> elements= driver.findElements(By.xpath("//*[@id='sortable']/li"));
		WebElement Fromelement =elements.get(6);
		WebElement Toelement =elements.get(0);
		
		Actions action= new Actions(driver);
		
		action.clickAndHold(Fromelement);
		
		action.moveToElement(Toelement);
		
		action.release(Toelement);
		action.build().perform();
		


}
}