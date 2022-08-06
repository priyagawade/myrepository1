package com.sauceDemoPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SingleProductAddToCartPOMClass
{
   WebDriver driver;
   
   @FindBy(css="#add-to-cart-sauce-labs-backpack")
  private WebElement addtocart;
   
   public void addToCart()
   {
	   addtocart.click();
   }
   
   @FindBy(xpath="//span[@class='shopping_cart_badge']")
	private WebElement addToCartButton;
	
	public String getTextFromCartButton()
	{
		 String totalProducts= addToCartButton.getText();
		 return totalProducts;
	}

  
	
	
	
	
   @FindBy(css=".shopping_cart_link")
   private WebElement container;
   
   public void addToCartContainer()
   {
	   container.click();
   }
   
   @FindBy(css=".product_sort_container")
  private WebElement filter;
   
   public void filterDropdown()
   {
	   filter.click();
	   
	   Select sl=new Select(filter);
	   sl.selectByVisibleText("Name (A to Z)");
   }
  
   
   
   
    public  SingleProductAddToCartPOMClass(WebDriver driver)
       {
    	 this.driver=driver;
    	 PageFactory.initElements(driver,this);
    	 
	    }
     
     
     }

