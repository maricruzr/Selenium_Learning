package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day03_Locators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\downloads\\jar_files07\\chromedriver_win32\\chromedriver.exe");
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
		driver.findElement(By.linkText("Alerts")).click();
		driver.findElement(By.partialLinkText("Practice")).click();
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int numberOfLinks = links.size();
		System.out.println(numberOfLinks);
		// task click on alerts find number of button tag
		driver.findElement(By.linkText("Alerts")).click();
		List<WebElement> buttons = driver.findElements(By.tagName("button"));
		int numberOfButtons = buttons.size();
		System.out.println(numberOfButtons);
		driver.findElement(By.className("dropdownLink")).click();

		// full xpath or absolute xpath
		List<WebElement> menuLinks = driver.findElements(By.xpath("/html/body/nav/div/a"));
		System.out.println(menuLinks.size());

	}

}
