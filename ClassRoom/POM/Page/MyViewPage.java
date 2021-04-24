package page;

import org.openqa.selenium.By;


import Base.ProjectCommonMethods;

public class MyViewPage extends ProjectCommonMethods
{
	public MyViewPage verifyFirstName()
	{
		String fname=driver.findElement(By.id("viewLead_firstName_sp")).getText();
	     System.out.println("Verified Firstname"+fname);
	     return new MyViewPage();
	}
 
}
