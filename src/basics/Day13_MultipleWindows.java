package basics;

import java.util.Set;

import org.openqa.selenium.By;

public class Day13_MultipleWindows extends Utilities {

	public static void main(String[] args) {
		
		openBrowser("https://codegator.herokuapp.com/MultipleWindows.php");
		String parent = driver.getWindowHandle();
		System.out.println("parent window id : "+parent);
		
		driver.findElement(By.linkText("facebook page")).click();
		Set<String> childWindows = driver.getWindowHandles();
		//System.out.println(childWindows);
		
		for(String child : childWindows ) {
			System.out.println(child);
			if(!parent.equals(child)) {
				driver.switchTo().window(child);
			}
		}
		driver.findElement(By.id("email")).sendKeys("Maricruz");
		
		
		
	}

}
