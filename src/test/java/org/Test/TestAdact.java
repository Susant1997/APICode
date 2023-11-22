package org.Test;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestAdact {
	
	static WebDriver driver;
	@BeforeClass
	public static void launch() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

	}
	
	@Before
	public void startTime() {
		Date ds = new Date();
		System.out.println("Start Time =" +ds);

	}
	
	@Test
	public void test1() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Susant");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
		

	}
	
	@After
	public void endTime() {
		Date de = new Date();
		System.out.println("End Time =" +de);
	}
	
	@AfterClass
	public static void close() {
		driver.quit();

	}

}
