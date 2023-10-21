package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		//driver.findElement(By.id("href")).click();
		//driver.findElement(By.partialLinkText("Enter Email/Mobile number")).sendKeys("123456");
		driver.findElement(By.xpath("//span[@role='button']")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//html/body/div[1]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[2]/div[1]/div/div[1]/div/div/div/div/div[1]/div[2]/div/div/div/div/img")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[contains(@alt,'Mobiles')]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[text()='realme' and (@class='_3879cV')]")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='SAMSUNG' and(@class='_3879cV')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='vivo' and (@class='_3879cV')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='OPPO' and (@class='_3879cV')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='APPLE' and (@class='_3879cV')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='POCO' and (@class='_3879cV')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='170 MORE']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='MOTOROLA' and(@class='_3879cV')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='SAMSUNG' and(@class='_3879cV')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='realme' and (@class='_3879cV')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='vivo' and (@class='_3879cV')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Google' and(@class='_3879cV')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='OnePlus' and(@class='_3879cV')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='ASUS' and(@class='_3879cV')]")).click();
		
		
	}

}