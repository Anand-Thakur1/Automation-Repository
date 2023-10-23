package methodOfWebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver	driver =new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://omayo.blogspot.com/");
		  Thread.sleep(2000);
		  String Parenthandle = driver.getWindowHandle();
			 System.out.println(Parenthandle);
		 driver.findElement(By.partialLinkText("Open a popup window")).click();
		  Set<String> allhandles = driver.getWindowHandles();
		  for(String wh:allhandles)
		  {
			  if (!Parenthandle.equals(wh))
			  {
				  System.out.println("Address of child"+wh);
				  TargetLocator switchto = driver.switchTo();
				  switchto.window(wh).manage().window().maximize();
				  switchto.window(wh).close();
			  }
			  else {
				  System.out.println("Address of parent"+wh);
			  }
		  }
		  driver.quit();
	}

}
