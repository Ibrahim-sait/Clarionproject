package clari;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class promisepage extends basepage {
	
	public promisepage(){
		PageFactory.initElements(driver , this);
	}
	
	 @FindBy(xpath = "//*[text()='Log Promise']")	
	 WebElement logpromise;
	 
	 public WebElement logpromise(){
		 return logpromise;
	 }
	 
	 @FindBy(xpath = "//select[@name='cboEmp']")	
	 WebElement dropdown;
	 
	 public WebElement dropdown(){
		 return dropdown;
	 }
	 
	 @FindBy(xpath = "//textarea[@id= 'txtPromise']")	
	 WebElement promisetextbox;
	 
	 public WebElement promisetextbox(){
		 return promisetextbox;
	 }
	 
	 @FindBy(xpath = "//input[@id= 'btnSubmit']")	
	 WebElement btnlogpromise;
	 
	 public WebElement btnlogpromise(){
		 return btnlogpromise;
	 }
	

}
