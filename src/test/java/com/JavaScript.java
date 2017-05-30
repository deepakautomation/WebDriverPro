package com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScript {
	@Test
	public void mousehover() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\apathak\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com");
		
		
		String js = "var evObj = document.createEvent('MouseEvents');"
				+ "evObj.initMouseEvent(\"mouseover\",true, false, window, 0, 0, 0, 0, 0, false, false, false, false, 0, null);"
				+ "arguments[0].dispatchEvent(evObj);";

		WebElement electronics = driver
				.findElement(By
						.xpath("//*[@id='leftNavMenuRevamp']/div[1]/div[2]/ul/li[3]/a/span[2]"));
		((JavascriptExecutor) driver).executeScript(js, electronics);

		WebElement tv = driver.findElement(By
				.xpath("//*[@id='category3Data']/div[1]/div/div/p[3]/a/span"));
		tv.click();
	}
}