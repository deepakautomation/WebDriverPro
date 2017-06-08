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
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+ "\\src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://hansrajcollege.ac.in");
		
		
		WebElement element = driver.findElement(By.xpath(".//*[@href='acdmc.php']"));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy
				(By.xpath("/ul[starts-with(@class,'MenuBarSubmenuVisible')]")));
		
		driver.findElement(By.xpath("/ul[starts-with(@class,'MenuBarSubmenuVisible')]"));
		/*
		WebElement subElement = driver.findElement(By.xpath(".//*[@href='course.php']"));
		action.moveToElement(subElement).perform();
		*/
		/*driver.findElement(By.xpath(".//*[@href='acdmc.php']"));

		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@href='course.php']")));
		
		
		Actions action = new Actions(driver);
		action.moveToElement(element2).build().perform();
		driver.findElement(By.xpath(".//*[@href='course.php']"));
	
		*/
		
}
}