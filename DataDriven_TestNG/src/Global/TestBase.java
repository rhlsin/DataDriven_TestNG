package Global;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class TestBase
{
	public WebDriver driver=null;
	
	@Test
	public void Login1() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("D:\\My Doc\\Programs\\Java_Programs\\DataDriven_TestNG\\D_driven.properties");
		
		prop.load(fis);
		
		System.out.println(prop.getProperty("username"));
		
		if(prop.getProperty("browser").equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C://selenium//chromedriver_win32//chromedriver.exe");

			driver=new ChromeDriver();
		}
		else if(prop.getProperty("browser").equals("firefox"))
		{
			driver=new FirefoxDriver();

		}
		else
		{
			driver=new InternetExplorerDriver();

		}
		driver.get(prop.getProperty("url"));
		}

	

}
