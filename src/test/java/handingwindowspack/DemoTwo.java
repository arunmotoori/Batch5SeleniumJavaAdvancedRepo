package handingwindowspack;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTwo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		String parentWindowId = driver.getWindowHandle();
		driver.findElement(By.id("selenium143")).click();
		driver.findElement(By.linkText("Open a popup window")).click();
		
		Set<String> windowIds = driver.getWindowHandles();
		String childWindowOneId = null;
		String childWindowTwoId = null;
		
		for(String windowId : windowIds) {
			
			driver.switchTo().window(windowId);
			
			if(driver.getTitle().equals("New Window")) {
				childWindowTwoId = windowId;
			}else if(driver.getTitle().contains("Selenium143")) {
				childWindowOneId = windowId;
			}
			
		}
		
		
		driver.switchTo().window(childWindowTwoId);
		
		String textOnPopupWindow = driver.findElement(By.xpath("//div[@class='example']/h3")).getText();
		System.out.println(textOnPopupWindow);
		driver.close();
		
		driver.switchTo().window(childWindowOneId);
		driver.findElement(By.linkText("What is Selenium?")).click();
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		driver.findElement(By.id("ta1")).sendKeys("Arun Motoori");
		
		
	}

}
