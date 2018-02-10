package trickyExcercises;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DynamicDataBestBuy {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		

		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	
		driver.get("https://www.bestbuy.com/");
		driver.switchTo().activeElement().click();
		
		System.out.println("Links in the Page");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footer=driver.findElement(By.xpath("//*[@id=\"footer\"]"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		WebElement col=driver.findElement(By.xpath("//*[@id=\"footer\"]/div[2]/div[1]/div[3]/div"));
		
		
	      for (int i=0;i<col.findElements(By.tagName("a")).size();i++)
		{
			//System.out.println(col.findElements(By.tagName("a")).get(i).getText());
	    	  
	if (col.findElements(By.tagName("a")).get(i).getText().contains("Trade-In Program"))
		{
			col.findElements(By.tagName("a")).get(i).click();
			break;
			

	}
		//System.out.println(driver.getTitle());

}
	}
}

