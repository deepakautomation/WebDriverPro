package com;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ab {
	public static void main(String[] args) throws InterruptedException {

		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path
				+ "\\src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.hdfcbank.com/");
		driver.findElement(By.xpath("//a[@id='loginsubmit']")).click();

		String parentWindow = driver.getWindowHandle();
		Set<String> allwindows = driver.getWindowHandles();
		for (String window : allwindows) {
			if (!window.equals(parentWindow)) {
				driver.switchTo().window(window);
				System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>"+driver.getCurrentUrl());
				break;
			}
		
			//driver.findElement(
					//By.xpath("(//a[@class='btn btn-default redBtn'])[2]"))
					//.click();
			driver.findElement(By.xpath("html/body/div[4]/div[2]/div[1]/a")).click();
			driver.switchTo().frame(driver.findElement(By.name("login_page")));
			driver.findElement(
					By.xpath("html/body/form/table[2]/tbody/tr/td[2]/table/tbody/tr[1]/td[1]/table/tbody/tr[3]/td[2]/table/tbody/tr[2]/td[2]/span/input"))
					.sendKeys("ssdgbhfgjfd");
		}
	}
}
