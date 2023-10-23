package methodOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetpageSource {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-8oj205o/login.do");
		 String pagesource = driver.getPageSource();
		System.out.println( pagesource);
		Thread.sleep(2000);
		driver.quit();

	}

}
