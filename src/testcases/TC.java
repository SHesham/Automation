package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.ADDcomputer;
import pom.AllComputers;
import pom.DELETEcomputer;
import pom.UPDATEcomputer;

public class TC
{
WebDriver driver;
ADDcomputer createnewcomputer;
AllComputers Allcomputers;
UPDATEcomputer UpdateComputer;
DELETEcomputer DeleteComputer;

@BeforeTest
public void start()
{
	driver= new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://computer-database.herokuapp.com/computers");	
	Allcomputers = PageFactory.initElements(driver, AllComputers.class);
	createnewcomputer = PageFactory.initElements(driver,ADDcomputer.class);
	UpdateComputer = PageFactory.initElements(driver, UPDATEcomputer.class);
	DeleteComputer = PageFactory.initElements(driver, DELETEcomputer.class);
}

@Test(priority=0)
public void add_test()
{
	Allcomputers.Createnew.click();
	createnewcomputer.addnew("HP S#45", "2007-12-05", "2017-11-16");
	System.out.println(driver.getTitle());
}

@Test(priority=1)
public void delete_test()
{
	Allcomputers.company_name.click();
	DeleteComputer.delete();
	System.out.println(driver.getTitle());
}

@Test(priority=2)
public void update_test()
{
	Allcomputers.company_name.click();
	UpdateComputer.update("Dell-inspirion0530", "2009-10-10", "2020-07-14");
	System.out.println(driver.getTitle());
}

@AfterTest
public void teardown()
{
	driver.close();
}

}
