package keyWordDrivenFrameWork;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest extends Flib{
	static WebDriver driver;
	public void OpenBrowser() throws IOException
	{
		Flib flib = new Flib();
		String browser = flib.readDataFromProperty("./src/main/resources/configuration.properties","Browser" );
		
		String url = flib.readDataFromProperty("./src/main/resources/configuration.properties","URL" );
		
		if (browser.equals("chrome"))
		{
			driver=new ChromeDriver();
			
		}
		else if (browser.equals("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if (browser.equals("Edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			System.out.println("Enter valid Browser Name");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get(url);
	}
	public void CloseBrowser()
	{
		driver.quit();
	}

}
