package basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Day12_Alerts extends Utilities {

	public static void main(String[] args) {
		openBrowser("https://codegator.herokuapp.com/index.php");
		driver.findElement(By.linkText("Alerts")).click();
		driver.findElement(By.id("simpleBtn")).click();
		
		Alert alert = driver.switchTo().alert();
		
		String simpleBtnText = alert.getText();
		System.out.println(simpleBtnText);
		alert.accept();
		
		WebElement confirm_button = driver.findElement(By.id("confirmBtn"));
		confirm_button.click();
		System.out.println(alert.getText());
		alert.accept();
		confirm_button.click();
		alert.dismiss();
		
		WebElement promtBtn = driver.findElement(By.id("promptBtn"));
		promtBtn.click();
		System.out.println(alert.getText());
		alert.sendKeys("Maricruz");
		alert.accept();
		promtBtn.click();
		alert.dismiss();
	}

}
