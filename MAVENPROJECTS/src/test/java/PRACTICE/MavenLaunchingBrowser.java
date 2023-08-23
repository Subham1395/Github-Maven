package PRACTICE;

import java.io.FileInputStream;
import java.util.Properties;

public class MavenLaunchingBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileInputStream fids = new FileInputStream("src/test/resources/commondata.properties.txt");
		Properties poj= new Properties();
		poj.load(fids);
		String BROSWER = poj.getProperty("browser");
		WebDriver driver;
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
		}
		else if (BROWSER.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else
		{
			driver = new ChromeDriver();
		}
		

	
		System.out.println("hello maven");
	}
}
