package com.cts.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage {

	private static WebDriver driver;
	

	public WebDriver launchApp(String browser) {
		
		
	   
//user launch the chrome browser
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "G:/chromedriver.exe");
			driver = new ChromeDriver();
		} // user launch the firefox browser
		if (browser.equals("firefox")) {

			System.setProperty("webdriver.gecko.driver", "G:/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		// window maximize
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com");

		return driver;
	}

	public void quit() {

		driver.quit();
	}

	
}
