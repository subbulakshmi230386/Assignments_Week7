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
 
  public CreateLeadPage entercompanyName(String cname)
	{
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		return this;
	}							
	
	public CreateLeadPage enterfirstName(String fname)
	{
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		return this;
	}
	
	public CreateLeadPage enterlastName(String lname)
	{
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		return this;
	
	}
		
public MyViewPage clicksubmit()
  {
	driver.findElement(By.name("submitButton")).click();  
	return new MyViewPage(driver);
  }

}
