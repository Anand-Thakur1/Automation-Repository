package methodOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch a Chrome Browser
		WebDriver driver=new ChromeDriver();
	    //maximise browser
	    driver.manage().window().maximize();
		//launch Web application
		driver.get("https://www.flipkart.com/");
		//wait 2 sec
		Thread.sleep(2000);
		//close the browser
		driver.close();
		
		}

}
