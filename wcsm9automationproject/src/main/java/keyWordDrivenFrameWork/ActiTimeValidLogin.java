package keyWordDrivenFrameWork;

import java.io.IOException;

import org.openqa.selenium.By;

public class ActiTimeValidLogin extends BaseTest
{
	public static void main(String[] args) throws IOException {
		
		BaseTest bt = new BaseTest();
		bt.OpenBrowser();
		
		Flib flib = new Flib();
		
		driver.findElement(By.name("username")).sendKeys(flib.readDataFromProperty("./src/main/resources/config.properties","Username"));
		driver.findElement(By.name("pwd")).sendKeys(flib.readDataFromProperty("./src/main/resources/config.properties","Password"));
		driver.findElement(By.id("loginButton")).click();
		bt.CloseBrowser();
	}
	

}
