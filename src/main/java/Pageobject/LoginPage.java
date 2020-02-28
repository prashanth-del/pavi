package Pageobject;


                                                                                                                
    
	import org.openqa.selenium.By;                                                                                                         
	import org.openqa.selenium.WebDriver;                                                                                                  
	import org.openqa.selenium.WebElement;                                                                                                 
	                                                                                                                                       
	public class LoginPage {                                                                                                             
		                                                                                                                                   
		
		By Email=By.cssSelector("#user_email\r\n");
		By password=By.cssSelector("#user_password");
		By Login=By.xpath("//*[@id=\"new_user\"]/div[3]/input");
		
		
		
		
		public WebDriver driver;                                                                                                           
		                                                                                                                                   
		public LoginPage(WebDriver driver)                                                                                               
		    {                                                                                                                              
			this.driver = driver;                                                                                                          
			}                                                                                                                              
		                                                                                                                                   	
		public  WebElement getEmail()                                                                                                      
		{                                                                                                                                  
			return driver.findElement(Email);                                                                                             
		} 
	
		public  WebElement getpassword()                                                                                                      
		{                                                                                                                                  
			return driver.findElement(password);                                                                                             
		} 
	
		public  WebElement getLogin()                                                                                                      
		{                                                                                                                                  
			return driver.findElement(Login);                                                                                             
		}
	}                                                                                                                               
		                                                                                                                                   
		                                                                                                                                   
		                                                                                                                                   
		                                                                                                                                   
		                                                                                                                                   
		                                                                                                                                   
		                                                                                                                                   
		                                                                                                                                   
		                                                                                                                                   
		                                                                                                                                   
		                                                                                                                                                                                                                                                 
	                                                                                                            
