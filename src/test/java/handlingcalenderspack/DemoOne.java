package handlingcalenderspack;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoOne {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any day say 17:");
		String expectedDay = scanner.nextLine();
		System.out.println("Enter any month say November:");
		String expectedMonth = scanner.nextLine();
		System.out.println("Enter any year say 2027:");
		String expectedYear = scanner.nextLine();
		scanner.close();
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

		driver.findElement(By.id("datepicker")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-datepicker-div")));
		
		String year = driver.findElement(By.className("ui-datepicker-year")).getText();
		String month = driver.findElement(By.className("ui-datepicker-month")).getText();
		
		while(!year.equals(expectedYear) || !month.equals(expectedMonth)) {
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			year = driver.findElement(By.className("ui-datepicker-year")).getText();
			month = driver.findElement(By.className("ui-datepicker-month")).getText();
		}
		
		String xpathText = "//td[@data-handler='selectDay']//a[text()='"+expectedDay+"']";
		driver.findElement(By.xpath(xpathText)).click();
		

	}

}
