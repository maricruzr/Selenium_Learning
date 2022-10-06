package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Day14_ActionsClass extends Utilities {

	public static void main(String[] args) {
		openBrowser("https://www.flyreagan.com/");
		WebElement flight_menu = driver.findElement(By.xpath("//span[text()='Flight']"));

		Actions act = new Actions(driver);
		act.moveToElement(flight_menu).perform();

		WebElement arr_dept_submenu = driver.findElement(By.xpath("//a[text()='Arrivals and Departures']"));
		act.moveToElement(arr_dept_submenu).click().perform();

		WebElement best_source = driver.findElement(
				By.xpath("//a[text()=\'Your airline is the best source for the most up-to-date flight status. \']"));
		act.moveToElement(best_source).contextClick().sendKeys(Keys.ARROW_DOWN).click().perform();

		driver.navigate().to("https://demoqa.com/droppable");

		// locate the image element which we need to move
		WebElement img = driver.findElement(By.id("draggable"));
		// locate the box element where we need to drop
		WebElement box = driver.findElement(By.id("droppable"));

		/*
		 * act.clickAndHold(img).perform(); act.moveToElement(box).perform();
		 * act.release(img).perform();
		 */
		act.dragAndDrop(img, box).perform();

		driver.navigate().to("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("hello");
		act.click(driver.findElement(By.name("q"))).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.RETURN).build().perform();
		
		driver.findElement(By.name("q")).sendKeys(Keys.CONTROL + "C");
		driver.findElement(By.name("q")).sendKeys(Keys.CONTROL + "V");

	}

}
