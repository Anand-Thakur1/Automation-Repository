package methodOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
	public static void main(String[] args) throws InterruptedException {
	   WebDriver	driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   //launch the web application usniig  navigate mathod
	      Navigation nev = driver.navigate();
	      nev.to("http://desktop-8oj205o/login.do;jsessionid=a85k2i4knrq3r");
	      Thread.sleep(2000);
	      //to perform backword operation
	      nev.back();
	      Thread.sleep(2000);
	      //to perform forword operation
	      nev.forward();
	      Thread.sleep(2000);
	      //to perform Refresh operation
	      nev.refresh();
	      
		
	}

}
