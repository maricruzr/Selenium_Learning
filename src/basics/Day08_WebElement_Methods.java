package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day08_WebElement_Methods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\downloads\\jar_files07\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://codegator.herokuapp.com/form.php");
		WebElement btn = driver.findElement(By.xpath("//button[@type='submit']"));
		btn.submit();

		boolean btnDisplayed = btn.isDisplayed();
		System.out.println(btnDisplayed);

		WebElement agreeText = driver.findElement(By.className("form-check-label"));
		String text = agreeText.getText(); // Agree to terms and conditions
		System.out.println(text);

		WebElement multipleWindowElement = driver.findElement(By.id("multipleWindow"));
		String hrefValue = multipleWindowElement.getAttribute("href");// in return
		System.out.println(hrefValue);

		// find me href attribute value for form link
		WebElement formElement = driver.findElement(By.xpath("//a[@href='form.php']"));
		String hrefFormValue = formElement.getAttribute("href");
		System.out.println(hrefFormValue);

		List<WebElement> links = driver.findElements(By.xpath("//div[1]/a"));
		WebElement alertLink = links.get(1);
		String alertText = alertLink.getText();
		System.out.println(alertText);

		WebElement formLink = links.get(7);
		String formText = formLink.getText();
		System.out.println(formText);

		String dd= links.get(6).getText();
		System.out.println(dd);
		
		driver.findElement(By.linkText("Input Fields")).click();
		List<WebElement> radioButton = driver.findElements(By.className("form-check-input"));
		
		boolean maleSelected = radioButton.get(0).isSelected(); // true or false
		
		if(maleSelected) {
			radioButton.get(1).click();
		}else {
			radioButton.get(0).click();
		}
		
		List<WebElement> vehicles = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(int i=0;i<vehicles.size();i++) {
			vehicles.get(i).click();
			if(!vehicles.get(i).isSelected()) {
				vehicles.get(i).click();
			}
		}

		// or
		// driver.findElement(By.xpath("//button[@type='submit']")).submit();

	}

}
