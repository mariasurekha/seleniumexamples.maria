
package Demoapp;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonsEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("http://www.leafground.com/pages/Button.html");
	    
//  Dimensions    
	    WebElement xydimensions = driver.findElement(By.xpath("//*[@id=\'size\']"));
	    xydimensions.click();
	   int height = xydimensions.getSize().getHeight();
	   int width = xydimensions.getSize().getWidth();
	   System.out.println("height="+height+"width="+width);

// Location //position
	   WebElement location = driver.findElement(By.id("position"));
	   // point is a class, getlocation() is a method, int is a return type
	   Point xylocator= location.getLocation();
	   int xaxis = xylocator.getX();
	   int yaxis = xylocator.getY();
	   System.out.println("x point:"+xaxis+"Y point:"+yaxis);
	   // xaxis, yaxis is called as variable 
	   	   	    
//  css color
	    WebElement colour = driver.findElement(By.id("color")); 
	    // background color it is a property u can get it from doing inspect
	    String bgcolour=colour.getCssValue("background-color");
	    System.out.println("color: "+ bgcolour);
	    
	}

}
