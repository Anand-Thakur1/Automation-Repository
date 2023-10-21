package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("8085579203");
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("8085570203");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		
	}

}
