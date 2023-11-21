package readPropertyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReaddataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("./src/main/resources/configuration.properties");
		Properties p = new Properties();
		p.load(fis);
		
		String data = p.getProperty("Username");
		System.out.println(data);
		
	}
}
