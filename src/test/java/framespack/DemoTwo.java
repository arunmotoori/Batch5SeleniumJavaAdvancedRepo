package framespack;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTwo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://docs.oracle.com/javase/8/docs/api/");
		
		driver.switchTo().frame("classFrame");
		driver.findElement(By.linkText("Description")).click();

	}

}
