package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DELETEcomputer 
{
	WebDriver driver;
	
	@FindBy(how=How.CSS, using=".btn.danger")
	public WebElement delete;
	
	UPDATEcomputer UpdateComputer = PageFactory.initElements(driver, UPDATEcomputer.class);
	
	
	public DELETEcomputer(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void delete()
	{
		delete.click();
	}
	
	public void UpdateData(String Cname, String intro, String Discontinued)
	{
		UpdateComputer.update(Cname, intro, Discontinued);
	}
	
	public void Cancel()
	{
		UpdateComputer.cancel.click();
	}
}
