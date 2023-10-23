package dropDown;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOptionMethod {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
	    driver.findElement(By.xpath("//a[text()='Multi Select']")).click();
		Thread.sleep(2000);
		WebElement dd = driver.findElement(By.xpath("//label[text()='Country']/following-sibling::select"));
		Select sel = new Select(dd);
		Thread.sleep(2000);
		   
		for (int i = 1;i<=4;i++)
	    {
			Thread.sleep(2000);
		    sel.selectByIndex(i);
	    }
	    WebElement op = sel.getFirstSelectedOption();
	    System.out.println(op.getText());
	   
	}

}
