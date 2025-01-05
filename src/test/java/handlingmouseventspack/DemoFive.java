package handlingmouseventspack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoFive {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		Actions actions = new Actions(driver);
		WebElement osloElement = driver.findElement(By.id("box1"));
		WebElement norwayElement = driver.findElement(By.id("box101"));
		actions.dragAndDrop(osloElement,norwayElement).perform();
	}

}
