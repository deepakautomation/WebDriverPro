package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameScrolling {
	@Test
	public void launchChrome() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\apathak\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.jabong.com/men/shoes/");
		driver.findElement(
				By.xpath("html/body/section[1]/div/section/section/div/div[2]/div[2]/ul/li[4]/div[2]/label[18]/div/input"))
				.click();

	}
}
