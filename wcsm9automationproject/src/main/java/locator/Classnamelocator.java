package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classnamelocator {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("joey tribbiani",Keys.ENTER);
		//identify symbol and click
		driver.findElement(By.className("lNPNe")).click();
		
		

	}

}
