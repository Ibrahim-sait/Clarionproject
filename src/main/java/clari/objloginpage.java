package clari;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;


public class objloginpage extends basepage {
	
	public objloginpage(){
		PageFactory.initElements(driver , this);
	}
		 @FindBy(xpath = "//input[@name='txtUsername']")	
		 WebElement id;
		 
		 public WebElement id(){
			 return id;
		 }
		
		 @FindBy(xpath = "//input[@name='txtPassword']")	
		 public WebElement pass;
		 
		  WebElement pass(){
			 return pass;
		 }
		
		 @FindBy(xpath = "//*[@name='submit1']")	
		 WebElement btn;
		 
		 public WebElement btn(){
			 return btn;
		 }
		 
		 @FindBy(xpath = "//*[text()='Invalid Username/password']")	
		 WebElement error;
		 
		 public WebElement error(){
			 return error;
 }
		 @FindBy(xpath="/html/body/table/tbody/tr[1]/td/table/tbody/tr[1]/td[3]/table/tbody/tr[1]/td/a[3]/b")
 
		WebElement logout;
		 
		 public WebElement logout(){
			 return logout;
		 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
}
