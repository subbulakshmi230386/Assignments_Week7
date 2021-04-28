package page;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.CommonMethods;

public class MyHomePage extends CommonMethods
{
	public MyHomePage(ChromeDriver driver)
	{
		this.driver=driver;
		
	}
	public MyLeadPage clickLead() 
	 {
		 driver.findElement(By.linkText(prop.getProperty("MyHomePage.Leads.LinkText"))).click();
		 return new MyLeadPage(driver);
	 }
	
}
