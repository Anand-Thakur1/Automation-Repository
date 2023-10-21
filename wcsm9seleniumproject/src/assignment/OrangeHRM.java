package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(2000);
	driver.findElement(By.name("username")).sendKeys("Admin");
	Thread.sleep(2000);
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.cssSelector("button[class*='oxd-button oxd']")).click();
	Thread.sleep(2000);
	driver.findElement(By.partialLinkText("My Info")).click();
	driver.findElement(By.name("firstName")).sendKeys("ram");
	driver.findElement(By.name("middleName")).sendKeys("kishan");
	driver.findElement(By.name("middleName")).sendKeys("sarasvat");
	}

}
