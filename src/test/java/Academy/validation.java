package Academy;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pageobject.Landingpage;
import Pageobject.LoginPage;
import resources.base;

public class validation extends base
{
@Test
	
	public void basenavigation() throws IOException
	
	{
		driver=IntializeDriver();
	    driver.get("http://www.qaclickacademy.com/");
	    
	    Landingpage l =new Landingpage(driver);
	    Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES123");
	    
    
	
	
}

	
	}
