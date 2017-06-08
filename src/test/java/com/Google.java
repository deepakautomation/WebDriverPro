package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Google {
	public static void main(String...args){
		
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+ "\\src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");

		WebElement dropdown = driver.findElement(By.xpath(".//*[@id='day']"));
		Select oSelect = new Select(dropdown);
		oSelect.selectByVisibleText("19");

		WebElement dropdown2 = driver
				.findElement(By.xpath(".//*[@id='month']"));
		Select oSel = new Select(dropdown2);
		oSel.selectByIndex(9);

		Select Select = new Select(driver.findElement(By.id("year")));
		Select.selectByValue("1993");

	}
	

}
