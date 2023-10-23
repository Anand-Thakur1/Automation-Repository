package assignmentpackagemaven;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		//driver.findElement(By.xpath("//span"))
		driver.findElement(By.name("q")).sendKeys("laptop",Keys.ENTER);
		

		//click on brandss
		driver.findElement(By.xpath("//div[text()='Brand']")).click();
		driver.findElement(By.xpath("//div[@class='_3879cV'and(text()='HP')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_3879cV'and(text()='Core i7')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Operating System']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Windows 11']")).click();
		Thread.sleep(2000);
		List<WebElement> allaptop = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		Thread.sleep(2000);
		List<WebElement> allprice = driver.findElements(By.xpath("//div[@class='_4rR01T'and(@class='_30jeq3 _1_WHN1')]"));
		Thread.sleep(2000);
		for(int i=0;i<allaptop.size();i++)
		{
			String laptop = allaptop.get(i).getText();
			Thread.sleep(2000);
			System.out.println(laptop);
			for(int j=i;j<=i;j++)
			{
				String price = allprice.get(j).getText();
				Thread.sleep(2000);
				System.out.println(price);
			}
				
			
			
		}
		
	}

}
