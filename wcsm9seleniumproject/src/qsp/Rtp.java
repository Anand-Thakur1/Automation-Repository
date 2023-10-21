package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rtp {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// to take inputs from users
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Browser value");
		String browserValue = sc.next();
		if (browserValue.equalsIgnoreCase("chrome"))
		{
		    driver = new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.close();
			System.out.println("chrome is open");
		}
		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.close();
			System.out.println("Firefox is open");
		}
		else if(browserValue.equalsIgnoreCase("edge"))
		{
		    driver = new EdgeDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.close();
			System.out.println("Edge is open");
		}
		else {
			System.out.println("Enter valid browser value");
		}
		

	}

}
