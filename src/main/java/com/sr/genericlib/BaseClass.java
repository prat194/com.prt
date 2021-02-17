package com.sr.genericlib;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
/**
 * 
 * @author Prateek
 *
 */
public class BaseClass implements AutoConstant{
	/**
	 * To open browser
	 */
           public WebDriver driver;
           public Propertyfile p;
           public Photo p1;
           public utilities u=new utilities();
           @BeforeMethod
           public void openapp() throws FileNotFoundException, IOException
           {
        	   System.setProperty(key, value);
        	   driver=new ChromeDriver();
        	   driver.manage().window().maximize();
        	   p=new Propertyfile();
        	   driver.get(p.getPropertyData("url"));
        	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 		
           }
           /**
            * To close browser and take photo for failed test case
            * @param r
            * @throws IOException
            */
           
           @AfterMethod
           public void closeapp(ITestResult r) throws IOException
           {
        	   int status=r.getStatus();
        	   String name=r.getName();
        	   if(status==2)
        	   {
        		   p1=new Photo();
        		   p1.getphoto(driver,name);
        	   }
        	  driver.quit(); 
           }
}
