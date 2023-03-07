package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductElm {

    public WebElement ramdanBox (WebDriver driver){

        return   driver.findElement(By.cssSelector("#pt-pageContent > div.pt-listing-wrapper > " +
                "div.container-indent." +
                "pt-offset-40 > div > div > div.col-md-12.col-lg-9.col-xl-9 > div > " +
                "div.pt-product-listing.row > div:nth-child(1) > div > div:nth-child(2) > h2 > a"));
    }
    public WebElement ramdanBoxHeader (WebDriver driver){

        return    driver.findElement(By.cssSelector("#pt-header > div.pt-desktop-header > " +
                "div:nth-child(2) " +
                "> div > div.menu.cont-center > div > div > nav > ul > li:nth-child(2) > a"));
    }
    public WebElement productName (WebDriver driver){

        return  driver.findElement(By.cssSelector("#shopify-section-product-template > div:nth-child(1) >" +
                " div.container.container-fluid-mobile > div > div:nth-child(2) > div > h1"));
    }
    public WebElement productPrice (WebDriver driver){

        return  driver.findElement(By.cssSelector("#shopify-section-product-template > div:nth-child(1) " +
                "> div.container.container-fluid-mobile " +
                "> div > div:nth-child(2) > div > div.mrprprice > div > span.new-price > span"));
    }
    public WebElement productCode (WebDriver driver){

        return  driver.findElement(By.cssSelector("#shopify-section-product-template > div:nth-child(1)" +
                " > div.container.container-fluid-mobile > div > div:nth-child(2) > " +
                "div > div.pt-wrapper.marprinfo > div > ul > li.sku-js > span:nth-child(2)"));
    }
    public WebElement productType (WebDriver driver){

        return  driver.findElement(By.cssSelector("#shopify-section-product-template > div:nth-child(1)" +
                " > div.container.container-fluid-mobile > div > div:nth-child(2) >" +
                " div > div.pt-wrapper.marprinfo > div > ul > li:nth-child(2) > a"));
    }
    public WebElement productCount (WebDriver driver){

        return  driver.findElement(By.cssSelector("#product_form_7584017350828 > div > div:nth-child(1) > div > input[type=text]"));
    }
    public WebElement productAddCart (WebDriver driver){

        return  driver.findElement(By.cssSelector(" #product_form_7584017350828 > div > div:nth-child(2) > button"));
    }
    public WebElement productPhotoZoom (WebDriver driver){

        return  driver.findElement(By.cssSelector("body > div.zoomContainer"));
    }
    public WebElement productSoldOut(WebDriver driver){

        return  driver.findElement(By.cssSelector("#shopify-section-product-template > div:nth-child(1) > div.container.container-fluid-mobile > div > div:nth-child(2) > div > div:nth-child(1) > div > div\n"));
    }

    public WebElement sketchbookHeader(WebDriver driver) {
        return driver.findElement(By.cssSelector("#pt-header > div.pt-desktop-header > div:nth-child(2) > div > div.menu.cont-center > div > div > nav > ul > li:nth-child(4) > a > span"));
    }
    public WebElement sketchbookItem(WebDriver driver) {
        return driver.findElement(By.cssSelector("#pt-pageContent > div.pt-listing-wrapper > " +
                "div.container-indent." +
                "pt-offset-40 > div > div > div.col-md-12.col-lg-9.col-xl-9 > div > " +
                "div.pt-product-listing.row > div:nth-child(1) > div > div:nth-child(2) > h2 > a"));
    }

    public WebElement countPlus(WebDriver driver) {
        return driver.findElement(By.cssSelector("#product_form_7584017350828 > div > div:nth-child(1) > div > span.plus-btn > svg > g > polygon"));
    }
    public WebElement countLess(WebDriver driver) {
        return driver.findElement(By.cssSelector("#product_form_7584017350828 > div > div:nth-child(1) > div > span.minus-btn > svg"));
    }
    public WebElement countResult(WebDriver driver) {
        return driver.findElement(By.cssSelector("#product_form_7584017350828 > div > div:nth-child(1) > div > input[type=text]"));
    }
    public WebElement countResultCart(WebDriver driver) {
        return driver.findElement(By.cssSelector("#updates_42427283669164"));
    }
    public WebElement priceTotalProduct(WebDriver driver) {
        return driver.findElement(By.cssSelector("#updateform > div.pt-shopcart-page > div.pt-item > div.pt-item-description > div:nth-child(4) > div > span"));
    }



    }
