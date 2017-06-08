package com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

class RobotsTests {

	@Test
	
	public void Robot() throws InterruptedException, AWTException{
	
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path
				+ "\\src\\test\\resources\\drivers\\chromedriver.exe");
		System.out.println(path);

		WebDriver driver = new ChromeDriver();
		driver.get("http://spreadsheetpage.com/index.php/file/C35");
		driver.findElement(
				By.xpath(".//a[@href=contains(text(),'yearly-calendar.xls')]"))
				.click();  
		Robot robot = new Robot(); 
		Thread.sleep(2000); 
		robot.keyPress(KeyEvent.VK_DOWN); 

		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
			
	}		
}