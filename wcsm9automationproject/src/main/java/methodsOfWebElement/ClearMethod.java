package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://desktop-8oj205o/login.do;jsessionid=18tf4kn2hu001");
	    WebElement usn = driver.findElement(By.name("username"));
	    usn.sendKeys("admin");
	    
	    Thread.sleep(2000);
		WebElement pwd = driver.findElement(By.name("pwd"));
		pwd.sendKeys("admin123");
		Thread.sleep(4000);
		
		usn.clear();
		pwd.clear();
		
		
		
		
		
	}

}
