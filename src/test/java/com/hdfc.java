package com;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class hdfc {
	public static void main(String[] args) throws InterruptedException {
	
	String path = System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver", path+ "\\src\\test\\resources\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.hdfcbank.com/");
	driver.findElement(By.xpath("//a[@id='loginsubmit']")).click();

	String parentwindow = driver.getWindowHandle();
	System.out.println("Parent window" + parentwindow);
	Set<String> windows = driver.getWindowHandles();
	System.out.println(windows);
	Iterator iterator = windows.iterator();
	String currentWindowId;
	while (iterator.hasNext()){
		currentWindowId = iterator.next().toString();
		System.out.println(currentWindowId);
		if(!currentWindowId.equals(parentwindow)){
			driver.switchTo().window(currentWindowId);
		}
		//driver.findElement(By.xpath("html/body/div[4]/div[2]/div[1]/a")).click();
		driver.findElement(By.xpath("(//a[@class='btn btn-default redBtn'])[2]")).click();

	
	driver.switchTo().frame(driver.findElement(By.name("login_page")));
	driver.findElement(By.xpath("html/body/form/table[2]/tbody/tr/td[2]/table/tbody/tr[1]/td[1]/table/tbody/tr[3]/td[2]/table/tbody/tr[2]/td[2]/span/input"))
	.sendKeys("ssdgbhfgjfd");
}
}
}


