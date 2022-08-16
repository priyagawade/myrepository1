package com.sauceDemoPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMClass 
{

	   WebDriver driver;                 // webdriver is a datatype
	   
	   @FindBy(css="#user-name")
		private WebElement userName;     //webelement is a datatype
	   
	   public void sendUsername()
	   {
		   userName.sendKeys("standard_user");
		   System.out.println("Username is Entered");
	   }
	   
	   @FindBy(css="#password")
    private WebElement password;
	   
	   public void sendPassword()
	   {
		   password.sendKeys("secret_sauce");
		   System.out.println("Password is Entered");

	   }
	   
	   @FindBy(css="#login-button")
	  private WebElement loginButton;
	   
	   public void clickLoginButton()
	   {
		   loginButton.click();
		   System.out.println("Clicked on Login Button");

	   }
	   
	   public LoginPOMClass(WebDriver driver)
	   {
		   this.driver=driver;
		   
			PageFactory.initElements(driver, this);
	   }

}
