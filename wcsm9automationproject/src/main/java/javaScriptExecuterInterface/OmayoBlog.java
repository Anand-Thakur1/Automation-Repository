package javaScriptExecuterInterface;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class OmayoBlog {
	

public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		driver.get("https://omayo.blogspot.com/");
		WebElement tb = driver.findElement(By.id("tb2"));
		Point loc = tb.getLocation();
		int xaxis = loc.getX();
		int yaxis = loc.getY();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy("+xaxis+","+yaxis+")");
		jse.executeScript("document.getElementById('tb2').value='anand'");
		WebElement ts = driver.findElement(By.id("tb2"));
		File src = ts.getScreenshotAs(OutputType.FILE);
		File ss = new File("./Screenshot/omayoss.png");
		Files.copy(src, ss);
		
		
}
}
