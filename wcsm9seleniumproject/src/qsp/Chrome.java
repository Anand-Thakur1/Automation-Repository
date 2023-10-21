package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("crome is open");
		Thread.sleep(2000);
		driver.close();
		System.out.println("crome is close");
	}

}
