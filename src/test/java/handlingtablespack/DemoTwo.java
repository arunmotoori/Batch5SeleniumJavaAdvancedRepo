package handlingtablespack;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTwo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://omayo.blogspot.com/");
		
		List<WebElement> places = driver.findElements(By.xpath("//table[@id='table1']//td[3]"));
		
		for(WebElement place : places) {
			
			System.out.println(place.getText());
			
		}
		
		driver.quit();

	}

}
