package com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HansHover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\apathak\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://hansrajcollege.ac.in");

		WebElement element = driver.findElement(By
				.xpath(".//*[@href='acdmc.php']"));

		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element1 = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath(".//*[@href='course.php']")));

		Actions action = new Actions(driver);
		action.moveToElement(element1).build().perform();
		driver.findElement(By.xpath(".//*[@href='course.php']"));
	}

}
