package test.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Act {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\Program\\Day5_Actions\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.flipkart.com");
		Thread.sleep(10000);
		WebElement mob = driver.findElement(By.xpath("//span[contains(text(), 'Home & Furniture')]"));
		Thread.sleep(10000);
		Actions act = new Actions(driver);
		act.moveToElement(mob);
		Thread.sleep(10000);
		WebElement Mattresse = driver.findElement(By.xpath("//a[contains(text(), 'Mattresses')]"));
		Mattresse.click();
	}
}
