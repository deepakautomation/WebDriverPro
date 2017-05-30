package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Basicslaunch {

	@Test
	public void launch() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\apathak\\Downloads\\geckodriver-v0.16.1-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.hdfcbank.com/");
		System.out.println("Successfully opened sd");
		Thread.sleep(10);
		driver.quit();
	}

	@Test
	public void launchChrome() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\apathak\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.quit();
	}

	@Test
	public void launchIE() {
		System.setProperty("webdriver.ie.driver",
				"C:\\Users\\apathak\\Downloads\\IEDriverServer_x64_2.53.1\\IEDriverServer.exe");
		InternetExplorerDriver driver = new InternetExplorerDriver();
		driver.get("http://yahoo.com");
		driver.quit();
	}

	@Test
	public void Signup() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\apathak\\Downloads\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://github.com");
		driver.findElement(By.name("user[login]")).sendKeys("anujpathak");
		driver.findElement(By.xpath(".//*[@id='user[email]']")).sendKeys(
				"anujpathak999@gmail.com");
		driver.findElement(By.xpath(".//*[@id='user[password]']")).sendKeys(
				"*AbCdEf123#");
		driver.quit();
	}
}
