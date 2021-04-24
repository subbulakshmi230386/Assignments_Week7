package page;

import org.openqa.selenium.By;


import Base.ProjectCommonMethods;

public class MyLeadPage extends ProjectCommonMethods
{
	
	  
	
   public CreateLeadPage clickcreateLead()
   {
	   driver.findElement(By.linkText("Create Lead")).click();
	   return new CreateLeadPage();
   }



  
}
