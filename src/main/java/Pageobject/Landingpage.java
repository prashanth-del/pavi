package Pageobject;
                                                                                                                
    
	import org.openqa.selenium.By;                                                                                                         
	import org.openqa.selenium.WebDriver;                                                                                                  
	import org.openqa.selenium.WebElement;                                                                                                 
	                                                                                                                                       
	public class Landingpage {                                                                                                             
		                                                                                                                                   
		By signin=By.xpath("//*[@id=\'homepage\']/header/div[1]/div/nav/ul/li[4]/a/span\r\n");
		/*By Email=By.cssSelector("#user_email\r\n");
		By password=By.cssSelector("#user_password");
		By Login=By.xpath("//*[@id=\"new_user\"]/div[3]/input");*/
		
	By Title=By.cssSelector("#content > div > div > h2");
		By navbar=By.cssSelector("nav[class='navbar-collapse collapse']");
		
		
		
		public WebDriver driver;                                                                                                           
		                                                                                                                                   
		public Landingpage(WebDriver driver)                                                                                               
		    {                                                                                                                              
			this.driver = driver;                                                                                                          
			}                                                                                                                              
		                                                                                                                                   
		public  WebElement getlogin()                                                                                                      
		{                                                                                                                                  
			return driver.findElement(signin);                                                                                             
		}  
		
		/*	public  WebElement getEmail()                                                                                                      
		{                                                                                                                                  
			return driver.findElement(Email);                                                                                             
		} 
	
		public  WebElement getpassword()                                                                                                      
		{                                                                                                                                  
			return driver.findElement(password);                                                                                             
		} */
		
		public WebElement getTitle()
		{
			return driver.findElement(Title);
		}
	
		
		public  WebElement getnavbar()                                                                                                      
		{                                                                                                                                  
			return driver.findElement(navbar);                                                                                             
		}  
	}                                                                                                                               
		                                                                                                                                   
		                                                                                                                                   
		                                                                                                                                   
		                                                                                                                                   
		                                                                                                                                   
		                                                                                                                                   
		                                                                                                                                   
		                                                                                                                                   
		                                                                                                                                   
		                                                                                                                                   
		                                                                                                                                                                                                                                                 
	                                                                                                                               


