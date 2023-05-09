import net.bytebuddy.asm.Advice;
import org.example.LoginElm;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Login_Test {
    WebDriver driver =null;
    SoftAssert soft = new SoftAssert();
    LoginElm loginElm = new LoginElm() ;

    @BeforeMethod
    public void openLoginPage(){
        driver = new ChromeDriver();
//
        driver.navigate().to("https://mofkera.com/account/login");
        driver.manage().window().maximize();
    }
    @Test
    public void moj () throws InterruptedException {
        //1
        driver.findElement(By.cssSelector("#profile-tab > span")).click();
        Thread.sleep(2000);
        //2
 driver.findElement(By.xpath("/html/body/app-root/div/app-home-page/div/app-brand/div/div/div[1]/ul/li[7]/a")).click();
        Thread.sleep(10000);
        //3
 driver.findElement(By.xpath("/html/body/app-root/div/app-shop-by-brand/div/div/div[2]/div/div[3]/div/div/div[1]/div[1]/div/ul/li[6]/a/div/div[3]")).click();
 Thread.sleep(3000);
 //4
    driver.findElement(By.cssSelector("body > app-root > div > app-product-details > div > div.productDetails > div > div.productDetails-paymentOptions > div > div > div.addToBasket-btn > button")).click();
        Thread.sleep(3000);
        //5
        driver.findElement(By.cssSelector("body > app-root > div > app-shoping-cart > div > div.shopingCartContainer > div.shopingCartItemCont > div.shopingCartContainer-promoCode > div.shopingCartContainer-promoCode > div > div.cart_checkout.fontLightEnAr > button")).click();
Thread.sleep(3000);
//6
        Select cityDropdown = new Select(driver.findElement(By.cssSelector("#headingOne > div.col-md-4.col-sm-12.checkout-dropdownCity.checkoutDeleiveryOptionsPhase2EditWidth > select")));
    cityDropdown.selectByValue("0");
        Thread.sleep(3000);
        Select areaDropdown = new Select(driver.findElement(By.cssSelector("#headingOne > div:nth-child(3) > select")));
areaDropdown.selectByIndex(4);
        Thread.sleep(3000);
        //7
        driver.findElement(By.cssSelector("#collapseOne > div > div.checkout-DelivaryOptions.fontReg > div.row.DelivaryOptionsMirgen.justify-content-center > div:nth-child(1) > div.checkout-DelivaryOptionsInfo.checkout-DelivaryToAddress.open.firstOpen")).click();
        Thread.sleep(2000);
        //8
        driver.findElement(By.cssSelector("#checkout-deliveryAdd > div.row > div.delivery--info--data.checkout-address-padding > div > div.addressName > div > input")).sendKeys("elhay156");
        driver.findElement(By.cssSelector("#checkout-deliveryAdd > div.row > div.delivery--info--data.checkout-address-padding > div > div:nth-child(2) > div > input")).sendKeys("15");
        driver.findElement(By.cssSelector("#checkout-deliveryAdd > div.row > div.delivery--info--data.checkout-address-padding > div > div:nth-child(3) > div > input")).sendKeys("56");
        driver.findElement(By.cssSelector("#checkout-deliveryAdd > div.row > div.delivery--info--data.checkout-address-padding > div > div:nth-child(4) > div > input")).sendKeys("3");
        driver.findElement(By.cssSelector("#checkout-deliveryAdd > div.row > div.delivery--info--data.checkout-address-padding > div > div:nth-child(4) > div > input")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        //9
//10
        driver.findElement(By.cssSelector("#collapseTwo > form > div > div > div.col-md-6.col-sm-12.checkout-formControl.checkout-formControl1 > div:nth-child(1) > input")).sendKeys(Keys.ENTER);
//11
Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"collapseTwo\"]/form/div/div/div[1]/div[1]/app-alert/div/div/div/div[2]/div/div/div")).isDisplayed());




    }

    @Test
    public  void validLogin() throws InterruptedException {
        //Login With Valid Email And Password
    loginElm.email(driver).sendKeys("mohamedabdalhy99@gmail.com");
      loginElm.password(driver) .sendKeys("123456");
      Thread.sleep(3000);
     loginElm.loginButton(driver).click();
        Thread.sleep(4000);
        Assert.assertEquals(driver.getCurrentUrl(),"https://mofkera.com/account");
    }

    @Test
    public  void invalidLogin1() throws InterruptedException {
        //Login With inValid Email And valid Password
        loginElm.email(driver).sendKeys("mohamedabdalh@gmail.com");
        loginElm.password(driver) .sendKeys("123456");
        Thread.sleep(3000);
        loginElm.loginButton(driver).click();
        Thread.sleep(4000);
       soft.assertEquals(driver.getCurrentUrl(),"https://mofkera.com/account/login");
        soft.assertTrue(driver.findElement(By.cssSelector("#customer_login > div.pt-base-color > div > ul > li")).isDisplayed());
    }

    @Test
    public  void invalidLogin2() throws InterruptedException {
        //Login With Valid Email And invalid Password
        loginElm.email(driver).sendKeys("mohamedabdalhy99@gmail.com");
        loginElm.password(driver) .sendKeys("12356");
        Thread.sleep(3000);
        loginElm.loginButton(driver).click();
        Thread.sleep(4000);
        soft.assertEquals(driver.getCurrentUrl(),"https://mofkera.com/account/login");
        soft.assertTrue(driver.findElement(By.cssSelector("#customer_login > div.pt-base-color > div > ul > li")).isDisplayed());

    }
    @Test
    public  void invalidLogin3() throws InterruptedException {
        //Login Without Email And  Password
        Thread.sleep(3000);
        loginElm.loginButton(driver).click();
        Thread.sleep(4000);
        soft.assertEquals(driver.getCurrentUrl(),"https://mofkera.com/account/login");
        soft.assertTrue(driver.findElement(By.cssSelector("#customer_login > div.pt-base-color > div > ul > li")).isDisplayed());

    }
    @Test
    public  void invalidLogin4() throws InterruptedException {
        //Login With Valid Email And Without Password
        loginElm.email(driver).sendKeys("mohamedabdalhy99@gmail.com");
        loginElm.password(driver) .sendKeys("");

        Thread.sleep(3000);
        loginElm.loginButton(driver).click();
        Thread.sleep(4000);
        soft.assertEquals(driver.getCurrentUrl(),"https://mofkera.com/account/login");
        soft.assertTrue(driver.findElement(By.cssSelector("#customer_login > div.pt-base-color > div > ul > li")).isDisplayed());

    }
    @Test
    public void forgetPassword() throws InterruptedException {
       loginElm.forgetPass(driver).click();
        Thread.sleep(4000);
        loginElm.forgetPassEmail(driver).sendKeys("mohamedabdalhy99@gmail.com");
        Thread.sleep(3000);
        soft.assertTrue(driver.findElement(By.cssSelector("#recover-password > h2")).isDisplayed());
        soft.assertTrue(driver.findElement(By.cssSelector(" #recover-password")).isDisplayed());
    }

    @Test
    public void createAccount() throws InterruptedException {

loginElm.createNewAccount(driver).click();
        Thread.sleep(2000);
Assert.assertEquals(driver.getCurrentUrl(), "https://mofkera.com/account/register");

    }

    @AfterMethod
    public void closeWebPage(){
//     driver.quit();

    }


}


