package cs2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Casestudies2
{

	WebDriver driver=null;
	
	@Given("I enter the Web application")
	public void enterweb()
	{
		System.setProperty("webdriver.chrome.driver","C:\\11728560\\selenium\\Drivers\\chromedriver.exe");
	     driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	
	@And("I press signin option")
	public void signin()
	{
		driver.findElement(By.xpath("//a[@href='login.htm']")).click();
	}
    @And("I Enter {word}")
    public void username(String un)
    {
    	driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(""+un);
    }
    @And("I Enter {word}")
    public void password(String pw)
    {
    	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(""+pw);
    }
    @And("I press Login")
    public void reg()
    {
    	driver.findElement(By.xpath("//input[@name='Login']")).click();
    }
    @Then("I press signout option")
    public void signout()
    {
    	driver.findElement(By.xpath("//a[@href='logout.htm']")).click();
    }
    
}
