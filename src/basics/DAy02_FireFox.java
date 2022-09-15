package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DAy02_FireFox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\downloads\\jar_files07\\geckodriver-v0.31.0-win64\\geckodriver.exe" );
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		System.out.println(driver.getTitle());
		driver.close();
		

	}

}
