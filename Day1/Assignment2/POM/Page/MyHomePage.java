package page;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.ProjectCommonMethods;

public class MyHomePage extends ProjectCommonMethods
{
	public MyHomePage(ChromeDriver driver)
	{
		this.driver=driver;
	} 
	
	 public MyLeadPage clickLead() 
	 {
		 driver.findElement(By.linkText("Leads")).click();
		 return new MyLeadPage(driver);
	 }
	
}
