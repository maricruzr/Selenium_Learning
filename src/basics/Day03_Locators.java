package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day03_Locators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\downloads\\jar_files07\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://codegator.herokuapp.com/input_fields.php");
		WebElement username_field = driver.findElement(By.id("username"));
		// to write in a field we use sendKeys method
		username_field.sendKeys("maricruz");
		WebElement url = driver.findElement(By.id("basic-url"));
		url.sendKeys("example.com");
		WebElement bike = driver.findElement(By.name("vehicle1"));
		bike.click();

		// click on car and boat checkbox using name attributes
		WebElement car = driver.findElement(By.name("vehicle2"));
		car.click();
		WebElement boat = driver.findElement(By.name("vehicle3"));
		// boat.clear();
		boat.click();
		// can also do it like below
		// driver.findElement(By.id("username")).sendKeys("maricruz");

	}

}
