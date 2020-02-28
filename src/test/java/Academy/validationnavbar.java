package Academy;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pageobject.Landingpage;
import resources.base;

public class validationnavbar extends base
{
@Test

	public void basenavigation() throws IOException
	
	{
		driver=IntializeDriver();
	    driver.get("http://www.qaclickacademy.com/");
	    
	    Landingpage l =new Landingpage(driver);
	    Assert.assertTrue(l.getnavbar().isDisplayed());
	    //Assert.assertfalse(false);
	}
}