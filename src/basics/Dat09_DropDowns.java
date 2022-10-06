package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dat09_DropDowns {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\downloads\\jar_files07\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://codegator.herokuapp.com/drop_down.php");

		// find the locator of the dropdown class and confirm it is select tag
		WebElement fruitsdropdowns = driver.findElement(By.className("fruits"));
		//create an object of the select class
		Select select = new Select(fruitsdropdowns);
		select.selectByIndex(3);
		select.selectByVisibleText("Apple");
		select.selectByValue("2");
		
		List<WebElement> allFruits = select.getOptions();
		System.out.println(allFruits.size());
		for(int i=0; i<allFruits.size(); i++) {
			System.out.println(allFruits.get(i).getText());
		}
		WebElement carsdropdown = driver.findElement(By.id("cars"));
		Select selectCars = new Select(carsdropdown);
		selectCars.selectByVisibleText("Opel");
		selectCars.selectByVisibleText("Audi");
		selectCars.selectByVisibleText("Volvo");
		selectCars.selectByVisibleText("Saab");
		//.deselect
		selectCars.deselectByIndex(0);// deselect Volvo
		selectCars.deselectByValue("car4");// deselect Audi
		selectCars.deselectByVisibleText("Saab");// deselect Saab
		selectCars.deselectByVisibleText("Opel");
		
		selectCars.selectByVisibleText("Opel");
		selectCars.selectByVisibleText("Audi");
		selectCars.selectByVisibleText("Volvo");
		selectCars.selectByVisibleText("Saab");
		
		selectCars.deselectAll();
		System.out.println("is cars multi select ?"+ selectCars.isMultiple());
		System.out.println("is fruits multi select ? "+select.isMultiple());
		
		
		
		
		
		
		//CTRL+SHIFT+/ TO COMMENT OUT 
		//CTRL+SHIFT+\ TO UN-COMMENTOUT 
		
		/*
		 * driver.get("https://codegator.herokuapp.com/form.php"); WebElement state =
		 * driver.findElement(By.cssSelector("select[class='form-control']")); Select
		 * selectState = new Select(state); selectState.selectByIndex(4);
		 * selectState.selectByVisibleText("Minnesota");
		 * selectState.selectByValue("VA");
		 * 
		 * List<WebElement> allStates = selectState.getOptions();
		 * System.out.println(allStates.size()); for(int i=0; i<allStates.size(); i++) {
		 * System.out.println(allStates.get(i).getText()); }
		 */
		  
		 
	}

}
