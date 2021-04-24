package page;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Base.ProjectCommonMethods;

public class CreateLeadPage extends ProjectCommonMethods
{

 
  public CreateLeadPage entercompanyName()
	{
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
		return this;
	}							
	
	public CreateLeadPage enterfirstName()
	{
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Deepan");
		return this;
	}
	
	public CreateLeadPage enterlastName()
	{
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");
		return this;
	
	}
		
public MyViewPage clicksubmit()
  {
	driver.findElement(By.name("submitButton")).click();  
	return new MyViewPage();
  }

}
