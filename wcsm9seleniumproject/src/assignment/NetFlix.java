package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetFlix {
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/login");
		Thread.sleep(2000);
		driver.findElement(By.id("id_userLoginId")).sendKeys("121212");
		Thread.sleep(2000);
		driver.findElement(By.id("id_password")).sendKeys("11111111");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Sign In")).click();		
	}

}
