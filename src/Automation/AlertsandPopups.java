package Automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsandPopups {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		System.out.println("this is JS alert");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(2000);
		alert.accept();
		
		if(driver.getPageSource().contains("You successfully clicked an alert"))
			System.out.println("You successfully clicked an alert");
		System.out.println("========JS Alert========");
		
		System.out.println("this is JS Confirm");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
		Alert confirmalert = driver.switchTo().alert();
		System.out.println(confirmalert.getText());
		Thread.sleep(2000);
		confirmalert.dismiss();

		if(driver.getPageSource().contains("You clicked: Cancel"))
			System.out.println("You clicked: Cancel");
		System.out.println("========confirm Alert========");
		
		System.out.println("this is JS prompt");
		var Automation = "Automation";
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
		Alert promptalert = driver.switchTo().alert();
		System.out.println(promptalert.getText());
		Thread.sleep(2000);
		promptalert.sendKeys(Automation);
		promptalert.accept();

		if(driver.getPageSource().contains("You entered: Automation"))
			System.out.println("You entered: Automation");
			if(Automation == "Automation") {
			System.out.println(Automation);
			}
		System.out.println("========prompt Alert========");
		driver.close();
	    		

	}

}
