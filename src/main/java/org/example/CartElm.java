package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CartElm {
public WebElement emptyCartMassage(WebDriver driver){
    return driver.findElement(By.cssSelector("#pt-pageContent > div.container-indent > div > div > h1"));
}
    public WebElement emptyShoppingButton(WebDriver driver){
        return driver.findElement(By.cssSelector("#pt-pageContent > div.container-indent > div > div > div > a"));
    }

    // After ADD to Cart
    public WebElement productPrice(WebDriver driver){
    return driver.findElement(By.cssSelector("#updateform > div.pt-shopcart-page > div.pt-item > div.pt-item-description > div:nth-child(2) > div > span")) ;
    }

    public WebElement productTotalPrice(WebDriver driver){
        return driver.findElement(By.cssSelector("#updateform > div.pt-shopcart-page > div.pt-item > div.pt-item-description > div:nth-child(4) > div > span")) ;
    }
    public WebElement productCount(WebDriver driver){
        return driver.findElement(By.cssSelector("#updates_42427283669164")) ;
    }
    public WebElement shoppingAfterAdd(WebDriver driver){
        return driver.findElement(By.cssSelector("#updateform > div.pt-shopcart-page > div.pt-shopcart-btn > div:nth-child(1) > a > span")) ;
    }
    public WebElement clearCart(WebDriver driver){
        return driver.findElement(By.cssSelector("#updateform > div.pt-shopcart-page > div.pt-shopcart-btn > div:nth-child(2) > a:nth-child(1) > span")) ;
    }
    public WebElement updateCart(WebDriver driver){
        return driver.findElement(By.cssSelector("#updateform > div.pt-shopcart-page > div.pt-shopcart-btn > div:nth-child(2) > a:nth-child(2) > span")) ;
    }


    public WebElement grandTotal(WebDriver driver){
        return driver.findElement(By.cssSelector("#grandtotal > span")) ;
    }
    public WebElement countryDropBox(WebDriver driver){
        return driver.findElement(By.cssSelector("#address_country")) ;
    }
    public WebElement provinceDropBox(WebDriver driver){
        return driver.findElement(By.cssSelector("#address_province")) ;
    }
    public WebElement zipCodeInput(WebDriver driver){
        return driver.findElement(By.cssSelector("#address_zip")) ;
    }
    public WebElement collectShippingButton(WebDriver driver){
        return driver.findElement(By.cssSelector("#updateform > div.pt-shopcart-wrapperbox > div > div.col-md-6.col-lg > div > div > button")) ;
    }
    public WebElement shippingRate(WebDriver driver){
        return driver.findElement(By.cssSelector("#shipping-rates > li > span")) ;
    }

    public WebElement proceedToCheckOut(WebDriver driver){
        return driver.findElement(By.cssSelector("#updateform > div.pt-shopcart-wrapperbox > div > div.col-12.col-md-8.col-lg > div > button")) ;
    }
    public WebElement noteTextArea(WebDriver driver){
        return driver.findElement(By.cssSelector("#note")) ;
    }
    public WebElement deleteProductFromCart(WebDriver driver){
        return driver.findElement(By.cssSelector("#updateform > div.pt-shopcart-page > div.pt-item > div.pt-item-btn > a")) ;
    }
    public WebElement productCartName(WebDriver driver){
        return driver.findElement(By.cssSelector("#updateform > div.pt-shopcart-page > div.pt-item > div.pt-item-description > div:nth-child(1) > h6 > a")) ;
    }
    public WebElement plusProductCount(WebDriver driver){
        return driver.findElement(By.cssSelector("#updateform > div.pt-shopcart-page > div.pt-item > div.pt-item-description > div:nth-child(3) > div > span.plus-btn")) ;
    }
    public WebElement lessProductCount(WebDriver driver){
        return driver.findElement(By.cssSelector("#updateform > div.pt-shopcart-page > div.pt-item > div.pt-item-description > div:nth-child(3) > div > span.minus-btn > svg")) ;
    }
    public Select selectCountry(WebDriver driver){
        Select s1 = new Select(countryDropBox(driver));
    return s1 ;
    }
    public Select selectProvince(WebDriver driver){
        Select s1 = new Select(provinceDropBox(driver));
        return s1 ;
    }

}