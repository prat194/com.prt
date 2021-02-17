package com.sr.genericlib;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class utilities {

	public void dropdown(WebElement ele,String text) {
	Select s=new Select(ele);
	s.selectByVisibleText(text);	
	}
	
	public void mouseAction(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
	}
	
	public void doubleclick(WebDriver driver,WebElement target) {
		Actions a=new Actions(driver);
		//a.doubleClick(target).perform();
		a.doubleClick(target).perform();
	}
	
	public void scrollbar(WebDriver driver,int x,int y) {
	    JavascriptExecutor j=(JavascriptExecutor)driver;	
		j.executeScript("window.scrollBy("+x+","+y+")");
	}
	
	public void alertpopup(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	public void elementToclicked(WebDriver driver,WebElement element) {
	WebDriverWait w=new WebDriverWait(driver,10);
	w.until(ExpectedConditions.elementToBeClickable(element));
	}
}
