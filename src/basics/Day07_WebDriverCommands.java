package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day07_WebDriverCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\downloads\\jar_files07\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// .get does not keep history does not allow going forward or backwards
		driver.get("https://codegator.herokuapp.com/input_fields.php");
		// or
		String url = "https://google.com";
		driver.get(url);

		// .navigate keeps history supports going forward and backwards
		driver.navigate().to("https://codegator.herokuapp.com");
		driver.navigate().to("https://facebook.com");
		// driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().to("https://codegator.herokuapp.com/MultipleWindows.php");
		// driver.findElement(By.linkText("facebook page")).click();
		// driver.close(); //will close the active window which the driver is
		// controlling
		// driver.quit();//this will colse all the windows which the driver is
		// controlling

		driver.navigate().to("https://codegator.herokuapp.com/form.php");
		WebElement fname = driver.findElement(By.id("validationCustom01"));
		fname.clear();
		fname.sendKeys("maricruz");
		// .isDisplayed
		boolean fname_displayed = fname.isDisplayed();// true
		System.out.println(fname_displayed);
		WebElement submit_button = driver.findElement(By.cssSelector("button.btn.btn-primary"));
		System.out.println(submit_button.isDisplayed());// true
		// .isEnabled
		driver.findElement(By.linkText("Alerts")).click();
		WebElement activeButton = driver.findElement(By.cssSelector("button#buttonOne"));
		System.out.println(activeButton.isEnabled());// true
		boolean disabledButton = driver.findElement(By.cssSelector("button#buttonTwo")).isEnabled();
		System.out.println(disabledButton);// false
		
		driver.findElement(By.linkText("Input Fields")).click();
		WebElement bikeCheckbox = driver.findElement(By.cssSelector("input#v1"));
		System.out.println(bikeCheckbox.isSelected());
		bikeCheckbox.click();
		System.out.println(bikeCheckbox.isSelected());
		
		
		
		
		
		

	}

}
