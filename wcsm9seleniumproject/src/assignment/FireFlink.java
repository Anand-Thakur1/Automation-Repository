package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FireFlink {
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://crowd.fireflink.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("emailId")).sendKeys("taanand92@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Rajput@123");
		Thread.sleep(2000);
		driver.findElement(By.tagName("button")).click();		
	}

}
