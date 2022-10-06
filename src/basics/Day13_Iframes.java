package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Day13_Iframes extends Utilities {

	public static void main(String[] args) {
		openBrowser("https://codegator.herokuapp.com/iframe.php");
		// switch
		// driver.switchTo().frame("frame1");

		// switch frame using WebElement
		/*
		 * WebElement frameOne = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		 * driver.switchTo().frame(frameOne);
		 */

		// switch frame using index value
		driver.switchTo().frame(0);

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Maricruz");

		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Locators")).click();
		
		// task enter username to iframe(0) and enter username to iframe(1)
		driver.findElement(By.linkText("Iframes")).click();
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Maricruz");
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Maricruz");

	}

}
