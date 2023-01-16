package Library_File;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class Utility_Class 
{
	public static void robot() throws AWTException 
	{
		Robot rb=new Robot();	
		rb.delay(2000);		
		StringSelection ss=new StringSelection("C:\\Users\\admin\\Desktop\\Express Car 3.pdf");

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		//CTROL+V
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);	
		//ENTER
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
	}


}
