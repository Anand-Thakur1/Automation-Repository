package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentonXpath {
	
	public static void main(String[] args) throws InterruptedException {
		//launch the browser
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//launch the app
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	//handle popup
	driver.findElement(By.xpath("//span[@class='_30XB9F']")).click();
	Thread.sleep(2000);
	//
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Mobile",Keys.ENTER);
	Thread.sleep(2000);
	String price = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[2]/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']")).getText();
	System.out.println(price);
	driver.quit();
	}

}
