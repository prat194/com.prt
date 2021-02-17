package com.sr.Testscripts;

import org.testng.annotations.Test;

import com.sr.genericlib.BaseClass;
import com.sr.skill.AddtoCart;
import com.sr.skill.Login;

public class Addingtocart extends BaseClass{

	@Test
	public void tc1() throws InterruptedException
	{
		Login l=new Login(driver);
		u.mouseAction(driver,l.getCoursetab());
		l.seleniumtraingbtn();
		
		AddtoCart a=new AddtoCart(driver);
		u.doubleclick(driver,a.getAddbtn());
		a.addtocartbuton();
		u.alertpopup(driver);
		a.cartbuton();
		a.gotocart();
	}	
}
