package Academy;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pageobject.Landingpage;
import Pageobject.LoginPage;
import resources.base;

public class Homepage extends base{
	
	@Test(dataProvider="getData")
	
	public void basenavigation(String username,String password) throws IOException
	
	{
		driver=IntializeDriver();
	    driver.get("http://www.qaclickacademy.com/");
	    
	    Landingpage l =new Landingpage(driver);
	    l.getlogin().click();
	    
	    LoginPage lp= new LoginPage(driver);
	    lp.getEmail().sendKeys(username);
	    lp.getpassword().sendKeys(password);
	    lp.getLogin().click();
	    
	}

	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[2][2];
		
		data[0][0]="non-restricteduser@qw.com";
	    data[0][1]="12345";
	    
	    data[1][0]="restricteduser@qw.com";
	    data[1][1]="123";
	    
	    return data;
	 }
}
