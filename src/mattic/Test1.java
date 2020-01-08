package mattic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Selecting and Creating an object of chromedriver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com/gmail/");
//		System.out.println(driver.getTitle());
//		driver.findElement(By.xpath("//*[@id=\'identifierId\']")).sendKeys("sandesh@gmail.com");
		// driver.findElement(By.id("identifierId")).sendKeys("dev@gmail.com");
		// driver.findElement(By.className("RveJvd snByac")).click();

//		driver.findElement(By.cssSelector("span.CwaK9")).click();

//		System.out.println("This is a main Page");
//
//		Test2 dev = new Test2();
//
//		System.out.println(dev.headerValidation());
		driver.get("https://www.travelocity.com/");
		Select s = new Select(driver.findElement(By.id("hotel-rooms-hp-hotel")));
		s.selectByValue("3");

	}

}
