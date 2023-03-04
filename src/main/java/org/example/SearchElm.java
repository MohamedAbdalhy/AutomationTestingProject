package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchElm {
    public WebElement searchINPUT(WebDriver driver){
        return         driver.findElement(By.cssSelector("#pt-header > div.pt-desktop-header > " +
                "div.container-fluid.menuwithout-bg-drop-small > div > div.options > " +
                "div.pt-desctop-parent-search.pt-parent-box > div > div > div > form > " +
                "div:nth-child(1) > input.pt-search-input"));

    }
}
