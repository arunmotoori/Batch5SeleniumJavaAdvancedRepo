package handlingmouseventspack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoThree {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		Actions actions = new Actions(driver);
		WebElement textAreaField = driver.findElement(By.id("ta1"));
		actions.contextClick(textAreaField).perform();

	}

}
