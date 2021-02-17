package com.sr.skill;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCart {

	@FindBy(id="add")
	private WebElement addbtn;
	
	@FindBy(xpath="//button[text()=' Add to Cart']")
	private WebElement addtocart;
	
	@FindBy(xpath="//i[@class='fa fa-shopping-cart']")
	private WebElement Cart;
	
	@FindBy(xpath="//a[text()='Go to Cart']")
	private WebElement Gotocart;
	
	public AddtoCart(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void addtocartbuton()
	{
		addtocart.click();
	}
	
	public void cartbuton()
	{
		Cart.click();
	}
	public void gotocart()
	{
		Gotocart.click();
	}

	public WebElement getAddbtn() {
		return addbtn;
	}
	
}
