package com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeWaitCommands {

	public static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\apathak\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");

		driver.findElement(By.name("Timing Alert")).click();

		System.out
				.println("Timer JavaScript Alert is triggered but it is not yet opened");

		// Create new WebDriver wait

		WebDriverWait wait = new WebDriverWait(driver, 10);

		// Wait for Alert to be present

		Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());

		System.out.println("Either Pop Up is displayed or it is Timed Out");

		// Accept the Alert

		myAlert.accept();

		System.out.println("Alert Accepted");

		// Close the main window

		driver.close();

	}

}