package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1/login.do;jsessionid=lnwfdj5j1kcg");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
		Thread.sleep(2000);
		
		 WebElement login = driver.findElement(By.xpath("//input[@name='remember']"));
		 System.out.println(login.isSelected());
		 
		 driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		 WebElement out = driver.findElement(By.className("logout"));
		 System.out.println(out.isDisplayed());
		 
		 
		
	}

}