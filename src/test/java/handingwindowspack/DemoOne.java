package handingwindowspack;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoOne {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		String parentWindowId = driver.getWindowHandle();
		
		driver.findElement(By.id("selenium143")).click();
	
		Set<String> windowIds = driver.getWindowHandles();
		String childWindowOneId = null;
		
		for(String windowId : windowIds) {
			
			if(!windowId.equals(parentWindowId)) {
				childWindowOneId = windowId;
				break;
			}
			
		}
		
		driver.findElement(By.linkText("Open a popup window")).click();
		
		windowIds = driver.getWindowHandles();
		String childWindowTwoId = null;
		
		for(String windowId : windowIds) {
			
			if(!windowId.equals(parentWindowId) && !windowId.equals(childWindowOneId)) {
				childWindowTwoId = windowId;
				break;
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
