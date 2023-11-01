package javaScriptExecuterInterface;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisableWebElements {
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("(//p[@class='font-bold'])[1]")).click();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		driver.findElement(By.xpath("(//p[@class='font-bold'])[2]")).click();
		Thread.sleep(2000);
		jse.executeScript("document.getElementById('name').value='Anand'");
		Thread.sleep(2000);
		jse.executeScript("document.getElementById('email').value='anand@gmail.com'");
		Thread.sleep(2000);
		jse.executeScript("document.getElementById('password').value='anand92@'");
		WebElement register = driver.findElement(By.xpath("//button[text()='Register']"));
		if(register.isDisplayed())
		{
			jse.executeScript("arguments[0].click()", register);
			System.out.println("click");
		}
		else
			System.out.println("not click");
		driver.findElement(By.xpath("//a[@type='button']")).click();
		
		
}
}
