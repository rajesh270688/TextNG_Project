package test.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

public static WebDriver driver;




public static WebDriver getdriv() {
System.setProperty("webdriver.chrome.driver", "F:\\selenium\\Program\\MavenProject\\drive\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
return driver;
}


public static void loadlink(String links) {
	driver.get(links);

}

public static void maxi() {
	driver.manage().window().maximize();
	}
public static void title() {
driver.getTitle();
}
public static void currentUrl() {
String currentUrl = driver.getCurrentUrl();
System.out.println(currentUrl);
}
public static void pgsource() {
String pageSource = driver.getPageSource();
System.out.println(pageSource);
}
public static void insertvalue(WebElement element, String data) {
element.sendKeys(data);
}
public static void btnclick(WebElement element) {
element.click();
}
public static void quitBrowser() {
driver.quit();
}
public static void closeBrowser() {
driver.close();
}
public static void Alertdismiss() {
driver.switchTo().alert().dismiss();
}
public static void AlertAccept() {
driver.switchTo().alert().accept();
}
public static void reteriveText(WebElement element) {
String text = element.getText();
System.out.println(text);
}
public static void reteriveAtteribute(WebElement element, String data) {
String attribute = element.getAttribute(data);
System.out.println(attribute);
}

}
