package methodOfWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();	
		//handle properties of browser
		//Maximize
		//minimize
		//fullscreen
		//set size
		
		//maximise the browser
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//maximise the browser
		driver.manage().window().minimize();
		Thread.sleep(2000);
		//full screen
		driver.manage().window().fullscreen();
		//set size
		Dimension targetSize = new Dimension(350, 450);
		driver.manage().window().setSize(targetSize);
		Thread.sleep(2000);
		//set possition 
		Point targetPossition = new Point(450,250);
		driver.manage().window().setPosition(targetPossition);
		
	}

}
