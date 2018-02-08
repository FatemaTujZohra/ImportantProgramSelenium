package trickyrealtimeexcercises;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wayfair {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("https://www.wayfair.com/");
		WebElement footer=driver.findElement(By.xpath("//*[@id=\"doc3\"]/div[4]/footer"));
		
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//*[@id=\'doc3\']/div[4]/footer/div/div[2]/div[2]/div[2]/ul/li[2]/a")).click();
		
		for(int i=0;i<footer.findElements(By.tagName("a")).size();i++)
		{
			System.out.println(footer.findElements(By.tagName("a")).get(i).getText());
			
			
			if(footer.findElements(By.tagName("a")).get(i).getText().contains("Privacy")) {
				
				footer.findElements(By.tagName("a")).get(i).click();
				break;
			}
		
		

	}
	}
}




 ////*[@id="doc3"]/div[4]/footer