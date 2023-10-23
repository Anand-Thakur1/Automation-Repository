package syncrhonizationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.instagram.com/");
		//driver.manage().wait();
		driver.findElement(By.xpath("//input[@aria-label='Phone number, username or email address']")).sendKeys("anandthakur123@");
		
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("123456789");
		
		driver.findElement(By.xpath("//div[contains(text(),'Log in')]")).click();
	}

}
