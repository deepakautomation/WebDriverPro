package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IframesTest {

	@Test
	public void iframes() {

		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+ "\\src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.wpengine.com/iframe-practice-page/");
		// List<WebElement>iframeElements=driver.findElements(By.tagName("iframe1"));
		driver.switchTo().frame(driver.findElement(By.id("IF1")));
		driver.findElement(By.xpath(".//*[@id='sex-0']")).click();

		driver.switchTo().defaultContent();

		driver.switchTo().frame(driver.findElement(By.id("IF2")));
		/*
		 * driver.findElement(By.id("IF2")); driver.switchTo().frame(2);
		 */
		driver.findElement(
				By.xpath(".//*[@id='post-9']/div/div[1]/div/p[1]/a/img"))
				.click();
		driver.switchTo().frame(2);

	}

}
