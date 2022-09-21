package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day06_Locators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\downloads\\jar_files07\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://codegator.herokuapp.com/input_fields.php");
		
		//cssSelector using "tag#idvalue"
		driver.findElement(By.cssSelector("input#username")).sendKeys("Maricruz");
		driver.findElement(By.cssSelector("input#v1")).click();
		
		//cssSelector using "tag.classvalue"
		driver.findElement(By.linkText("Alerts")).click();
		driver.findElement(By.cssSelector("button.btn.btn-lg.btn-primary")).click();
		
		//cssSelector using "tag[attribute='attributevalue']"
		driver.findElement(By.partialLinkText("Input")).click();
		driver.findElement(By.cssSelector("textarea[aria-label='With textarea']")).sendKeys("css selector example");
		driver.findElement(By.cssSelector("input[aria-label='Amount (to the nearest dollar)']")).sendKeys("25");
		
		//using ^
		driver.findElement(By.cssSelector("input[id^='basic']")).sendKeys("hello");
		//using $
		driver.findElement(By.cssSelector("input[aria-describedby$='addon1']")).sendKeys("using $");
		driver.findElement(By.cssSelector("input[aria-describedby$='addon2']")).sendKeys("using $ ex 2");
		//using *
		driver.findElement(By.cssSelector("a[href*='Win']")).click();
		driver.findElement(By.cssSelector("a[target*='lan']")).click();
		

	}

}
