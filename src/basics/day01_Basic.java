package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day01_Basic {

	public static void main(String[] args) {
		// we need to add the jar files in the project
		// right click on the project > click on properties
		//click java built path > click libraries 
		//click class path > click add external jars
		System.setProperty("webdriver.chrome.driver","D:\\downloads\\jar_files07\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
	
		
		
	}

}
