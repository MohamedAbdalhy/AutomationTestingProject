import org.example.LoginElm;
import org.example.ProductElm;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Product_Test {

    WebDriver driver =null;
    SoftAssert soft = new SoftAssert();
    ProductElm productElm = new ProductElm() ;

    @BeforeMethod
    public void openLoginPage(){
        driver = new ChromeDriver();
        driver.navigate().to("https://mofkera.com/ar");
        driver.manage().window().maximize();



    }

    @Test
    public void product_Components_Test1 () throws InterruptedException {
        // Validated All Components for product Presentation UI Is Set In Product Page
       productElm.ramdanBoxHeader(driver).click();
      productElm.ramdanBox(driver).click();
        driver.findElement(By.cssSelector("#shopify-section-product-template > div:nth-child(1) > div.container.container-fluid-mobile > div > div:nth-child(2) > div > div.pt-collapse-block.prpage-tabs.product_tabs_layout > div.pt-item.active > div.pt-collapse-title")).click();

        Assert.assertTrue(productElm.productName(driver).isDisplayed());
        Assert.assertTrue(productElm.productPrice(driver).isDisplayed());
        Assert.assertTrue(productElm.productCode(driver).isDisplayed());
        Assert.assertTrue(productElm.productType(driver).isDisplayed());
        Assert.assertTrue(productElm.productCount(driver).isDisplayed());
        Assert.assertTrue(productElm.productAddCart(driver).isDisplayed());
        Assert.assertTrue(productElm.productPhotoZoom(driver).isDisplayed());
    }
@Test
    public void product_Components_Test2 ()  {
        // Validated All Components for product Sold Out Presentation UI Is Set In Product Page
        productElm.sketchbookHeader(driver).click();
        productElm.sketchbookItem(driver).click();
soft.assertTrue(productElm.productName(driver).isDisplayed());
    soft.assertTrue(productElm.productCode(driver).isDisplayed());
    soft.assertTrue(productElm.productType(driver).isDisplayed());
    soft.assertTrue(productElm.productPhotoZoom(driver).isDisplayed());
    soft.assertTrue(productElm.productSoldOut(driver).isDisplayed());
    }

    @Test
    public void product_Count_Test3 ()  {
        // Validated Plus Count Click
        productElm.ramdanBoxHeader(driver).click();
        productElm.ramdanBox(driver).click();
        for (int i = 0 ; i<=2 ; i++) {
            productElm.countPlus(driver).click();
        }
        Assert.assertEquals(productElm.countResult(driver).getAttribute("value"),"4");
        }
        @Test
    public void product_Count_Test4 ()  {
        // Validated The Mins Product Count
        productElm.ramdanBoxHeader(driver).click();
        productElm.ramdanBox(driver).click();
        for (int i = 0 ; i<=2 ; i++) {
            productElm.countPlus(driver).click();
        }
        for (int i = 0 ; i<=1 ; i++) {
            productElm.countLess(driver).click();
        }
        Assert.assertEquals(productElm.countResult(driver).getAttribute("value"),"2");
    }

    @Test
    public void product_Count_Test5 ()  {
        // Validated The Number Of Count
        productElm.ramdanBoxHeader(driver).click();
        productElm.ramdanBox(driver).click();
        for (int i = 0 ; i<=6 ; i++) {
            productElm.countPlus(driver).click();
        }
        Assert.assertEquals(productElm.countResult(driver).getAttribute("value"),"5");
    }
    @Test
    public void product_Count_Test6 ()  {
        // Validated The Number Of Count With Manule Send
        productElm.ramdanBoxHeader(driver).click();
        productElm.ramdanBox(driver).click();
        productElm.countResult(driver).clear();
        productElm.countResult(driver).sendKeys(" 1 ");
        productElm.countResult(driver).sendKeys(Keys.END);
        Assert.assertEquals(productElm.countResult(driver).getAttribute("value"),"5");
    }
    @Test
    public void product_Count_Test7 ()  {
        // Validated The Number Of Count With Manule Send (Text)
        productElm.ramdanBoxHeader(driver).click();
        productElm.ramdanBox(driver).click();
        productElm.countResult(driver).clear();
        productElm.countResult(driver).sendKeys(" GFLMF ");
        productElm.countResult(driver).sendKeys(Keys.END);
        Assert.assertEquals(productElm.countResult(driver).getAttribute("value"),"NAN");
    }

    @Test
    public void product_ADDCart_Test8 ()  {
        // Validated The Number Of Count
        productElm.ramdanBoxHeader(driver).click();
        productElm.ramdanBox(driver).click();
        for (int i = 0 ; i<=2; i++) {
            productElm.countPlus(driver).click();
        }
        productElm.productAddCart(driver).click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://mofkera.com/ar/cart");
        Assert.assertEquals(productElm.countResultCart(driver).getAttribute("value"),"4");
        Assert.assertEquals(productElm.priceTotalProduct(driver).getText().contains("780"),true);
    }



    @AfterMethod
    public void closeBrowser(){
    //driver.quit();
    }
}
