package test;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import clari.basepage;
import clari.objloginpage;
import clari.promisepage;
import clari.searchpage;

public class testloginpage  {
	basepage bp;
	searchpage sp;
	objloginpage ob;
	promisepage pg;
	public testloginpage(){
		 bp=new basepage();
             sp= new searchpage();
		 ob= new objloginpage();
        pg= new promisepage();
	}
	
	
	@Test(priority=1)
	public void nocredentiallogin() throws InterruptedException{
		ob.id().sendKeys("");
		ob.pass.sendKeys("");
		ob.btn().click();
		Assert.assertTrue(ob.error().getText().equalsIgnoreCase("Invalid Username/password"));
		System.out.println("Invalid Username/password");
		Thread.sleep(5000);
		
		
	
	}
	
	@Test(priority=2)
	public void credentiallogin() throws InterruptedException{
		ob.id().sendKeys("sanjeetk@clariontechnologies.co.in");
		ob.pass.sendKeys("clarion");
		ob.btn().click();
		Assert.assertTrue(ob.gettitle().contains("Promises Log"));
		System.out.println("passed");
		ob.logout().click();
		Thread.sleep(5000);
		
	}
	
	@Test(priority=3)
	public void selectdropdown() throws InterruptedException{
		ob.id().sendKeys("sanjeetk@clariontechnologies.co.in");
		ob.pass.sendKeys("clarion");
		ob.btn().click();
		Thread.sleep(1000);
		pg.logpromise().click();
		pg.selectFromDropDown(pg.dropdown(), "4FD8CA8F7257FFE0BF0D13098D160895");
		pg.promisetextbox().sendKeys("Ibrahim Promise: Sonali test is Selected");
		pg.btnlogpromise().click();
		
		
	}
	@Test(priority=4)
	public void verifypromise() throws InterruptedException{
		
		pg.dropdown().click();
		pg.selectFromDropDown(pg.dropdown(), "4FD8CA8F7257FFE0BF0D13098D160895");
		Thread.sleep(1000);
		sp.searchbtn().click();
		System.out.println(sp.verifypromise("Ibrahim Promise: Sonali test is Selected"));
		Assert.assertTrue(sp.verifypromise("Ibrahim Promise: Sonali test is Selected"));
		
		
	}

	@Test(priority=5)
	public void logout(){
		ob.logout().click();
	}
	
	
	/*Thread.sleep(5000);
	System.out.println(ob.dropdown().getText());
	Assert.assertTrue(ob.selectedoption(ob.dropdown()).equals("4FD8CA8F7257FFE0BF0D13098D160895"));*/
}
