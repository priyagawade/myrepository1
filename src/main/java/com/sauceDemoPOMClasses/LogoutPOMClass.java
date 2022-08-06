package com.sauceDemoPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPOMClass 

{
	WebDriver driver;
	
	Actions act;
	
   @FindBy(css="#react-burger-menu-btn")  private WebElement settinglogo;
   
   public void settingButton()
   {
	   settinglogo.click();
	   System.out.println("Clicked on Setting Menu");
   }
   
   @FindBy(xpath="//a[@id='logout_sidebar_link']") private WebElement logout;
   
   public void logoutButton()
   {
              act.click(logout).perform();
              System.out.println("You are Successfully Logout");
   }
   
   public LogoutPOMClass(WebDriver driver)
   {
	   this.driver=driver;
	   
	   PageFactory.initElements(driver,this);
	   
	   act=new Actions(driver);
   }
}
