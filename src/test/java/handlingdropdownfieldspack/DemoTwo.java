package handlingdropdownfieldspack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoTwo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement listBoxField = driver.findElement(By.id("multiselect1"));
		
		Select select = new Select(listBoxField);
		select.selectByIndex(2);
		select.selectByVisibleText("Swift");
		select.selectByValue("audix");
//		select.selectByIndex(0);
		
		WebElement option = select.getFirstSelectedOption();
		System.out.println(option.getText());
		
//		boolean b = select.isMultiple();
//		System.out.println(b);
		
//		List<WebElement> options = select.getAllSelectedOptions();
//		
//		for(WebElement option : options) {
//			System.out.println(option.getText());
//		}
		
//		List<WebElement> options = select.getOptions();
//		
//		for(WebElement option : options) {
//			System.out.println(option.getText());
//		}
		
//		select.deselectAll();
		
//		select.deselectByIndex(1);
//		select.deselectByValue("volvox");
//		select.deselectByVisibleText("Audi");
		
		driver.quit();

	}

}
