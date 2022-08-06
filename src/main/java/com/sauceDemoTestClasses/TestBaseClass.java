package com.sauceDemoTestClasses;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.sauceDemoPOMClasses.LoginPOMClass;

public class TestBaseClass
{
   WebDriver driver;
   Logger log = Logger.getLogger("SauceDemoMavenProject");

   @Parameters("browsername")
   @BeforeMethod
   public void setUp(String browsername)
   {
	   
	   if(browsername.equals("chrome"))
	   {
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\priya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
	   }
	   else if(browsername.equals("edge"))
	   {
		   System.setProperty("webdriver.edge.driver","D:\\ZipFiles\\msedgedriver.exe");

			 driver =  new EdgeDriver();			
	   }
	   else
	   {
		   
		   System.out.println("throw the error");
	   }
	   PropertyConfigurator.configure("log4j.properties");

	   log.info("browser is opened");
	   
		driver.manage().window().maximize();
	    log.info("browser is maximized");
		
		driver.get("https://www.saucedemo.com/");
		log.info("url is opened");
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		log.info("implicit wait is applied");
		
		
		LoginPOMClass sdp=new LoginPOMClass(driver);
		
		sdp.sendUsername();
		 log.info("username is entered");
		
		sdp.sendPassword();
		 log.info("password is entered");
		
		sdp.clickLoginButton();
		 log.info("clicked on login button");
   
   }
  

   public void tearDown()
   {
	   driver.quit();
	   log.info("Browser is Closed");
   }
  
   
   
}
