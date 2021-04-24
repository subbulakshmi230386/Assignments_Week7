package page;

import org.openqa.selenium.By;


import Base.ProjectCommonMethods;

public class MyHomePage extends ProjectCommonMethods
{
	
	
	 public MyLeadPage clickLead() 
	 {
		 driver.findElement(By.linkText("Leads")).click();
		 return new MyLeadPage();
	 }
	
}
