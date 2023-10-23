package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute_GetCssvalue_GetTagname {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-8oj205o/login.do");
		WebElement abc = driver.findElement(By.xpath("//input[@name='username']"));
		abc.sendKeys("admin");
		Thread.sleep(2000);
		abc.getAttribute("value");
		abc.getAttribute("name");
	}

}
