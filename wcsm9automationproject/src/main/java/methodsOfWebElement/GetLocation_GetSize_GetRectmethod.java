package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation_GetSize_GetRectmethod {
	public static void main(String[] args) {
		
		
	   WebDriver driver	=  new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   driver.get("http://demoapps.qspiders.com/");
	   WebElement emailTB = driver.findElement(By.cssSelector("input#email"));
	   Point loc = emailTB.getLocation();
	   int xaxis = loc.getX();
	   int yaxis = loc.getY();
	   System.out.println("location of email text box :"+xaxis+":"+yaxis);
	   
	   Dimension size = emailTB.getSize();
	   int hight = size.getHeight();
	   int width = size.getWidth();
	   System.out.println("size of the email text box :"+hight+":"+width);
	   
	   Rectangle rect = emailTB.getRect();
	   int x = rect.getX();
	   int y = rect.getY();
	   System.out.println("size of the email text box :"+x+":"+y);
	}

}
