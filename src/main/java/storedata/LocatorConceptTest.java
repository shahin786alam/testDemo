package storedata;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConceptTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver_win32\\chromedriver.exe"); 
	        WebDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().deleteAllCookies();
	        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	        driver.get("https://www.facebook.com/");
	        
	        //Xpath
	     // WebElement username=  driver.findElement(By.xpath("//input[@id='email']"));
	      //username.sendKeys("shahin786alam@yahoo.com");
	        
	        //name
	       // driver.findElement(By.name("email")).sendKeys("shahin786alam@yahoo.com");
	        
	        //id 
	        //driver.findElement(By.id("email")).sendKeys("shahin786alam@yahoo.com");
	        
	        //clase name
	        //driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("shahin786alam@yahoo.com");
	        
	        //cssSelector
	       // driver.findElement(By.cssSelector("#email")).sendKeys("shahin786alam@yahoo.com");
	        //driver.findElement(By.cssSelector(".inputtext _55r1 _6luy")).sendKeys("shahin786alam@yahoo.com");//class
	        
	        //tag name
//	        List<WebElement> totallink= driver.findElements(By.tagName("a"));
//	       // System.out.println(totallink.size());
//	        
//	        List<WebElement> totalimg= driver.findElements(By.tagName("img"));
//	        System.out.println(totalimg.size());
//	        
//	    for(int i=0; i<totallink.size(); i++) {
//	    	String lingtext=totallink.get(i).getText();
//	    	System.out.println(lingtext);
//	    }
	    
	    //linktext
	    //driver.findElement(By.linkText("Forgot Password?")).click();
	      
	    //parlinktext 
	    //driver.findElement(By.partialLinkText("Forgot")).click();
	       
	        
	  
	        	
	        }
	}


