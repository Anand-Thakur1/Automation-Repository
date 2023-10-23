package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssselectorLocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/login");
		Thread.sleep(2000);
		driver.findElement(By.id("id_userLoginId")).sendKeys("121212");
		Thread.sleep(2000);
		driver.findElement(By.id("id_password")).sendKeys("11111111");
		Thread.sleep(2000);
		//syntax 1
		//driver.findElement(By.cssSelector("button[class^='btn']")).click();
		//syntax 2 match using starting text
		//driver.findElement(By.cssSelector("button[class='btn login-button btn-submit btn-small']")).click();
		//syntax 3 match using ending text
		//driver.findElement(By.cssSelector("button[class$='small']")).click();
		//syntax 3 match using any charecter 
		driver.findElement(By.cssSelector("button[class*='btn login-button btn-submit']")).click();
		
	}

}
