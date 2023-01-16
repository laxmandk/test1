package Library_File;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BASE_CLASS 
{
	public static WebDriver driver;

	@BeforeClass
	public void initialisebrowser() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

		driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://testiopro.iea.net/upload");

		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	}



}
