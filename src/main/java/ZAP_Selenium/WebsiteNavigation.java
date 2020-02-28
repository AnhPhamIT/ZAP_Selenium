package ZAP_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebsiteNavigation {
	public WebDriver driver;
	
	final static String BASE_URL = "http://travelwithus.asia/";
	final static String LOGOUT_URL = "http://travelwithus.asia/index.php";
	final static String USERNAME = "ptvanh@mailinator.com";
	final static String PASSWORD = "123456";
	
	
	public WebsiteNavigation(WebDriver driver){
		this.driver = driver;
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	public void selectSignIn(){
		driver.get(BASE_URL);
		driver.findElement(By.xpath("//a[normalize-space(text())='Sign In']")).click();
	}
	
	public void login() throws InterruptedException{
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(USERNAME);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='pwd']")).sendKeys(PASSWORD);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='login_btn']")).click();
	}
}
