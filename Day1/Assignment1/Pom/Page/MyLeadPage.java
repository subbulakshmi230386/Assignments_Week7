package page;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.ProjectCommonMethods;

public class MyLeadPage extends ProjectCommonMethods
{
	
	public MyLeadPage(ChromeDriver driver)
	{
		this.driver=driver;
	} 
	
   public CreateLeadPage clickcreateLead()
   {
	   driver.findElement(By.linkText("Create Lead")).click();
	   return new CreateLeadPage(driver);
   }



  
}
