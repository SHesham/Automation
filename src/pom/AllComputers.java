package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AllComputers 
{

	WebDriver driver;
	@FindBy(how=How.ID, using="searchbox")
	public WebElement Searchbox;
	@FindBy(how=How.ID, using="searchsubmit")
	public WebElement Searchbtn;
	@FindBy(how=How.ID, using="add")
	public WebElement Createnew;
	@FindBy(how=How.XPATH, using=".//*[@id='main']/table/tbody/tr[4]/td[1]/a")
	public WebElement company_name;
	
	public AllComputers(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void search(String Searchtext)
	{
		Searchbox.sendKeys(Searchtext);
		Searchbtn.click();
	}
	
}
