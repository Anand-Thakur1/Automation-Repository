package methodOfWebDriver;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GetWindowHandle {

	public static void main(String[] args) throws InterruptedException {
	  WebDriver	driver =new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://omayo.blogspot.com/");
	  Thread.sleep(2000);
	  String Parenthandle = driver.getWindowHandle();
	 System.out.println(Parenthandle);
	 driver.quit();

	}

}
