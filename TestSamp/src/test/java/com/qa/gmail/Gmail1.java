package com.qa.gmail;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmail1 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","F:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://accounts.google.com/signin";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		WebElement email_phone = driver.findElement(By.xpath("//input[@id='identifierId']"));
		email_phone.sendKeys("vigneshkumarduraipandi12");
		driver.findElement(By.id("identifierNext")).click();
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(password));
		password.sendKeys("Vignesh@12345");
		driver.findElement(By.id("passwordNext")).click();
        driver.findElement(By.xpath("//div[@style='user-select: none']")).click();
        driver.findElement(By.xpath("//*[@id=':th']")).click();
        Runtime.getRuntime().exec("E:\\AutoIT\\FileUpload.exe");
        driver.findElement(By.xpath("//*[@tabindex='1'][@class='T-I J-J5-Ji aoO v7 T-I-atl L3']")).click();
        driver.close();
	}
	
}
