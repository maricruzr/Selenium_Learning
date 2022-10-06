package basics;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Day12_FluentWait extends Utilities {

	public static void main(String[] args) {
		openBrowser("https://codegator.herokuapp.com/index.php");
		driver.findElement(By.linkText("Alerts")).click();
		driver.findElement(By.className("btn-primary")).click();
		
		   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		       .withTimeout(Duration.ofSeconds(30))
		       .pollingEvery(Duration.ofSeconds(5))
		       .ignoring(NoSuchElementException.class);
		   WebElement clickseleniumlink = wait.until(new Function<WebDriver,WebElement>() {
		     public WebElement apply(WebDriver driver) {
		      WebElement button = driver.findElement(By.xpath("//button[text()='Button is now enable!']"));
		   if(button.isEnabled()) {
			   System.out.println("button is now enabled");
		   }
		   return button;
		   }
		   });
		   clickseleniumlink.click(); 

	}
 

		
	}