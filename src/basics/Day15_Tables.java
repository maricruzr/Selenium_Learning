package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Day15_Tables extends Utilities {

	public static void main(String[] args) {
		openBrowser("https://codegator.herokuapp.com/tables.php");
		List<WebElement> columns = driver.findElements(By.xpath("//th[@scope='col']"));
		System.out.println(columns.size());

		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table']//tbody//tr"));
		System.out.println(rows.size());

		List<WebElement> cellValues = driver.findElements(By.xpath("//table[@class='table']//tbody//tr//td"));

		for (int i = 0; i < cellValues.size(); i++) {
			String result = cellValues.get(i).getText();
			String exp = "Otto";
			if (result.equalsIgnoreCase(exp)) {
				driver.findElement(By.linkText("Otto")).click();
				break;
			}
		}
		//task 
		//find total number of columns
		//find total number of rows
		//loop through the company name and click on sky gold
		//capture the stock price and print it in console
		

	}

}
