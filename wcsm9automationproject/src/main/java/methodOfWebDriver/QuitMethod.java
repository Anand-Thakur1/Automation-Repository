package methodOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod {
public static void main(String[] args) throws InterruptedException {
		
		//Launch a Chrome Browser
		WebDriver driver=new ChromeDriver();
	    //maximise browser
	    driver.manage().window().maximize();
		//launch Web application
		driver.get("http://omayo.blogspot.com/");
		//click on open a popup window link
		driver.findElement(By.partialLinkText("Open a popup window")).click();
		//wait 2 sec
		Thread.sleep(2000);
		// close all the window of browser
		driver.quit();
		
  }


}
