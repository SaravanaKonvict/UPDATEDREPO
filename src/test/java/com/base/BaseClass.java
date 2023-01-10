package com.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	protected static WebDriver driver;
	WebElement findElement;
	Actions ref;

	
	// to get the path of the project file
	public String getPropertyPath() {
		String path = System.getProperty("user.dir");
		return path;
	}

	// to get the path of the cofig property file path
	public String getPropertyFileValue(String key) throws IOException {
		// FileInputStream stream = new FileInputStream(getPropertyPath() +
		// "\\Config\\Config.properties");
		Properties properties = new Properties();
		properties.load(new FileInputStream(getPropertyPath() + "\\Config\\Config.properties"));
		return (String) properties.get(key);

	}

	public void alertAccept() {
		driver.switchTo().alert().accept();
	}

		public void browserLaunch(String browser) {

			switch (browser) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
				break;
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				break;
			case "edge":
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				break;
				
			default:
				System.out.println("Enter valid browser name");
				break;
			}
			
		}
		
		public void launchUrl(String site) {
	driver.get(site);
		}
		
		// Implicit wait
		public void implicitWait() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		}

		
		public WebElement findelement(String locator, String value) {

			switch (locator) {
			case "id":
				findElement = driver.findElement(By.id(value));
				
				
				break;
			case "name":
				findElement = driver.findElement(By.name(value));
			
				break;
				
			case "xpath":
			findElement = driver.findElement(By.xpath(value));
				
				break;
			default:
			System.out.println("enter valid locator");	
				break;
			}
			return findElement;
			
			
		}
		
		public void enterValues(WebElement ref, String value) {

			ref.sendKeys(value);
			
		}
		
		public void click(WebElement ref) {
	ref.click();
		}
		
		public void clear(WebElement element) {
			element.clear();
		}
		
		public void action(WebElement reference, String actn) {

			ref = new Actions(driver);
			
			switch (actn) {
			case "click":
				ref.click(reference).perform();
				break;
			case "doubleclick":
				ref.doubleClick(reference).perform();
				break;	
			case "rightclick":
				ref.contextClick(reference).perform();
				break;
			default:
				break;
			}
		}
		
		public void windowHandl() {
		
			String parentid = driver.getWindowHandle();
			
			Set<String> allids = driver.getWindowHandles();
			
			for (String s : allids) {
				if (!parentid.equals(s)) {
					
					driver.switchTo().window(s);
					

				
			}
			
				
			}
		}
		
		public void selectbytext(WebElement ref,String text) {
		
			Select s = new Select(ref);
			s.selectByVisibleText(text);
			
			
			
		}
		
		public void selectbyvalue(WebElement ref,String text) {
			
			Select s = new Select(ref);
			s.selectByValue(text);
			
			
			
		}


		public void robotkeypress(int key) throws AWTException {
			Robot r = new Robot();
			r.keyPress(key);
			
		}
		
		public void robotkeyrelease(int key) throws AWTException {
			Robot r = new Robot();
			r.keyRelease(key);
			
			
		}
		
		public String elementGetText(WebElement element) {
			String text = element.getText();
			return text;
		}
		
		public String getAttribute(WebElement element) {
			String attribute = element.getAttribute("value");
			return attribute;
		}
		
		public byte[] takeScreenshot() {
TakesScreenshot ts = (TakesScreenshot) driver;
byte[] b = ts.getScreenshotAs(OutputType.BYTES);
return b;

		}

}
