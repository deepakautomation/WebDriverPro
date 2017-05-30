package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String... args) {
		{
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\apathak\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.jabong.com");
			driver.findElement(By.xpath(".//input[@id='search']")).sendKeys(
					"anujpathak");

			Actions action = new Actions(driver);
			action.moveToElement(
					driver.findElement(By
							.xpath(".//input[@id='search']")))
					.doubleClick().build().perform();

		}
	}
}
