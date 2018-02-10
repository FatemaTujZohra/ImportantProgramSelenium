package Try_alternativeways_tricky;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dropdown_orbitz {

	public static void main(String[] args) throws Throwable {
		
		
		System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
	     WebDriver driver = new FirefoxDriver();
		driver.get("https://www.orbitz.com/Flights");
		
		driver.findElement(By.xpath("//*[@id=\"flight-origin\"]")).sendKeys("Philadelphia, PA (PHL-Philadelphia Intl.)");
		 Thread.sleep(2000);	
		driver.findElement(By.xpath("//*[@id=\"flight-destination\"]")).sendKeys("Dallas, TX (DFW-Dallas-Fort Worth Intl.)");
				
		
		
		
		
		
		
		
		//for this travel website, sendKeys method was completely fine (no need of indexing). 
		//To my understanding application nature is very crucial for automation.


	}

}
