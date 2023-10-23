package syncrhonizationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OmayoBlog {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Flipkart']"))).click();
				
		WebElement checkbutton=driver.findElement(By.xpath("//button[text()='Dropdown']"));
		explicitWait(driver,30,checkbutton).click();
		driver.findElement(By.xpath("//a[text()='Flipkart']")).click();
		driver.findElement(By.xpath("//span[text()='✕']")).click();

		
		}
		public static WebElement explicitWait(WebDriver driver,int sec, WebElement ele) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(ele));
			return element;
		}
	
		

}
