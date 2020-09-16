package test.org;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wwh {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\Program\\windowshandling\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
				
		WebElement sbox = driver.findElement(By.id("twotabsearchtextbox"));
		sbox.sendKeys("iphones 11", Keys.ENTER);
		
		WebElement f = driver.findElement(By.xpath("(//span[text()= 'Apple iPhone 11 (64GB) - Purple'])[1]"));
		f.click();
		
		String wh = driver.getWindowHandle();
		System.out.println(wh);
		
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		
		for (String eachwindow : windowHandles) {
			if (!wh.equals(eachwindow)) {
				driver.switchTo().window(eachwindow);
			}
		}
		WebElement cart = driver.findElement(By.id("add-to-cart-button"));
		cart.click();
	}

}
