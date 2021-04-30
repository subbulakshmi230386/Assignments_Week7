package page;




import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.CommonMethods;

public class HomePage extends CommonMethods
{
	public HomePage(ChromeDriver driver)
	{
		this.driver=driver;
	} 
	/*public LoginPage clickLogoutButton()
	{
		driver.findElement(By.className(prop.getProperty("HomePage.logout.ClassName"))).click();
		return new LoginPage(driver);
	
	}*/
	public MyHomePage clickcrmSfa()
	{

		driver.findElement(By.linkText(prop.getProperty("HomePage.Crmsfa.LinkText"))).click();
		return new MyHomePage(driver);
	}
	 
}
