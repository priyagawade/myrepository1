package com.sauceDemoPOMClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomepagePOMClass
{
    WebDriver driver;
   private Select sl;
   
   //multiple product added
  @FindBy(xpath="//button[text()='Add to cart']")  private List<WebElement> bagbutton; 
   public void multiplebuttonclick()
  {
	  for( WebElement i:bagbutton)
	  {
		  i.click();
	  }
	  System.out.println("All Products are Added to Cart");
  }
   
   //get text of all products
   @FindBy(xpath="//span[@class='shopping_cart_badge']")
	private WebElement addToCartButton;
	
	public String getTextFromCartButton()
	{
		 String totalProducts= addToCartButton.getText();
		 return totalProducts;
	}

   
    //container
   @FindBy(css=".shopping_cart_link")   private WebElement container;
    public void addToCartContainer()
   {
	   container.click();
		  System.out.println("Products are succesfully added");

   }
   
    //filter dropdown
   @FindBy(css=".product_sort_container")   private WebElement filter;
     public void filterDropdown()
   {
	   filter.click();
	    sl.selectByVisibleText("Name (A to Z)");
   }
  
    public HomepagePOMClass( WebDriver driver)
  {
	  this.driver=driver;
	  PageFactory.initElements(driver,this);
	   sl=new Select(filter);
  }
   
  
}
