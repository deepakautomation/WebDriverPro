package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHover {
	@Test
	public void mousehover() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\apathak\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com");
		WebElement element = driver
				.findElement(By
						.xpath(".//*[@id='leftNavMenuRevamp']/div[1]/div[2]/ul/li[2]/a/span[2]"));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		WebElement subElement = driver.findElement(By
				.xpath(".//*[@id='category2Data']/div[1]/div/div/p[8]/a/span"));
		action.moveToElement(subElement);
		action.click();
		action.perform();
		// dropdownBY part bellow
		WebElement dragElementFrom = driver
				.findElement(By
						.xpath(".//*[@id='content_wrapper']/div[9]/div[1]/div/div[1]/div[2]/div[3]/div[3]/div/div[1]/a[1]"));
		System.out.println(dragElementFrom.getLocation());
		new Actions(driver).dragAndDropBy(dragElementFrom, -90, 0).build()
				.perform();
		System.out.println(dragElementFrom.getLocation());
	}

}
