package methodsOfActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementMethod {
	
        public static void main(String[] args) throws InterruptedException {
			WebDriver  driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.bluestone.com/");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[@class='deny-btn']")).click();
			Thread.sleep(2000);
			WebElement bc = driver.findElement(By.xpath("//a[text()='Watch Jewellery']"));
			Thread.sleep(2000);
			Actions act = new Actions(driver);
			act.moveToElement(bc).perform();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()='Band']")).click();
		}

}
