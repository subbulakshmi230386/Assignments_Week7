package page;



	

import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;

	import base.CommonMethods;

	public class LoginPage extends CommonMethods
	{
		public LoginPage(ChromeDriver driver)
		{
			this.driver=driver;
			
		}
	  public  LoginPage enterUserName(String username)
	  {
		  driver.findElement(By.id(prop.getProperty("LoginPage.username.Id"))).sendKeys(username);
		  return this;
	  }
	  public LoginPage enterPassWord(String password)
	  {
		  driver.findElement(By.id(prop.getProperty("LoginPage.password.Id"))).sendKeys(password);
		  return this;
	  }
	  public HomePage clickLogin()
	  {
		  driver.findElement(By.className(prop.getProperty("LoginPage.LoginButton.ClassName"))).click();
		
		  return new HomePage(driver);
	  }
	}

