package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//		driver.get("https://www.google.com/");
		//		// find element
		//		WebElement searchbox = driver.findElement(By.name("q"));
		//		searchbox.sendKeys("Automation testing" + Keys.ENTER);
		//		System.out.println("find the element -- >driver.findElement");


		//		driver.get("https://trytestingthis.netlify.app/");
		//		// find elements
		//	             List<WebElement> selectedoptions = driver.findElements(By.tagName("select"));
		//	             for (WebElement element : selectedoptions) {
		//	                 System.out.println("Paragraph text:" + element.getText());
		//	             }
		//	             
		//	             
		//	             System.out.println("find the elements -- >driver.findElements");
		//Find the element within the element
		//		driver.get("https://www.google.com/");
		//		WebElement withinelement = driver.findElement(By.tagName("form"));
		//		withinelement.findElement(By.name("q")).sendKeys("Automation testing" + Keys.ENTER);
		//		 System.out.println("find the element within the element");

		//get the active element
		driver.get("https://www.google.com/");   
		driver.findElement(By.name("q")).sendKeys("Selenium");

		String titleactive = driver.switchTo().activeElement().getAttribute("title");
		System.out.println(titleactive);
		driver.quit();

	}

}
