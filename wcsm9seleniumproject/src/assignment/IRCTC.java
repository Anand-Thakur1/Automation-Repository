package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IRCTC {

	public static void main(String[] args) throws InterruptedException {
	
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
	
	 WebDriver driver = new ChromeDriver(co);
	 driver.manage().window().maximize();
	 driver.get("https://www.irctc.co.in/nget/train-search");
	 Thread.sleep(2000);
	 
	 driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c57-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted')]")).sendKeys("pune");
	 //driver.findElement(by.);
	 driver.findElement(By.xpath( " //span[contains(text(),' PUNE JN - PUNE ')] ")).click();
		

	}

}
