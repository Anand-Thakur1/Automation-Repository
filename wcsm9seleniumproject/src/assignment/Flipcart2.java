package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@role='button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[contains(@alt,'Mobiles')]")).click();
		Thread.sleep(2000);
     	driver.findElement(By.xpath("//img[@alt='Samsung']")).click();
		Thread.sleep(2000);
		((WebElement) driver.findElements(By.xpath("//html/body/div/div/div[3]/div[6]/div/a/div/div/img[2]"))).click();
	}
}
