package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkTextLocator {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		//identify the link by using there text link
		driver.findElement(By.partialLinkText("SeleniumTutorial")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
