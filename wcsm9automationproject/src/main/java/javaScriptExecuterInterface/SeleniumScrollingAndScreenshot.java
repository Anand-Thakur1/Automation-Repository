package javaScriptExecuterInterface;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class SeleniumScrollingAndScreenshot {
	
public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		driver.get("https://www.selenium.dev/");
		WebElement twiter = driver.findElement(By.xpath("//i[@class='fab fa-twitter']"));
		//get the location of twitter symbol
		Point loc = twiter.getLocation();
		int xaxis = loc.getX();
		int yaxis = loc.getY();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		//jse.executeScript("window.scrollBy("+xaxis+","+yaxis+")");
		Thread.sleep(2000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = twiter.getScreenshotAs(OutputType.FILE);
		Thread.sleep(2000);
		File ss = new File("./Screenshot/seleniumssTwiter3.png");
		Files.copy(src, ss);
		//Way 2
		WebElement facebook = driver.findElement(By.xpath("//i[@class='fab fa-facebook']"));
		Thread.sleep(2000);
		jse.executeScript("arguments[0].scrollIntoView(true)",facebook);
		
}
}
