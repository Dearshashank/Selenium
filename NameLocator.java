import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class NameLocator 
{
	String fName;  
	static WebDriver driver;  
	
	public WebDriver setupDriver()
	{
	    /*Invoke the getWebDriver method from the DriverSetup File*/
	    DriverSetup driver = new DriverSetup();
	    return driver;
	}
	public String getNameLocator()
	{
	    String fName = driver.findElement(By.xpath("//input[@placeholder='Firstname']")).getAttribute("placeholder");
       return fName;
	}
	
	public static void main(String[] args)
	{
	    NameLocator namLocator=new NameLocator();
	    String name=namLocator.getNameLocator();
	    System.out.println("The name is "+name);
	}

}
