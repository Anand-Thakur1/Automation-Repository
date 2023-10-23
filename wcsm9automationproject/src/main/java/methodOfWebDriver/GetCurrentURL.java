package methodOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentURL {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-8oj205o/login.do");
		 String currentURL = driver.getCurrentUrl();
		System.out.println( currentURL);
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Username:")).sendKeys("Admin");

		driver.findElement(By.partialLinkText("Password:")).sendKeys("manager");
		
		
	}

}
