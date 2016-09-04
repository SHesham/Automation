package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class ADDcomputer 
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
	
	public ADDcomputer(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void addnew(String titel, String Idate, String Ddate)
	{
		compname.sendKeys(titel);
		introdate.sendKeys(Idate);
		disdate.sendKeys(Ddate);
		Select TheCompany = new Select(company);
		TheCompany.selectByIndex(3);
		create.click();
	}
	
	public void cancel()
	{
		cancel.click();
	}
}
