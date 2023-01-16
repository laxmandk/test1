package Library_File;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileUploadPage 
{

	@FindBy(xpath="//a[@id=\"begin\"]/span[text()='Begin']")     private WebElement begin;
	@FindBy(xpath="(//button[@class=\"btn btn-rounded btn-block label-themecolor col-white\"]/i)[1]")   private WebElement upload;
	@FindBy(xpath="//div[@id=\"dropzone\"]/form[@id=\"demo-upload\"]")       private WebElement Dropfiles;
	@FindBy(xpath="//button[text()='Upload']")    private WebElement UPLOAD;
	@FindBy(xpath="//a[@id=\"begin\"]/span[text()='Begin']")     private WebElement Begin;

	public FileUploadPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);		
	}
	
	   public void PAGE1() throws InterruptedException, AWTException 
	   {
		   Thread.sleep(2000);
		   begin.click(); 
		   Thread.sleep(2000);
		   upload.click();
		   Thread.sleep(2000);
		   Dropfiles.click();
		   Thread.sleep(2000);
		   Utility_Class.robot();
		   Thread.sleep(2000);
		   UPLOAD.click();
		   Thread.sleep(2000);
		   Begin.click(); 
		     
	   }
	
}
