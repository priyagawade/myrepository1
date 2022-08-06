package com.sauceDemoTestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.sauceDemoPOMClasses.HomepagePOMClass;
import com.sauceDemoUtilityClasses.UtilityClass;

public class TC003_ValidateMultipleProductAddedToCartFunctionality extends TestBaseClass
{
	@Test
	public void homePageFunctionality() throws IOException
  {
		HomepagePOMClass hp = new HomepagePOMClass(driver);
	    hp.multiplebuttonclick();
	    UtilityClass.takeScreenshot(driver);
	    
	   String actaulCount =  hp.getTextFromCartButton();
	    
	   String expectedCount = "6";
	   
		Assert.assertEquals(actaulCount,expectedCount,"title are not matching");

		
		UtilityClass.takeScreenshot(driver);
		
}
}
