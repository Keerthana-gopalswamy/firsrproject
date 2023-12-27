package Automation;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PageLoaddDemo {

	public static void main(String[] args) {
		
		
		ChromeOptions chromeOptions = new ChromeOptions();
	 chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		// chromeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
		// chromeOptions.setPageLoadStrategy(PageLoadStrategy.NONE);
		 
		 System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			WebDriver driver = new ChromeDriver(chromeOptions);
			driver.get("https://www.selenium.dev/downloads/");
			System.out.println(driver.getTitle());
			System.out.println("page load categery NORMAL");
		
			
			driver.close();
			


	}

}
