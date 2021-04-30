package page;

import base.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class CreateLead extends CommonMethods
{
	public CreateLead(ChromeDriver driver)
	{
		this.driver=driver;
	} 
	 public CreateLead entercompanyName()
		{
			driver.findElement(By.id(prop.getProperty("CreateLead.Companyname.Id"))).sendKeys("CTS");
			return this;
		}							
		
		public CreateLead enterfirstName()
		{
			driver.findElement(By.id(prop.getProperty("CreateLead.Firstname.Id"))).sendKeys("Megala");
			return this;
		}
		
		public CreateLead enterlastName()
		{
			driver.findElement(By.id(prop.getProperty("CreateLead.Lastname.Id"))).sendKeys("Prasadth");
			return this;
		
		}
		public CreateLead submitButton()
		{
			driver.findElement(By.name(prop.getProperty("CreateLead.submitbutton.Name"))).click();
			return this;
		}
}
