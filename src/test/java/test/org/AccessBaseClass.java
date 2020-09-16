package test.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccessBaseClass extends BaseClass {
	
public static void main(String[] args) {
	
	WebDriver driv = getdriv();
	
	driv.get("https://www.facebook.com/");
	
	title();
	WebElement usrname = driv.findElement(By.id("email"));
	insertvalue(usrname, "rajesh");
	
	WebElement pass = driv.findElement(By.id("pass"));
	insertvalue(pass, "sundaram");
	
	WebElement btn = driv.findElement(By.id("u_0_b"));
	btnclick(btn);
}





}
