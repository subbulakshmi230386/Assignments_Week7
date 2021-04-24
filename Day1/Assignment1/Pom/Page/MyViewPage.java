package page;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.ProjectCommonMethods;

public class MyViewPage extends ProjectCommonMethods
{
	public MyViewPage(ChromeDriver driver)
	{
		this.driver=driver;
	} 
	public MyViewPage verifyFirstName()
	{
		String fname=driver.findElement(By.id("viewLead_firstName_sp")).getText();
	     System.out.println("Verified Firstname"+fname);
	     return new MyViewPage(driver);
	}
 
}
