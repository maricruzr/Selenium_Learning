package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day11_ExplicitWait extends Utilities{

	public static void main(String[] args) {
		openBrowser("https://codegator.herokuapp.com/index.php");
		driver.findElement(By.linkText("Alerts")).click();
		driver.findElement(By.className("btn-primary")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Button is now enable!']")));
		
		//driver.findElement(By.xpath("//button[text()='Button is now enable!']")).click();
		driver.findElement(By.linkText("Form")).click();
		driver.findElement(By.className("btn-primary")).submit();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'You must agree before submitting.')]")));
		driver.findElement(By.id("invalidCheck")).click();
		
		WebElement states = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select select = new Select(states);
		select.selectByVisibleText("Alabama");
		wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//option[@value='AL']")));
		
		
		
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[contains(text(),'Please provide a valid city.')]"), "Please provide a valid city."));
		
		driver.findElement(By.linkText("Alerts")).click();
		driver.findElement(By.id("simpleBtn")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		System.out.println("alert is present ");
		
	
		
		
		

		
		

	}

}
