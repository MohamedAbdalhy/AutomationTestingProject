import org.example.LoginElm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
    loginElm.email(driver).sendKeys("mohamedabdalhy99@gmail.com");
      loginElm.password(driver) .sendKeys("123456");
      Thread.sleep(3000);
     loginElm.loginButton(driver).click();
        Thread.sleep(4000);
        Assert.assertEquals(driver.getCurrentUrl(),"https://mofkera.com/account");
    }
    @AfterMethod
    public void closeWebPage(){
     driver.quit();

    }


}


