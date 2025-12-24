package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPojo extends Utility{
        public AmazonPojo() {
			PageFactory.initElements(driver,this);
		}

@FindBy(id="twotabsearchtextbox")
private WebElement serachBox;

@FindBy(xpath="//button[@type='submit']")
private WebElement front;

public WebElement getFront() {
	return front;
}

public void setFront(WebElement front) {
	this.front = front;
}

public WebElement getSerachBox() {
	return serachBox;
}

public void setSerachBox(WebElement serachBox) {
	this.serachBox = serachBox;
}



}
