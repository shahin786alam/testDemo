package storedata;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class PopUpAlertTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver_win32\\chromedriver.exe"); 
	        WebDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().deleteAllCookies();
	        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	        driver.findElement(By.xpath("//input[@name='proceed']")).click();
	       Alert alert= driver.switchTo().alert();
	       String text=alert.getText();
	       System.out.println(text);
	       if(text.equals("Please enter a valid user name")) {
	    	   System.out.println("correct popup measg");
	       }else {
	    	   System.out.println("in_correct popup measg");
	       }
	      Thread.sleep(5000);
	      alert.accept();//click on ok button
	      //alert.dismiss();//click on cancle button
	      driver.quit();
	      //To handle alert popups
	      //i need to 1st switch control to alert popus 
	      //then click on ok or cancle button
	      //then move control back to main page.
	}

}
