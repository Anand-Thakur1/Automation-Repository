package popUpPackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Omayo {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("alert1")).click();
		Thread.sleep(2000);
		Alert at = driver.switchTo().alert();
		Thread.sleep(2000);
		String text = at.getText();
		System.out.println(text);
		Thread.sleep(2000);
		at.accept();
		Thread.sleep(2000);
		//at.dismiss();
	}

}
