package com;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {
	public static void main(String[] args) throws InterruptedException{
	String path = System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver", path+ "\\src\\test\\resources\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.naukri.com/");
	String parentWindow = driver.getWindowHandle();
	Set<String> allwindows = driver.getWindowHandles();
	for (String window : allwindows) {
		if (!window.equals(parentWindow)) {
			driver.switchTo().window(window);
	
	}
}
}}