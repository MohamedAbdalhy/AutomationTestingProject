package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigationBarElm {
    public WebElement productHeadText(WebDriver driver){

        return driver.findElement(By.cssSelector("#pt-pageContent > div.pt-listing-wrapper > div:nth-child(1) > div > h1"));

    }
public WebElement plannerLink(WebDriver driver){

    return   driver.findElement(By.cssSelector("#pt-header > div.pt-desktop-header " +
            "> div:nth-child(2) > div > div.menu.cont-center > div > div " +
            "> nav > ul > li:nth-child(1) > a > span"));
}
    public WebElement ramadanBoxItem(WebDriver driver){
        return   driver.findElement(By.cssSelector("#pt-header > div.pt-desktop-header > div:nth-child(2) " +
                "> div > div.menu.cont-center > div > div > nav > ul > li:nth-child(2) > a > span"));
    }
    public WebElement notebooksItem(WebDriver driver){
        return   driver.findElement(By.cssSelector("#pt-header > div.pt-desktop-header > div:nth-child(2) > div > div.menu.cont-center > div > div > nav > ul > li:nth-child(2) > a > span"));
    }
    public WebElement sketchbookItem(WebDriver driver){
        return   driver.findElement(By.cssSelector("#pt-header > div.pt-desktop-header > div:nth-child(2) > div > div.menu.cont-center > div > div > nav > ul > li:nth-child(4) > a > span"));
    }
    public WebElement toDOItem(WebDriver driver){
        return   driver.findElement(By.cssSelector("#pt-header > div.pt-desktop-header > div:nth-child(2) > div > div.menu.cont-center > div > div > nav > ul > li:nth-child(5) > a > span"));
    }
    public WebElement laptopItem(WebDriver driver){
        return   driver.findElement(By.cssSelector("#pt-header > div.pt-desktop-header > div:nth-child(2) > div > div.menu.cont-center > div > div > nav > ul > li:nth-child(6) > a > span"));
    }
    public WebElement backPackItem(WebDriver driver){
        return   driver.findElement(By.cssSelector("#pt-header > div.pt-desktop-header > div:nth-child(2) > div > div.menu.cont-center > div > div > nav > ul > li:nth-child(7) > a > span"));
    }
    public WebElement pencilCase(WebDriver driver){
        return   driver.findElement(By.cssSelector("#pt-header > div.pt-desktop-header > div:nth-child(2) > div > div.menu.cont-center > div > div > nav > ul > li:nth-child(8) > a"));
    }

    public WebElement makeUp(WebDriver driver){
        return   driver.findElement(By.cssSelector("#pt-header > div.pt-desktop-header > div:nth-child(2) > div > div.menu.cont-center > div > div > nav > ul > li:nth-child(9) > a > span"));
    }
    public WebElement gift(WebDriver driver){
        return driver.findElement(By.cssSelector("#pt-header > div.pt-desktop-header > div:nth-child(2) > div > div.menu.cont-center > div > div > nav > ul > li:nth-child(10) > a > span"));
    }
    public WebElement coloring(WebDriver driver){
        return driver.findElement(By.cssSelector("#pt-header > div.pt-desktop-header > div:nth-child(2) > div > div.menu.cont-center > div > div > nav > ul > li:nth-child(11) > a > span"));
    }
    public WebElement forKids(WebDriver driver){
        return driver.findElement(By.cssSelector("#pt-header > div.pt-desktop-header > div:nth-child(2) > div > div.menu.cont-center > div > div > nav > ul > li:nth-child(12) > a > span"));
    }



}
