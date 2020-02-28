package ZAP_Selenium_BrowserDriver;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserDriverFactory {
// Make reference variable for WebDriver
	static WebDriver driver;
	public static WebDriver createChromeDriver(Proxy proxy, String path) {
		// Set proxy in the chrome browser
		ChromeOptions options = new ChromeOptions();
		options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		options.setCapability("proxy", proxy);
	    // Set system property for chrome driver with the path
	    System.setProperty("webdriver.chrome.driver", path);
	    return new ChromeDriver(options);    
	}
	
//	public static WebDriver createChromeDriver(String path) {
//		// Set proxy in the chrome browser
//		ChromeOptions options = new ChromeOptions();
//		options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
//	    System.setProperty("webdriver.chrome.driver", path);
//	    return new ChromeDriver(options);    
//	}
}