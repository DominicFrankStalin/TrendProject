package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParentClass {
	
	public WebDriver driver;
	
	@BeforeMethod()
	public void start() {
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Opened the browser");	
	}

	@AfterMethod()
	public void end() {
		System.out.println("Closed the browser");
		driver.close();
	}


}
