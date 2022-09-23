package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day05_Locators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\downloads\\jar_files07\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://codegator.herokuapp.com/input_fields.php");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Maricruz");
		driver.findElement(By.xpath("//input[@placeholder=\"Recipient's username\"]")).sendKeys("maricruz");
		driver.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys(" using contains");

		driver.get("https://facebook.com");
		driver.findElement(By.xpath("//button[starts-with(@id,'u_0_5_')]")).click();
	}

}
