package assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllbrowser {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver	driver =new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://omayo.blogspot.com/");
		 Thread.sleep(2000);
		  String Parenthandle = driver.getWindowHandle();
   		  driver.findElement(By.partialLinkText("Open a popup window")).click();
		  Set<String> allhandles = driver.getWindowHandles();
		  for(String wh:allhandles)
		  {
			  if (!Parenthandle.equals(wh))
			  {
				  TargetLocator switchto = driver.switchTo();
				  switchto.window(wh).close();
					
				 switchto.window(wh).manage().window().maximize();
			  }
			  else {
				 
				driver.close();
			  }
		  }
		 driver.close();  
	}  
}
