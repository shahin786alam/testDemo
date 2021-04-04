package storedata;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class DragandDropTestConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver_win32\\chromedriver.exe"); 
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
        driver.get("https://jqueryui.com/droppable/");
        
        driver.switchTo().frame(0);
        
        Actions Action=new Actions(driver);
        Action.clickAndHold(driver.findElement(By.id("draggable")))
        .moveToElement(driver.findElement(By.id("droppable")))
        .release()
        .build()
        .perform();
        
//       WebElement src= driver.findElement(By.id("draggable"));
//       WebElement target=driver.findElement(By.id("droppable"));
//       Action.dragAndDrop(src, target).build().perform();
		
		
		
		
		
	}

}
