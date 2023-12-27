package Automation;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitsinselenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    System.out.println("there is the implicitlyWait normaly wait until the close");
		driver.findElement(By.name("q")).sendKeys("Automation testing" + Keys.ENTER);
		System.out.println("there is the exlpicitwait wait for the particular element");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	WebElement	AT = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Odp5De\"]/div/div[1]/div/div[1]/block-component/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div[2]/div/div/div[1]/div/span/a/h3")));
AT.click();

Wait<WebDriver> wait1 =
new FluentWait<>(driver)
    .withTimeout(Duration.ofSeconds(2))
    .pollingEvery(Duration.ofMillis(300))
    .ignoring(ElementNotInteractableException.class);

WebElement sdlc = wait1.until(ExpectedConditions.elementToBeClickable(By.id("image")));

sdlc.click();
System.out.println("there is the FluentWait");

	driver.close();
		
	}

}
   