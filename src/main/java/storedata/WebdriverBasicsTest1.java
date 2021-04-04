package storedata;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebdriverBasicsTest1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver_win32\\chromedriver.exe");
       // ChromeDriver driver=new ChromeDriver(); 
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.navigate().refresh();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
        driver.get("https://www.yahoo.com/");
        //driver.navigate().to("https://www.bestbuy.com/");
       System.out.println( driver.getTitle());
       
       String title=driver.getTitle();
      if(title.equals("Yahoo")) {
    	System.out.println("correct title"); 
      }else {
    	  System.out.println("in correct title");
      }
      
       System.out.println(driver.getCurrentUrl());
       Thread.sleep(500);
       //System.out.println(driver.getPageSource());
        //driver.close();
        driver.quit();    
	}

}
