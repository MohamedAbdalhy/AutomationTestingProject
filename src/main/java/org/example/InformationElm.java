package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class InformationElm {
    public WebElement firstName(WebDriver driver) {
        return driver.findElement(By.cssSelector("#TextField1"));
    }

    public WebElement lastName(WebDriver driver) {
        return driver.findElement(By.cssSelector("#TextField2"));
    }
    public Select country(WebDriver driver){
        Select s1 = new Select(driver.findElement(By.cssSelector("#Select0")));
        return s1 ;
    }
    public Select governorate(WebDriver driver){
        Select s1 = new Select(driver.findElement(By.cssSelector("#Select1")));
        return s1 ;
    }

    public WebElement emailORmobile(WebDriver driver) {
        return driver.findElement(By.cssSelector("#email"));
    }

    public WebElement company(WebDriver driver) {
        return driver.findElement(By.cssSelector("#TextField3"));
    }

    public WebElement address(WebDriver driver) {
        return driver.findElement(By.cssSelector("#TextField4"));
    }

    public WebElement apartment(WebDriver driver) {
        return driver.findElement(By.cssSelector("#TextField5"));
    }

    public WebElement city(WebDriver driver) {
        return driver.findElement(By.cssSelector("#TextField6"));
    }


    public WebElement postalCode(WebDriver driver) {
        return driver.findElement(By.cssSelector("#TextField7"));
    }

    public WebElement phone(WebDriver driver) {
        return driver.findElement(By.cssSelector("#phone_field"));
    }


    public WebElement toLogin(WebDriver driver) {
        return driver.findElement(By.cssSelector("#Form1 > div:nth-child(1) > div > div > div.RODQN > section > div > div:nth-child(1) > span > a"));
    }

    public WebElement saveInfoToNext(WebDriver driver) {
        return driver.findElement(By.cssSelector("#save_shipping_information"));
    }

    public WebElement productPrice(WebDriver driver) {
        return driver.findElement(By.cssSelector("#app > div > div > div > div:nth-child(1) > div > aside > div.wzOVe > div > div > div > div:nth-child(1) > section > div._6zbcq54._1fragem16._1fragem1c._6zbcq57._6zbcq55 > div._6zbcq525._1fragem16._1fragemz._6zbcq52c > div:nth-child(4) > div > div > span"));
    }

    public WebElement subtotal(WebDriver driver) {
        return driver.findElement(By.cssSelector("#app > div > div > div > div:nth-child(1) > div > aside > div.wzOVe > div > div > div > section > div.nfgb6p0 > div:nth-child(1) > div._1qy6ue6a > span"));
    }

    public WebElement total(WebDriver driver) {
        return driver.findElement(By.cssSelector("#app > div > div > div > div:nth-child(1) > div > aside > div.wzOVe > div > div > div > section > div.nfgb6p0 > div._1x41w3p1._1fragem1a._1fragem4._1x41w3p8 > div._1x41w3pa > div > div > strong"));
    }

    public WebElement productName(WebDriver driver) {
        return driver.findElement(By.cssSelector("#app > div > div > div > div:nth-child(1) > div > aside > div.wzOVe > div > div > div > div:nth-child(1) > section > div._6zbcq54._1fragem16._1fragem1c._6zbcq57._6zbcq55 > div._6zbcq525._1fragem16._1fragemz._6zbcq52c > div._6zbcq53x._1fragem16._1fragem1c._1fragem32._1fragem1f > p"));
    }

    public WebElement discountInput(WebDriver driver) {
        return driver.findElement(By.cssSelector("#TextField0"));
    }

    public WebElement goTOShipping(WebDriver driver) {

        return driver.findElement(By.xpath("//*[@id=\"Form1\"]/div[1]/div/div/div[2]/div/button"));
    }

    public WebElement messageFirstName(WebDriver driver) {
        return driver.findElement(By.cssSelector("#error-for-TextField1"));
    }

    public WebElement messageLastName(WebDriver driver) {
        return driver.findElement(By.cssSelector("#error-for-TextField2"));
    }
        public WebElement messageAddress(WebDriver driver) {
            return driver.findElement(By.cssSelector("#error-for-TextField4"));
        }
        public WebElement messageCity(WebDriver driver) {
            return driver.findElement(By.cssSelector("#error-for-TextField6"));
        }

        public WebElement messagePhone(WebDriver driver) {
            return driver.findElement(By.cssSelector("#error-for-phone_field"));
        }
    public WebElement messageEmail(WebDriver driver) {
        return driver.findElement(By.cssSelector("#error-for-email"));
    }
    public WebElement applyDescount(WebDriver driver) {
        return driver.findElement(By.cssSelector("#Form3 > div:nth-child(1) > div"));
    }







}

