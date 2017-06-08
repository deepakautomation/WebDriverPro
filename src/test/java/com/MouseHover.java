package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MouseHover {
	@Test
	public void mousehover() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\apathak\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com");
		WebElement element = driver.findElement(By.xpath(".//*[@id='leftNavMenuRevamp']/div[1]/div[2]/ul/li[2]/a/span[2]"));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		WebElement subElement = driver.findElement(By.xpath(".//*[@id='category2Data']/div[1]/div/div/p[8]/a/span"));
		action.moveToElement(subElement);
		action.click();
		action.perform();
		
		/*Point p = driver.findElement(By.xpath("//div[@class='filter-inner']/div[1]")).getLocation();
		System.out.println(p);
		int i=0;
		while(i<=50){
			WebElement dragElementFrom = driver.findElement(By.xpath("//div[@class='filter-inner']/div[1]//a[1]"));
			action.dragAndDropBy(dragElementFrom, i, 0);
			i=i+10;*/
			
		
		WebElement dragElementFrom = driver.findElement(By.xpath("//div[@class='filter-inner']/div[1]//a[1]"));
		action.dragAndDropBy(dragElementFrom, -60, 0).build().perform(); 

		WebDriverWait wait = new WebDriverWait(driver, 30);

		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(("//div[@class='filter-inner']/div[1]//a[2]")))));
		
		
		WebElement dragElementFro = driver.findElement(By.xpath("//div[@class='filter-inner']/div[1]//a[2]"));
		if(!dragElementFro.isEnabled()){
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='filter-inner']/div[1]//a[2]")));
			//img[@src='https://i2.sdlcdn.com/img/sdDarwinLoader.svg']
		}
		
		Thread.sleep(20000);
		System.out.println(dragElementFro.getLocation());
		action.dragAndDropBy(dragElementFro, 40, 0 ).build().perform();
		System.out.println("test complete=========================");
		
	}
}