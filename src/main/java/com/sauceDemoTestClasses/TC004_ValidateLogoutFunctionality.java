package com.sauceDemoTestClasses;
import java.io.IOException;

import org.testng.annotations.Test;

import com.sauceDemoPOMClasses.LogoutPOMClass;
import com.sauceDemoUtilityClasses.UtilityClass;

public class TC004_ValidateLogoutFunctionality extends TestBaseClass

{
	   @Test
		public void validateLogoutFunctionality() throws InterruptedException, IOException
	 {
		 
		   LogoutPOMClass lp=new LogoutPOMClass(driver);
		   
		   lp.settingButton();
		   UtilityClass.takeScreenshot(driver);
		   
		   Thread.sleep(3000);
		   
		   lp.logoutButton();
		   UtilityClass.takeScreenshot(driver);
		   
	   String actualTitle= driver.getTitle();
	   System.out.println("actual Title is -" +actualTitle);
			
	  String expectedTitle ="Swag Labs";
			 
		 if(expectedTitle.equals(actualTitle))
	 {
		 System.out.println("test case is passed Title is matched");
	 }
	 else
	 {
		 System.out.println("test case is failed");

	 }
		 UtilityClass.takeScreenshot(driver);
}
}