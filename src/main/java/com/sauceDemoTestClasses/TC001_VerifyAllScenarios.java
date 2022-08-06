package com.sauceDemoTestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
//import com.sauceDemoPOMClasses.LoginPOMClass;

import com.sauceDemoPOMClasses.HomepagePOMClass;
import com.sauceDemoPOMClasses.LoginPOMClass;
import com.sauceDemoPOMClasses.LogoutPOMClass;
import com.sauceDemoPOMClasses.SingleProductAddToCartPOMClass;
import com.sauceDemoUtilityClasses.UtilityClass;


public class TC001_VerifyAllScenarios  extends TestBaseClass
{
	@Test
	public void validateLoginFunctionality() throws IOException
 {
	 
		
		
		
		String actualTitle= driver.getTitle();
		System.out.println("actual Title is -" +actualTitle);
		
		 String expectedTitle ="Swag Labs";
		 
		Assert.assertEquals(actualTitle,expectedTitle);
		 UtilityClass.takeScreenshot(driver);
		
}
//	
//	@Test(priority=1)
//	public void homePageFunctionality() throws IOException
//  {
//		HomepagePOMClass hp = new HomepagePOMClass(driver);
//	    hp.multiplebuttonclick();
//	    UtilityClass.takeScreenshot(driver);
//	    
//	   String actaulCount =  hp.getTextFromCartButton();
//	    
//	   String expectedCount = "6";
//	   
//		Assert.assertEquals(actaulCount,expectedCount);
//
//		
//		UtilityClass.takeScreenshot(driver);
//		
//}
	
//	@Test(priority=2)
//	public  void validateAddToCartFunctionality() throws IOException, InterruptedException 
// {
//	   SingleProductAddToCartPOMClass hp = new SingleProductAddToCartPOMClass(driver);
//	    hp.addToCart();
//	    
//	    UtilityClass.takeScreenshot(driver);
//	    Thread.sleep(3000);
//	    
//	   hp.filterDropdown();
//	   UtilityClass.takeScreenshot(driver);
//	    
//	   String actaulCount =  hp.getTextFromCartButton();
//	    
//	   String expectedCount = "1";
//	   
//		Assert.assertEquals(actaulCount,expectedCount);
//
//	   UtilityClass.takeScreenshot(driver);
//
//}
	
//
//	 @Test(priority=3)
//		public void validateLogoutFunctionality() throws InterruptedException, IOException
//	 {
//		 
//		   LogoutPOMClass lp=new LogoutPOMClass(driver);
//		   
//		   lp.settingButton();
//		   UtilityClass.takeScreenshot(driver);
//		   
//		   Thread.sleep(3000);
//		   
//		   lp.logoutButton();
//		   UtilityClass.takeScreenshot(driver);
//		   
//	   String actualTitle= driver.getTitle();
//	   System.out.println("actual Title is -" +actualTitle);
//			
//	  String expectedTitle ="Swag Labs";
//			 
//		//Assert.assertEquals(actualTitle,expectedTitle);
//         
//		Assert.assertEquals(actualTitle,expectedTitle,"title are not matching");
//
//
//		 UtilityClass.takeScreenshot(driver);
//
//}
}
