package framespack;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoOne {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/frame");
		
		driver.switchTo().frame("firstFr");
		driver.findElement(By.name("fname")).sendKeys("Arun");
		

	}

}
