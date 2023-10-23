package dropDown;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectionMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		Thread.sleep(2000);
		WebElement dd1 = driver.findElement(By.xpath("//select[contains(@class,'linear transition-all duration-150 w-5/12')]"));
		Select sel = new Select(dd1);
		sel.selectByIndex(3);
		Thread.sleep(2000);
		WebElement dd2 = driver.findElement(By.xpath("//label[text()='Country']/following-sibling::select[@class='border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring w-full ease-linear transition-all duration-150']"));
		Select sel1 = new Select(dd2);
		sel1.selectByValue("India");
		Thread.sleep(2000);
		WebElement dd3 = driver.findElement(By.xpath("//label[text()='State']/following-sibling::select[@class='border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring w-full ease-linear transition-all duration-150']"));
	    Select sel2 = new Select(dd3);
	    sel2.selectByVisibleText("Rajasthan");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[text()='Multi Select']")).click();
	    Thread.sleep(2000);
	    WebElement dd4 = driver.findElement(By.xpath("//label[text()='Country']/following-sibling::select"));
	    Select sel3 = new Select(dd4);
	    Thread.sleep(2000);
	    for (int i = 0;i<=5;i++)
	    {
	    	sel3.selectByIndex(i);
	    }
	    }

}
