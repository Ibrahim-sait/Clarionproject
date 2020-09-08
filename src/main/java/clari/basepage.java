package clari;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class basepage {
	public static WebDriver driver;
	public String browser = "chrome";

	public basepage() {
		if (driver == null) {
			if (browser.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "D:\\ali\\chrome\\chromedriver.exe");
				driver = new ChromeDriver();

			} else if (browser.equals("firefox")) {
				System.setProperty("webdriver.gecko.driver", "path for firefox driver");
				driver = new FirefoxDriver();

			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("http://182.74.238.221/clarion_promise_qa/index.php#");
		}
	}

	public void setText(WebElement element, String name) {
		if (name != null) {
			element.click();
			element.clear();
			element.sendKeys(name);
		}

	}

	public void navigateback() {
		driver.navigate().back();
	}

	public String gettitle() {
		return driver.getTitle();
	}

	public String getattribute(WebElement element) {
		return element.getAttribute("value");

	}

	public String gettext(WebElement element) {
		return element.getText();
	}

	public void selectFromDropDown(WebElement element, String option) {
		Select obj = new Select(element);
		obj.selectByValue(option);
	}
	public String selectedoption(WebElement element){
		Select obj = new Select(element);
		WebElement sel=obj.getFirstSelectedOption();
		return sel.getText();
}

	

	public boolean webtable() throws InterruptedException{
	List <WebElement>tableRows = driver.findElements(By.xpath("/html/body/table/tbody/tr[6]/td/table/tbody/tr[6]/td/table/tbody"));
	
	for (WebElement row : tableRows) {
		List<WebElement>tableCells = row.findElements(By.xpath("/html/body/table/tbody/tr[6]/td/table/tbody/tr[6]/td/table/tbody/tr/td/table/tbody/tr"));
		
		for (WebElement cell : tableCells) {
			if(cell.getText().equals("Ibrahim Promise: Sonali test is Selected")){
				return true;
			
			}
			else{
			WebElement	nextpage = driver.findElement(By.xpath("//a[@title='Move to Next Page']"));
			nextpage.click();
			Thread.sleep(3000);
			}
}

	}
	
	return false;
	
	
	}	
	public void explicitwait(WebElement element){
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void close(){
	driver.close();
	}
	
}