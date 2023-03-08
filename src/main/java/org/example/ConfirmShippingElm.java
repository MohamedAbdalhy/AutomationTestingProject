package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConfirmShippingElm {
    public WebElement confirmationEmail(WebDriver driver){
        return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/section/div/div[1]/div[1]/div[2]/bdo"));
    }
    public WebElement shippingrate(WebDriver driver){
        return driver.findElement(By.xpath("//*[@id=\"shipping_methods\"]/div[2]/div/div/div/div[2]/span"));
    }
    public WebElement toPay(WebDriver driver){
        return           driver.findElement(By.cssSelector("#Form2 > div:nth-child(1) > div > div > div.PcENG.FpqZ3 > div:nth-child(1) > button"));

    }
    public WebElement ChosePaymentMethod(WebDriver driver){
        return driver.findElement(By.cssSelector("#basic > div.Rv5GE.X2Ih1.ZmwTh.ZCnda.phSl0 > div.ejtWx.ArFPw > label"));

    }


}
