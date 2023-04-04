import org.example.LoginElm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
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
        driver.navigate().to("https://mofkera.com/account/login");
        driver.manage().window().maximize();
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
     driver.quit();

    }


}


