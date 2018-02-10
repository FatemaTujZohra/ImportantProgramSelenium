package trickyExcercises;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Calendar_Travel {

	public static void main(String[] args) throws Throwable {
		
         System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
	     WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.orbitz.com/Flights"); 
	
		//driver.findElement(By.cssSelector("button[class='datepicker-cal-date'][data-year='2018'][data-month='8'][data-day='21']")).click();
		
		//While automating calendar UI in travel website I wanted to put both departing and returning month and date. 
		//I could only do it when I placed my codes for returning month and date first. Still a question mark to me. Hopefully soon 
		//will figure out.
		
		// codes for returning month and date (27 Sep, 2018)
		driver.findElement(By.xpath("//*[@id=\"flight-returning\"]")).click();
		Thread.sleep(2000);

		while(!driver.findElement(By.className("datepicker-cal-month-header")).getText().contains("SEP"))
		{
		driver.findElement(By.cssSelector("button.datepicker-paging:nth-child(3)")).click();
		}
		
		
		List<WebElement> rdates= driver.findElements(By.className("datepicker-cal-date"));
		//take common attribute and put into list and iterate
		int dcount=driver.findElements(By.className("datepicker-cal-date")).size();

		for(int i=0;i<dcount;i++)
		{
		if (rdates.get(i).getText().contains("27"))
		
		{
		driver.findElements(By.className("datepicker-cal-date")).get(i).click();
		break;
	}


}
	         // codes for departing month and date (21 August, 2018)
		driver.findElement(By.xpath("//*[@id=\"flight-departing\"]")).click();
		
		Thread.sleep(2000);
		
		while(!driver.findElement(By.className("datepicker-cal-month-header")).getText().contains("AUG"))
		{
		driver.findElement(By.cssSelector("button.datepicker-paging:nth-child(3)")).click();
		}
		
		
		List<WebElement> dates= driver.findElements(By.className("datepicker-cal-date"));
		//take common attribute and put into list and iterate
		int count=driver.findElements(By.className("datepicker-cal-date")).size();

		for(int i=0;i<count;i++)
		{
		if (dates.get(i).getText().contains("21"))
	
		{
		driver.findElements(By.className("datepicker-cal-date")).get(i).click();
		break;
	}


}		
		
		}
	}

		
		//<caption class="datepicker-cal-month-header">Aug 2018</caption>
		//<button type="button" class="datepicker-cal-date" data-year="2018" data-month="7" data-day="15">15</button>

//<caption class="datepicker-cal-month-header">May 2018</caption>
//*[@id="package-departing-hp-package"]

