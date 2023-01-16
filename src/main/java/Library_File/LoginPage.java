package Library_File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{      
	public WebDriver driver;

	@FindBy(xpath="//div[@class='login_form']//button[text()='Login']")  private WebElement lgnbtn;
	@FindBy(xpath="//input[@type=\"email\"]")    private WebElement UN;
	@FindBy(xpath="//input[@type=\"submit\"]")   private WebElement Next;
	@FindBy(xpath="//input[@name=\"passwd\"]")   private WebElement PW;
	@FindBy(xpath="//input[@data-report-event=\"Signin_Submit\"]")   private WebElement Signin;
	//@FindBy(xpath="//button[@type=\"submit\"]")  private WebElement Signin;
	//@FindBy(xpath="//button[@type=\"submit\"]")  private WebElement Yes;

	@FindBy(xpath="//input[@type=\"submit\"]") private WebElement Yes;

	public LoginPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);	
	}

	public void PerformLogin() throws InterruptedException 
	{
		lgnbtn.click();
		Thread.sleep(2000);
		UN.sendKeys("samadmin@iea.net");
		Thread.sleep(2000);
		Next.click();
		Thread.sleep(3000);
		PW.sendKeys("H=\\9JkxAo4?r");
		Thread.sleep(3000);
		Signin.click();
		Thread.sleep(2000);
		Yes.click();
	}

}
