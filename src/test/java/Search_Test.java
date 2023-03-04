import org.example.SearchElm;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.sql.Driver;

public class Search_Test {
    WebDriver driver =null;
    SearchElm searchElm = new SearchElm();
    SoftAssert soft = new SoftAssert();
    @BeforeMethod
    public void openLoginPage(){
        driver = new ChromeDriver();
        driver.navigate().to("https://mofkera.com/ar");
        driver.findElement(By.cssSelector("#pt-header > div.pt-desktop-header > div.container-fluid.menuwithout-bg-drop-small > div > div.options > div.pt-desctop-parent-search.pt-parent-box > div > button")).click();
        driver.manage().window().maximize();
    }
    @Test
    public void search_Test1() throws InterruptedException {
        // validate search function With Valid Product in the store (Note)
              searchElm.searchINPUT(driver).sendKeys("Note");
Thread.sleep(2000);
        searchElm.searchINPUT(driver).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.cssSelector("#pt-pageContent > div > div > h1")).isDisplayed());
         String actResult = driver.findElement(By.cssSelector("#pt-pageContent > div > div > h1 > span")).getText();
         String expResult = "(167)";
         Assert.assertEquals(actResult,expResult);
    }
    @Test
    public void search_Test2() throws InterruptedException {
        searchElm.searchINPUT(driver).sendKeys("Mobile");
        Thread.sleep(2000);
        searchElm.searchINPUT(driver).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.cssSelector("#pt-pageContent > div > div > div > h1")).isDisplayed());
        String actResult = driver.findElement(By.cssSelector("#pt-pageContent > div > div > div > h1")).getText();
        String expResult = "Your search returns no results.";
        Assert.assertEquals(actResult,expResult);
    }
    @Test
    public void search_Test3() throws InterruptedException {
        searchElm.searchINPUT(driver).sendKeys("1235");
        Thread.sleep(2000);
        searchElm.searchINPUT(driver).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.cssSelector("#pt-pageContent > div > div > div > h1")).isDisplayed());
        String actResult = driver.findElement(By.cssSelector("#pt-pageContent > div > div > div > h1")).getText();
        String expResult = "Your search returns no results.";
        Assert.assertEquals(actResult,expResult);
    }

    @AfterMethod
public void closeWeb (){
        driver.quit();
    }

}
