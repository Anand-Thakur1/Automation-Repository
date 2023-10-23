package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationDisable {
   public static void main(String[] args) {
	

	
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--disable-notification");
	
      WebDriver driver =	new ChromeDriver(co);
      driver.manage().window().maximize();
      driver.get("https://www.airvistara.com/flights/en-in/?gclid=CjwKCAjwjaWoBhAmEiwAXz8DBcyJYth49YkojS2w8gt944UY2iJomCjH41XrcUmrALjxusj86RIXgBoCjcEQAvD_BwE&utm_source=google&utm_medium=Search&utm_campaign=PMX_Brand_Dom_Search_Nov_22&ef_id=CjwKCAjwjaWoBhAmEiwAXz8DBcyJYth49YkojS2w8gt944UY2iJomCjH41XrcUmrALjxusj86RIXgBoCjcEQAvD_BwE:G:s&s_kwcid=AL!596!3!665237401807!p!!g!!vistara%20airlines&s_kwcid=AL!596!3!665237401807!p!!g!!vistara+airlines&gad=1");
      driver.findElement(By.id("cookieModalCloseBtn")).click();
   }
}
