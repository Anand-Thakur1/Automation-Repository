package methodOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {

public static void main(String[] args) throws InterruptedException {
		
		//Launch a Chrome Browser
		WebDriver driver=new ChromeDriver();
	    //maximise browser
	    driver.manage().window().maximize();
		//launch Web application
		driver.get("http://omayo.blogspot.com/");
		//wait 2 sec
		Thread.sleep(2000);
		//Get the title of Method
		String  titleOfmethod = driver.getTitle();
		System.out.println(titleOfmethod);
		Thread.sleep(2000);
		driver.quit();
		
  }
}
