package handlingkeyboardeventspack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoTwo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.linkText("Register")).click();
		
		WebElement firstNameField = driver.findElement(By.id("input-firstname"));
		
		Actions actions = new Actions(driver);
		actions.pause(Duration.ofSeconds(1)).click(firstNameField).pause(Duration.ofSeconds(1))
		.sendKeys("Arun").pause(Duration.ofSeconds(1))
		.sendKeys(Keys.TAB).pause(Duration.ofSeconds(1))
		.sendKeys("Motoori").pause(Duration.ofSeconds(1))
		.sendKeys(Keys.TAB).pause(Duration.ofSeconds(1))
		.sendKeys("a@b.com").pause(Duration.ofSeconds(1))
		.sendKeys(Keys.TAB).pause(Duration.ofSeconds(1))
		.sendKeys("1234567890").pause(Duration.ofSeconds(1))
		.sendKeys(Keys.TAB).pause(Duration.ofSeconds(1))
		.sendKeys("12345").pause(Duration.ofSeconds(1))
		.sendKeys(Keys.TAB).pause(Duration.ofSeconds(1))
		.sendKeys("12345").pause(Duration.ofSeconds(1))
		.build().perform();
		

	}

}
