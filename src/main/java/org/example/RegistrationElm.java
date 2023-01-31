package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationElm {
    public WebElement firstName(WebDriver driver){
        return driver.findElement(By.id("loginInputName"));
    }
    public WebElement lastName(WebDriver driver){
        return driver.findElement(By.id("loginLastName"));
    }
    public WebElement email(WebDriver driver){
        return driver.findElement(By.id("loginInputEmail"));
    }
    public WebElement passWord(WebDriver driver){
        return  driver.findElement(By.id("loginInputPassword"));
    }
    public WebElement createButton(WebDriver driver){
        return driver.findElement(By.cssSelector("button[class=\"btn btn-block\" ]"));
    }
    public WebElement returnToStore(WebDriver driver){
        return  driver.findElement(By.cssSelector("a[class=\"btn-link btn-block btn-lg btn-text-left\"]"));
    }
}
