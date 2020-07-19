package org.studies;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit {
 static WebDriver driver;
	@BeforeClass
	public static void beforeclass(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mass_\\eclipse-workspace\\first\\Junit11AM\\driver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	}
    	@AfterClass
	public static void afterclass() {
		driver.quit();
	}
	@Before
	public void before(){
	    Date d = new Date();
	    System.out.println(d);
	}
		@After
	public void after() {
		Date d = new Date();
	    System.out.println(d);	
	}
	@Test
	public void test1() {
		String url = driver.getCurrentUrl();
		boolean a = url.contains("facebook");
		Assert.assertTrue("verify url", a);
		WebElement txtuser = driver.findElement(By.id("email"));
		txtuser.sendKeys("paiyaabala8@gmail.com");
		String b = txtuser.getAttribute("value");
		Assert.assertEquals("verify username", "paiyaabala8@gmail.com", b);
	}
	@Test
	public void test2() {
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys("9677593594");
	}
	@Ignore
	@Test
	public void test3() {
        WebElement f = driver.findElement(By.id("loginbutton")); 		
	    f.click();
	}
	
	
}
