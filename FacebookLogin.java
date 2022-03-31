package org.fbprj;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBproj {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lc5610193\\eclipse-workspace\\Javaproject\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement userName = driver.findElement(By.xpath("//input[@id='email']"));
		userName.sendKeys("franikeny1395@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));	
		password.sendKeys("Fk@12345");
		WebElement loginButton = driver.findElement(By.xpath("//button[@name='login']"));
		loginButton.click();
		
		WebElement account = driver.findElement(By.xpath("//div[@aria-label='Account']"));
		account.click();
		WebElement logout = driver.findElement(By.xpath("//span[text()='Log Out']"));
		logout.click();
		WebElement text = driver.findElement(By.xpath("//div[text()='Next time you log in, click your picture. To remove an account from this page, click here.']"));
		String string = text.getText();
		System.out.println(string);
		
		
	}
	

}
