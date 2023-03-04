package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginElm {
    public WebElement email (WebDriver driver){
        return  driver.findElement(By.name("customer[email]"));
    }
    public WebElement password (WebDriver driver){
        return    driver.findElement(By.name("customer[password]"));
    }
    public WebElement loginButton (WebDriver driver){
        return  driver.findElement(By.cssSelector("#customer_login > div.row-btn > button"));
    }

}
