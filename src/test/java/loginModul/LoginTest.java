package loginModul;
import java.awt.AWTException;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Library_File.BASE_CLASS;
import Library_File.FileUploadPage;
import Library_File.LoginPage;

public class LoginTest extends BASE_CLASS 
{
	LoginPage Login;
	FileUploadPage page1;

	@BeforeMethod
	public void login() throws AWTException, InterruptedException 
	{
		Login = new LoginPage(driver);

		Login.PerformLogin();

		page1=new FileUploadPage(driver);

		page1.PAGE1();
	}
	
	@Test
	public void TC1() 
	{
		Reporter.log("TC1 is pass");

	}


}
