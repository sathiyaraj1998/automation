package org.tag;

import java.util.Set;

import javax.print.attribute.standard.ReferenceUriSchemesSupported;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.pojo.Utility;

public class FlipWindow extends Utility {
     public static void main(String[] args) throws InterruptedException {
		
    	 browserconfig();
    	 
    	passUrl("https://www.flipkart.com/");
    	 
    	 WebElement searchbox = driver.findElement(By.name("q"));
    	 searchbox.sendKeys("s25");
    	 searchbox.submit();
    	 
    	 WebElement s25 = driver.findElement(By.xpath("//div[text()='Samsung S25 Ultra 5G (Titanium Silver Blue, 256 GB)']"));
    	 s25.click();
    	 String page1 = driver.getWindowHandle();
   
    	 Set<String> allId = driver.getWindowHandles();
    	 
    	 int count=0;
    	 
    	 for (String each : allId) {
			if (count==1) {
				driver.switchTo().window(each);
				
			}
			count++;
		}
    	 

			Thread.sleep(8000);
    	
         WebElement cart = driver.findElement(By.xpath("//span[text()='Cart']"));
         cart.click();
//         
//    	 JavascriptExecutor j=(JavascriptExecutor)driver;
//    	// WebElement top = driver.findElement(By.xpath("//div[text()='You might be interested in']"));
    	// j.executeAsyncScript("arguments[0],scrollIntoView(false)",top);
    	 
 WebElement addcart = driver.findElement(By.xpath("//button[@class='dSM5Ub ugg2XR IUmgrZ']"));    	 
	 addcart.click();
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
	}
	
	
	
	
}
