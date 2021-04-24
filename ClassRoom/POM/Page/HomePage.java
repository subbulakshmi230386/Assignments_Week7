package page;


import org.openqa.selenium.By;
import Base.ProjectCommonMethods;

public class HomePage extends ProjectCommonMethods
{
	 
	public LoginPage clickLogoutButton()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
		return new LoginPage();
	
	}
	public MyHomePage clickcrmSfa()
	{

		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage();
	}
	 
}
