package takeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenShotWay1 {
	public static void main(String[] args) throws IOException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		driver.get("https://www.selenium.dev/");
		File src = driver.getScreenshotAs(OutputType.FILE);
        File ss = new File("./Screenshot/seleniumss2.png");
		Files.copy(src, ss);
	}

}
