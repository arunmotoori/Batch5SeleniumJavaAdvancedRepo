package takingscreenshotspack;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class DemoOne {

	public static void main(String[] args) throws IOException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://tutorialsninja.com/demo/");
		
		File srcFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcFile1,new File(System.getProperty("user.dir")+"\\Screenshots\\HomePage.png"));
		
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		
		File srcFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcFile2,new File(System.getProperty("user.dir")+"\\Screenshots\\SearchPage.png"));
		
		driver.quit();
	}

}
