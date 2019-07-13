package xyz;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class mayera {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Chrome Webdriver\\chromedriver.exe");
		    //WebDriver driver = new ChromeDriver();
		    //driver.manage().window().maximize();
		    ChromeOptions options = new ChromeOptions();
		    options.addArguments("start-maximized");
		    options.addArguments("disable-infobars");
		    WebDriver driver = new ChromeDriver(options);


driver.get("https://demo.opencart.com/index.php?route=account/login");

//options.addArguments("--incognito");
//options.addArguments("--ignore-certificate-errors");
// options.addArguments("--disable-popup-blocking");



//WebElement username;
//username = driver.findElement(By.id("input-email"));
//username.sendKeys("mytc5@gmail.com");

WebElement username;
username= driver.findElement(By.name("email"));
username.sendKeys("mytc5@gmail.com");
 
//WebElement username;
//username= driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
//username.sendKeys("mytc5@gmail.com");
 

WebElement password;
password=driver.findElement(By.id("input-password"));
password.sendKeys("123456789");



WebElement loginButton;  
loginButton = driver.findElement(By.xpath("//input[@type='submit' and @class='btn btn-primary']"));

loginButton.click();
WebElement search;
search=driver.findElement(By.name("search"));
search.sendKeys("HP LP3065");

WebElement button = driver.findElement(By.xpath("//*[@id=\"search\"]/span/button"));
button.click();

WebElement openfilter  = driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[2]/div[2]/button[1]"));
JavascriptExecutor jse = (JavascriptExecutor)driver;
jse.executeScript("arguments[0].scrollIntoView()", openfilter);

WebElement button1=driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[2]/div[2]/button[1]"));
button1.click();
WebDriverWait wait2 = new WebDriverWait(driver,20);
wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"button-cart\"]")));
WebElement op2  = driver.findElement(By.xpath("//*[@id=\"button-cart\"]"));
JavascriptExecutor jse2 = (JavascriptExecutor)driver;
jse2.executeScript("arguments[0].scrollIntoView()", op2);
op2.click();



WebElement button2=driver.findElement((By.xpath("//*[@id=\"button-cart\"]"))); 
		button2.click();
		
		wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"button-cart\"]")));
		WebElement op22  = driver.findElement(By.xpath("//*[@id=\"button-cart\"]"));
		JavascriptExecutor jse22 = (JavascriptExecutor)driver;
		jse2.executeScript("arguments[0].scrollIntoView()", op2);
		op2.click();

		WebElement done  = driver.findElement(By.xpath("//*[@id=\"cart\"]/button"));
		done.click();
		driver.findElement(By.linkText("Checkout")).click();
		
Thread.sleep(2000);
		WebElement continue1=driver.findElement(By.xpath("//*[@id=\"button-payment-address\"]"));
		continue1.click();
		Thread.sleep(2000);
		//WebElement continue2=driver.findElement(By.xpath("//*[@id=\"button-shipping-address\"]"));
		//continue2.click();
		
		WebElement continue11=driver.findElement(By.xpath("//*[@id=\\\"button-shipping-address\\\"]"));
		continue11.click();
		Thread.sleep(2000);
		
		
		



String actualpagetitle = "";
String expectedTitle = "My Account";
actualpagetitle  = driver.getTitle();

System.out.println(actualpagetitle);

if (actualpagetitle.contentEquals(expectedTitle)){
    System.out.println("Test Passed!");
} else {
    System.out.println("Test Failed");
}


//options.addArguments("start-maximized");
//options.addArguments("disable-infobars");
//options.addArguments("--incognito");
////options.addArguments("--ignore-certificate-errors");
 //options.addArguments("--disable-popup-blocking");
//WebDriver driver = new ChromeDriver(options);

	
	
	/*
	String url = "";
	url = driver.getCurrentUrl();
	System.out.println(url);
	
	if (actualpagetitle.contains("My Account")){
        System.out.println("URL Test Passed! maerya");
    } else {
        System.out.println("URL Test Failed");
    }*/
	
	

	//driver.quit();
}
}