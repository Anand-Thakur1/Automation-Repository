package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AirVista {
public static void main(String[] args) throws InterruptedException {
		
		WebDriver	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.airvistara.com/flights/en-in/?gclid=CjwKCAjwjaWoBhAmEiwAXz8DBcyJYth49YkojS2w8gt944UY2iJomCjH41XrcUmrALjxusj86RIXgBoCjcEQAvD_BwE&utm_source=google&utm_medium=Search&utm_campaign=PMX_Brand_Dom_Search_Nov_22&ef_id=CjwKCAjwjaWoBhAmEiwAXz8DBcyJYth49YkojS2w8gt944UY2iJomCjH41XrcUmrALjxusj86RIXgBoCjcEQAvD_BwE:G:s&s_kwcid=AL!596!3!665237401807!p!!g!!vistara%20airlines&s_kwcid=AL!596!3!665237401807!p!!g!!vistara+airlines&gad=1");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[class='w-full focus:outline-none truncate bg-transparent text-inherit placeholder-current']")).sendKeys("PMQ");
		driver.findElement(By.cssSelector("button[class*='oxd-button oxd']")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("My Info")).click();
		
		driver.findElement(By.cssSelector("input[palceholder='First Name']")).sendKeys("ram");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[palceholder='Middel Name']")).sendKeys("kishan");
		Thread.sleep(2000);
}
}

