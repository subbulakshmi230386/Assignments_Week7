package page;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import base.CommonMethods;
public class MyLeadPage extends CommonMethods
{
	

	public MyLeadPage(ChromeDriver driver)
	{
		this.driver=driver;
	} 
	public CreateLead clickcreateLead()
	{
		driver.findElement(By.linkText(prop.getProperty("MyLeadPage.CreateLead.LinkText"))).click();
		return new CreateLead(driver);
	}
}
