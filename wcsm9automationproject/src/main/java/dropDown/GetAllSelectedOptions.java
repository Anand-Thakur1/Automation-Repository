package dropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptions {
	 
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("http://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
	    driver.findElement(By.xpath("//a[text()='Multi Select']")).click();
		Thread.sleep(2000);
		WebElement dd = driver.findElement(By.xpath("//label[text()='Country']/following-sibling::select"));
		Select sel = new Select(dd);
		Thread.sleep(2000);
		    for (int i = 1;i<=4;i++)
		    {
		        sel.selectByIndex(i);
		    }
		   List<WebElement> allop = sel.getAllSelectedOptions();
		//    for (int i =0;i<=op.size();i++)
		//    {	 
		//          String ops = op.get(i).getText();		   
	    //		    System.out.println(ops);
	    //	  }
		  for(WebElement op:allop)
		  {
			  String opt = op.getText();
			  System.out.println(opt);
		  }
	}
}
