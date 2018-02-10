package trickyExcercises;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicDataEbay {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.ebay.com/");
		
	WebElement footer=driver.findElement(By.xpath(".//*[@id='glbfooter']"));
	
	WebElement col=driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
	
	
	for(int i=0;i<col.findElements(By.tagName("a")).size();i++)
	{
		if(col.findElements(By.tagName("a")).get(i).getText().contains("Site map")) {
			
			col.findElements(By.tagName("a")).get(i).click();
			break;
		}
	}

}
}
