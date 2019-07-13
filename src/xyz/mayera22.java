package xyz;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class mayera22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Chrome Webdriver\\chromedriver.exe");
		    //WebDriver driver = new ChromeDriver();
		    //driver.manage().window().maximize();
		    ChromeOptions options = new ChromeOptions();
		    options.addArguments("start-maximized");
		    options.addArguments("disable-infobars");
		    WebDriver driver = new ChromeDriver(options);


driver.get("https://qatestid12.wixsite.com/qaspecialist");
WebElement contact;
//username = driver.findElement(By.id("input-email"));
//username = driver.findElement(By.name("email"));
WebDriverWait wait2 = new WebDriverWait(driver,20);

wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"comp-ifgtula74label\"]")));

contact = driver.findElement(By.xpath("//*[@id=\"comp-ifgtula74label\"]"));



contact.click();
System.out.println("hassan");


 
		 

//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//Thread.sleep(5000);

System.out.println("kch bhi");

	}
}


