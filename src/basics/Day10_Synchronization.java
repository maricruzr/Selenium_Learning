package basics;

import org.openqa.selenium.By;

public class Day10_Synchronization extends Utilities {

	public static void main(String[] args) throws InterruptedException {
		
		openBrowser("https://codegator.herokuapp.com/index.php");
		driver.findElement(By.linkText("Alerts")).click();
		driver.findElement(By.className("btn-primary")).click();
		//there is a delay between these 2 
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Button is now enable!']")).click();
		

	}

}
