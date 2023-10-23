package methodOfWebDriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {
	public static void main(String[] args) throws InterruptedException {
		
		
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://google.com/");
			driver.switchTo().activeElement().sendKeys("bike");
			Thread.sleep(2000);
			List<WebElement> bikeoptions = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
			for (int i = 0;i<bikeoptions.size();i++)
		/*	{
			String options = options=bikeoptions.get(i).getText();
			Thread.sleep(2000);
			System.out.println(options);
			
			}*/
				for (WebElement op:bikeoptions)
				{
					String options = op.getText();
					
					
				}
					
	}

}
