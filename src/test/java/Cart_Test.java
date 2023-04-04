import org.example.CartElm;
import org.example.LoginElm;
import org.example.ProductElm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Cart_Test {
    WebDriver driver =null;
    SoftAssert soft = new SoftAssert();
    CartElm cartElm = new CartElm() ;
    ProductElm productElm = new ProductElm();

    @BeforeMethod
    public void openCartPage(){
        driver = new ChromeDriver();
        driver.navigate().to("https://mofkera.com/ar");
        driver.manage().window().maximize();

    }

@Test (priority = 1)
    public void emptyCartComponents (){
        //Validate EmptyCart UI and Components are Set in Page
    driver.navigate().to("https://mofkera.com/cart");
    Assert.assertTrue(cartElm.emptyCartMassage(driver).isDisplayed());
    Assert.assertEquals(cartElm.emptyCartMassage(driver).getText(),"Shopping cart is empty");
    Assert.assertTrue(cartElm.emptyShoppingButton(driver).isDisplayed());
}

@Test (priority = 1)
public void emptyCartButton(){
        // Validate "Continue Shopping" button is Work and move to Home Page
    driver.navigate().to("https://mofkera.com/cart");
    cartElm.emptyShoppingButton(driver).click();
    Assert.assertEquals(driver.getCurrentUrl(),"https://mofkera.com/");
}


@Test (priority = 2)
public void afterAddToCart_Test1() throws InterruptedException {
        //Validate Integration Between Product and cart is movement did true

    productElm.ramdanBoxHeader(driver).click();
    productElm.ramdanBox(driver).click();
    for (int i = 0 ; i<=2; i++) {
        productElm.countPlus(driver).click();
    }
    Thread.sleep(2000);
    String productName=  productElm.productName(driver).getText();
    productElm.productAddCart(driver).click();
    Assert.assertEquals(cartElm.productCount(driver).getAttribute("value"),"4");
    Assert.assertTrue(cartElm.productPrice(driver).getText().contains("195"));
    Assert.assertEquals(productName , cartElm.productCartName(driver).getText());

}
    @Test (priority = 2)
    public void clear_afterAddToCart_Test2() throws InterruptedException {
        //Validate Integration Between Product and cart is movement did true

        productElm.ramdanBoxHeader(driver).click();
        productElm.ramdanBox(driver).click();
        for (int i = 0 ; i<=2; i++) {
            productElm.countPlus(driver).click();
        }
        Thread.sleep(2000);
        String productName=  productElm.productName(driver).getText();
        productElm.productAddCart(driver).click();
        cartElm.clearCart(driver).click();
        Assert.assertTrue(cartElm.emptyCartMassage(driver).isDisplayed());
        Assert.assertEquals(cartElm.emptyCartMassage(driver).getText(),"Shopping cart is empty");
        Assert.assertTrue(cartElm.emptyShoppingButton(driver).isDisplayed());
    }
    @Test (priority = 2)
    public void plus_afterAddToCart_Test3() throws InterruptedException {
        //Validate plus and update button Between Product and cart is movement did true

        productElm.ramdanBoxHeader(driver).click();
        productElm.ramdanBox(driver).click();
        for (int i = 0 ; i<=1; i++) {
            productElm.countPlus(driver).click();
        }
        productElm.productAddCart(driver).click();
        cartElm.plusProductCount(driver).click();
        cartElm.updateCart(driver).click();
        Assert.assertEquals(cartElm.productCount(driver).getAttribute("value"),"4");
        Assert.assertEquals(cartElm.productTotalPrice(driver).getText().contains("780"),true);
        Assert.assertEquals(cartElm.grandTotal(driver).getText().contains("780"),true);
    }
    @Test
    public void less_afterAddToCart_Test3() throws InterruptedException {
        //Validate less and update buttons Between Product and cart is movement did true

        productElm.ramdanBoxHeader(driver).click();
        productElm.ramdanBox(driver).click();
        for (int i = 0 ; i<=1; i++) {
            productElm.countPlus(driver).click();
        }
        productElm.productAddCart(driver).click();
        cartElm.lessProductCount(driver).click();
        cartElm.updateCart(driver).click();
        Assert.assertEquals(cartElm.productCount(driver).getAttribute("value"),"2");
        Assert.assertEquals(cartElm.productTotalPrice(driver).getText().contains("390"),true);
        Assert.assertEquals(cartElm.grandTotal(driver).getText().contains("390"),true);
    }

    @Test
    public void delete_afterAddToCart_Test2() throws InterruptedException {
        //Validate delete product function

        productElm.ramdanBoxHeader(driver).click();
        productElm.ramdanBox(driver).click();
        for (int i = 0 ; i<=2; i++) {
            productElm.countPlus(driver).click();
        }
        Thread.sleep(2000);
        String productName=  productElm.productName(driver).getText();
        productElm.productAddCart(driver).click();
        cartElm.deleteProductFromCart(driver).click();
        Assert.assertTrue(cartElm.emptyCartMassage(driver).isDisplayed());
        Assert.assertEquals(cartElm.emptyCartMassage(driver).getText(),"Shopping cart is empty");
        Assert.assertTrue(cartElm.emptyShoppingButton(driver).isDisplayed());
    }
    @Test
    public void shipping_Selections_afterAddToCart_Test2() throws InterruptedException {
        //Validate Shipping
        productElm.ramdanBoxHeader(driver).click();
        productElm.ramdanBox(driver).click();
        for (int i = 0 ; i<=2; i++) {
            productElm.countPlus(driver).click();
        }

        productElm.productAddCart(driver).click();
        cartElm.selectCountry(driver).selectByIndex(0);
        cartElm.selectProvince(driver).selectByIndex(12);
        cartElm.zipCodeInput(driver).sendKeys("3387722");
        cartElm.collectShippingButton(driver).click();
        Thread.sleep(2000);
        Assert.assertEquals(cartElm.shippingRate(driver).isDisplayed(),true);
        Assert.assertEquals(cartElm.shippingRate(driver).getText().contains("35"),true);
        Assert.assertTrue(cartElm.shoppingAfterAdd(driver).isDisplayed());

    }
    @Test
    public void shipping_Selections_afterAddToCart_Test3() throws InterruptedException {
        //Validate Shipping without Province
        productElm.ramdanBoxHeader(driver).click();
        productElm.ramdanBox(driver).click();
        for (int i = 0 ; i<=2; i++) {
            productElm.countPlus(driver).click();
        }
        productElm.productAddCart(driver).click();
        cartElm.selectCountry(driver).selectByIndex(0);
        cartElm.collectShippingButton(driver).click();
        Thread.sleep(2000);
        Assert.assertEquals(cartElm.shippingRate(driver).isDisplayed(),true);
        Assert.assertEquals(cartElm.shippingRate(driver).getText().contains("35"),true);
    }
    @Test
    public void goToCheckOut_Selections_afterAddToCart_Test3() throws InterruptedException {
        //Validate Shipping without Province
        productElm.ramdanBoxHeader(driver).click();
        productElm.ramdanBox(driver).click();
        for (int i = 0 ; i<=2; i++) {
            productElm.countPlus(driver).click();
        }
        productElm.productAddCart(driver).click();
        cartElm.selectCountry(driver).selectByIndex(0);
        cartElm.collectShippingButton(driver).click();
        Thread.sleep(2000);
        cartElm.proceedToCheckOut(driver).click();
        Thread.sleep(2000);
        Assert.assertEquals(driver.getCurrentUrl().contains("https://mofkera.com/checkouts/"),true);

    }



    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
}
