package com.sample.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public static WebDriver driver;

	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver",
				"./server/chromedriver.exe");
		 driver = new ChromeDriver();
		return driver;
	}
}
