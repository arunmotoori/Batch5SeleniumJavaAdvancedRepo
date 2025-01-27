package handlingmouseventspack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoOne {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		Actions actions = new Actions(driver);
		WebElement blogsMenu = driver.findElement(By.id("blogsmenu"));
		actions.moveToElement(blogsMenu).perform();
		WebElement seleniumByArun = driver.findElement(By.xpath("//span[text()='SeleniumByArun']"));
		actions.moveToElement(seleniumByArun).click().build().perform();

	}

}
