package Automation;


import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ProxyDemo {

	public static void main(String[] args) {
		
		Proxy proxy = new Proxy();
		proxy.setAutodetect(false);
		//proxy.setHttpProxy("localhost:8888"); 
		proxy.setSslProxy("localhost:8888");

		ChromeOptions options = new ChromeOptions();
		     options.setCapability("proxy", proxy);
		     System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
				WebDriver driver = new ChromeDriver(options);
				driver.get("https://www.google.com/");
//			in this proxy to use we need some outside application  use charles proxy 
	}
}
