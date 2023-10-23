package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMUsingcssSelector {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");
		driver.findElement(By.cssSelector("button[class*='oxd-button oxd']")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("My Info")).click();
		
		driver.findElement(By.cssSelector("input[palceholder='First Name']")).sendKeys("ram");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[palceholder='Middel Name']")).sendKeys("kishan");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("sarasvat");
		}

}
