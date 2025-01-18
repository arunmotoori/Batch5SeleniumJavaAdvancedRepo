package javascriptseleniumpack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DenoOne {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://omayo.blogspot.com/");
		
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("alert('Arun Motoori');");
		
//		WebElement button = driver.findElement(By.id("alert1"));
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("arguments[0].click()",button);
		
//		WebElement textAreaField = driver.findElement(By.id("ta1"));
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("arguments[0].value='Arun Motoori'", textAreaField);
		
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("window.scrollBy(0,300)");
		
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		WebElement button = driver.findElement(By.xpath("//button[@value='LogIn']"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView()",button);
		
	}

}
