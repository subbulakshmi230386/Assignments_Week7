package page;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.ProjectCommonMethods;

public class CreateLeadPage extends ProjectCommonMethods
{
public CreateLeadPage(ChromeDriver driver)
{
	this.driver=driver;
}
 
  public CreateLeadPage entercompanyName()
	{
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
		return this;
	}							
	
	public CreateLeadPage enterfirstName()
	{
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sathya");
		return this;
	}
	
	public CreateLeadPage enterlastName()
	{
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Bharathi");
		return this;
	
	}
		
public MyViewPage clicksubmit()
  {
	driver.findElement(By.name("submitButton")).click();  
	return new MyViewPage(driver);
  }

}
