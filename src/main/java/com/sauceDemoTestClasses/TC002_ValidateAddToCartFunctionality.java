package com.sauceDemoTestClasses;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.sauceDemoPOMClasses.SingleProductAddToCartPOMClass;
import com.sauceDemoUtilityClasses.UtilityClass;

public class TC002_ValidateAddToCartFunctionality extends TestBaseClass
{
  
	@Test
	public  void validateAddToCartFunctionality() throws IOException, InterruptedException 
 {
	   SingleProductAddToCartPOMClass hp = new SingleProductAddToCartPOMClass(driver);
	    hp.addToCart();
	    
	    UtilityClass.takeScreenshot(driver);
	    Thread.sleep(3000);
	    
	   hp.filterDropdown();
	   UtilityClass.takeScreenshot(driver);
	    
	   String actaulCount =  hp.getTextFromCartButton();
	    
	   String expectedCount = "1";
	   
		Assert.assertEquals(actaulCount,expectedCount,"title are not matching");

	   UtilityClass.takeScreenshot(driver);

}
}
