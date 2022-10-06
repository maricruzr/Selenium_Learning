package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Day15_Task extends Utilities{

	public static void main(String[] args) {
		/*
		 * TASK
		 * 1.find total number of columns 
		 * 2.find total number of rows 
		 * 3.loop through the company name and click on sky gold 
		 * 4.capture the stock price and print it in console
		 */
		openBrowser("https://money.rediff.com/gainers/bse/weekly/groupall");
		List<WebElement> columns = driver.findElements(By.xpath("//table[@class='dataTable']//thead//tr//th"));
		System.out.println(columns.size());
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr"));
		System.out.println(rows.size());
		
		List<WebElement> cellValues = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr//td"));
		for (int i = 0; i < cellValues.size(); i++) {
			String result = cellValues.get(i).getText();
			String exp = "Sky Gold";
			if (result.equalsIgnoreCase(exp)) {
				driver.findElement(By.linkText("Sky Gold")).click();
				break;
			}
		}
		WebElement price = driver.findElement(By.xpath("//span[@id='ltpid']"));
		System.out.println("stock price is : " + price.getText());
		
		
		
	}

}
