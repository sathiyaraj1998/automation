package org.tag;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle {
	
	public static void main(String[] args) throws AWTException {
		WebDriver a =new ChromeDriver();
		a.get("https://www.amazon.in/");
		a.manage().window().maximize();
		a.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    WebElement element2 = a.findElement(By.xpath("//button[text()='Continue shopping']"));
	    element2.click();
		WebElement element = a.findElement(By.id("twotabsearchtextbox"));
		element.sendKeys("iphone 15");
		element.submit();
		
		WebElement element3 = a.findElement(By.xpath("(//span[text()='iPhone 15 (128 GB) - Blue'])[1]"));
		element3.click();
        String parent = a.getWindowHandle();
		
		Set<String> windowHandles = a.getWindowHandles();
		int count=0;
	for (String each : windowHandles) {
		if (count==1) {
			a.switchTo().window(each);
			
		}
		count++;
	}
		WebElement add = a.findElement(By.xpath("(//input[@title='Add to Shopping Cart'])[2]"));
		add.click();
		
		
		
		
	
	}}

