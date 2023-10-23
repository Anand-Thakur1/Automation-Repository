package dropDown;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EleminateDuplicateBYHashset {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("http://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		// single select
		 WebElement dropdowm1 = driver.findElement(By.xpath("//label[text()='Phone Number']/following-sibling::section/select"));
		 
		 // get all the option present inside the phone no dropdown
		 
		   Select sp = new Select(dropdowm1);
		   List<WebElement> allop = sp.getOptions();
		   //reading list by using  for loop
		   
		     for(int i = 0;i<allop.size();i++)
		   {
			   Thread.sleep(2000);
			   String op = allop.get(i).getText();
			   System.out.println(op); 
		   }
		     //Eliminate duplicate by using Hashsat method
		     HashSet<String> at = new HashSet<String>();
		     for(int i = 0;i<=allop.size();i++)
		     {
		    	 Thread.sleep(2000);
		    	 WebElement op = allop.get(i);
		    	 String options = op.getText();
		    	 System.out.println(options);
		    	 Thread.sleep(2000);
		    	 at.add(options);
		    	 
		     }
		     for(String opm:at)
		     {
		    	 System.out.println(opm);
		    	 
		     }
	}

}
