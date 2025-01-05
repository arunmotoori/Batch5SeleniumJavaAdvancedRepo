package framespack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoFive {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/frame");
		
		driver.switchTo().frame("firstFr");
		WebElement innerFrameElement = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
		driver.switchTo().frame(innerFrameElement);
		driver.findElement(By.name("email")).sendKeys("a@b.com");

	}

}
