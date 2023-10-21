
package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("122111222");
	//driver.findElement(By.name("username")).sendKeys("8085579203");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[contains(@aria-label,'Password')]")).sendKeys("1232123");
	//driver.findElement(By.name("password")).sendKeys("8085570203");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
	//driver.findElement(By.tagName("")).click();
	
}
}
