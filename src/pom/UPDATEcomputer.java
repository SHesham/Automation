package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class UPDATEcomputer 
{
	WebDriver driver;
	@FindBy(how=How.ID, using="name")
	public WebElement compname;
	@FindBy(how=How.ID, using="introduced")
	public WebElement introdate;
	@FindBy(how=How.ID, using="discontinued")
	public WebElement disdate;
	@FindBy(how=How.ID, using="company")
	public WebElement company;
	@FindBy(how=How.CSS, using=".btn.primary")
	public WebElement create;
	@FindBy(how=How.CSS, using=".btn")
	public WebElement cancel;
	
	ADDcomputer add = PageFactory.initElements(driver, ADDcomputer.class);
	
	public UPDATEcomputer(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void update(String name, String idate, String ddate)
	{
		compname.clear();
		compname.sendKeys(name);
		introdate.clear();
		introdate.sendKeys(idate);
		disdate.clear();
		disdate.sendKeys(ddate);
		Select TheCompany = new Select(company);
		TheCompany.selectByIndex(5);
		create.click();
	}
	
	public void cancel()
	{
		add.cancel();
	}
}
