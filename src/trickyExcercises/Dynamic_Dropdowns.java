package trickyExcercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dynamic_Dropdowns {

	public static void main(String[] args) throws Throwable {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
	     WebDriver driver = new FirefoxDriver();
	     
	     driver.get("http://spicejet.com/");
	     
	     //driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]")).sendKeys("Goa (GOI)");
	     //driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_destinationStation1_CTXT\"]")).sendKeys("Mumbai (BOM)");
	     
	     //sendKeys method did not work.
	     
	     driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.cssSelector("a[value= 'CCU']")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.cssSelector("(a[value='BOM'])[2]")).click();
	     
	     
	      
	     
	     
	     
	     
	     
	     
	

	}

}
