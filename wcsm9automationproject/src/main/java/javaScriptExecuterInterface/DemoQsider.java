package javaScriptExecuterInterface;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class DemoQsider {
	static boolean res=false;
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Synchronization']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Progress Bar']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Disabled Element']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter time in seconds']")).sendKeys("5");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		Thread.sleep(6000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		//jse.executeScript("document.getElementsByClassName('border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-slate-200 rounded text-sm shadow focus:outline-none focus:ring w-[33%] ease-linear transition-all duration-150 cursor-not-allowed').value='ritik'");
	   		WebElement at = driver.findElement(By.xpath("//select[@class='border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-slate-200 rounded text-sm shadow focus:outline-none focus:ring w-[33%] ease-linear transition-all duration-150 cursor-not-allowed']"));
		
		
		for(int i= 0;i<200;i++)
		{
		   if (res==false)
		   {
		       res = ((WebElement) at).isDisplayed();
		   }
		   else
			   jse.executeScript("document.getSelection('Select your answer').value='anand'");
		}
		
		Thread.sleep(2000);
		File src = at.getScreenshotAs(OutputType.FILE);
		File kk = new File("./Screenshot/qsider1.png");
		Files.copy(src, kk);
		
	}

}