package framespack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoThree {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://blogpendingtasks.blogspot.com/p/switchtoframeusingwebelement.html");
		
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@title='arunmotoori']"));
		driver.switchTo().frame(frameElement);
		driver.findElement(By.xpath("//a[@class='home-link'][text()='Home']")).click();

	}

}
