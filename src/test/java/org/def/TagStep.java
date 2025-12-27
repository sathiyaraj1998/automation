package org.def;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.pojo.AmazonPojo;
import org.pojo.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TagStep extends Utility{

@Given("launch url and browser")
public void launchUrlAndBrowser() {
  browserconfig();
  passUrl("https://www.amazon.com/");
	
}

@When("pass values to webtable")
public void passValuesToWebtable(io.cucumber.datatable.DataTable d) {
    AmazonPojo a=new AmazonPojo();
    WebElement front = a.getFront();
    front.click();
    WebElement serachBox = a.getSerachBox();
       List<List<String>> l = d.asLists();
      String string = l.get(3).get(1);
       serachBox.sendKeys(string);  
       serachBox.submit();
}

@Then("exit")
public void exit() {
   System.out.println("success");
   
   System.out.println("update to master");
}



}
