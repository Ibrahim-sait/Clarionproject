package clari;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchpage extends basepage {

	public searchpage(){
		PageFactory.initElements(driver , this);
	}
	 @FindBy(xpath = "//*[text()='Home']")	
	 WebElement homeclick;
	 
	 public WebElement homeclickise(){
		 return homeclick;
	 }
	
	 @FindBy(xpath = "//*[text()='Promises From']")	
	 WebElement promisefrom;
	 
	 public WebElement promisefrom(){
		 return promisefrom;
	 }
	 
	 @FindBy(xpath = "//input[@name='btnSearch']")	
	 WebElement searchbtn;
	 
	 public WebElement searchbtn(){
		 return searchbtn;
	 }
	 @FindBy(xpath = "(//table//tbody//tr[3]//td[3])[2]")	
	 WebElement tablecontent;
	 
	 public WebElement tablecontent(){
		 return tablecontent;
	 }
	 
	 @FindBy(xpath = "//a[@title='Move to First Page']")	
	 WebElement firstpage;
	 
	 public WebElement firstpage(){
		 return firstpage;
	 }
	 
	 @FindBy(xpath = "//a[@title='Move to Next Page']")	
	 WebElement nextpage;
	 
	 public WebElement nextpage(){
		 return nextpage;
	 }
	 
	 
	 @FindBy(xpath = "//a[@title='Move to Last Page']")	
	 WebElement lastpage;
	 
	 public WebElement lastpage(){
		 return lastpage;
	 }
	 @FindBy(xpath="/html/body/table/tbody/tr[6]/td/table/tbody/tr[6]/td/table/tbody")
	WebElement table;
	 
	 
	 
	 public boolean verifypromise(String text) throws InterruptedException{
			List<WebElement> rows=table.findElements(By.xpath("/html/body/table/tbody/tr[6]/td/table/tbody/tr[6]/td/table/tbody//tr/td/table/tbody/tr"));
			for(WebElement row:rows){
				Thread.sleep(1000);
				List<WebElement> coloum=row.findElements(By.xpath("/html/body/table/tbody/tr[6]/td/table/tbody/tr[6]/td/table/tbody//tr/td/table/tbody/tr/td[3]"));
			for(WebElement protext:coloum){	
			String name=protext.getText();
				if(name.equalsIgnoreCase(text)){
					return true;
				}	
				else{
					nextpage.sendKeys(Keys.ENTER);
				}
			}
			}
			return false;		
				
			
			}
		 
		 
		 
		 
	 }

