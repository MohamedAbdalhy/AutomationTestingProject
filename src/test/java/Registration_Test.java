import org.example.RegistrationElm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class Registration_Test {

    WebDriver driver =null;
    SoftAssert soft = new SoftAssert();
    RegistrationElm registrationElm = new RegistrationElm();

@BeforeMethod
public void openBrowser(){
    driver = new ChromeDriver();
    driver.navigate().to("https://mofkera.com/account/register");
    driver.manage().window().maximize();

}
@Test
public void validCase() {
    registrationElm.firstName(driver).sendKeys("Eslam");
    registrationElm.lastName(driver).sendKeys("Ahmed");
    registrationElm.email(driver).sendKeys("4655HBHJ6@gmail.com");
   registrationElm.passWord(driver).sendKeys("123456");
   registrationElm.createButton(driver).click();
   //Assertion 1
    soft.assertEquals(driver.getCurrentUrl(), "https://mofkera.com/challenge");
    //Assertion 2
    String act = driver.findElement(By.className("shopify-challenge__message")).getText();
    String exp = "TO CONTINUE, LET US KNOW YOU'RE NOT A ROBOT.";
    soft.assertEquals(act,exp);
}
@Test
public void invalidCase01() {
    //Completed login process without required inputs(First name - last name)

    registrationElm.email(driver).sendKeys("Ahm1856489@gmail.com");
    registrationElm.passWord(driver).sendKeys("123456");
    registrationElm.createButton(driver).click();
    //Assertion 1
    Assert.assertEquals(driver.getCurrentUrl(),"https://mofkera.com/account/register");
}

@Test
public void invalidCase02() {
    //Completed login process with invalid email

    registrationElm.firstName(driver).sendKeys("Eslam");
    registrationElm.lastName(driver).sendKeys("Ahmed");
    registrationElm.email(driver).sendKeys("4655HBHJ6gmail.com");
    registrationElm.passWord(driver).sendKeys("123456");
    registrationElm.createButton(driver).click();
    //Assertion 1
    Assert.assertEquals(driver.getCurrentUrl(),"https://mofkera.com/account/register");
}
@Test
    public void invalidCase03() {
        //Completed login process without email

        registrationElm.firstName(driver).sendKeys("Eslam");
        registrationElm.lastName(driver).sendKeys("Ahmed");
        registrationElm.passWord(driver).sendKeys("123456");
        registrationElm.createButton(driver).click();
        //Assertion 1
        Assert.assertEquals(driver.getCurrentUrl(),"https://mofkera.com/account/register");
        Assert.assertTrue(driver.findElement(By.className("errors")).isDisplayed());
    }

    @Test
    public void invalidCase04() {
        //Completed login process with incorrect password (4 char only)
        registrationElm.firstName(driver).sendKeys("Eslam");
        registrationElm.lastName(driver).sendKeys("Ahmed");
        registrationElm.email(driver).sendKeys("4655HBHJ6@gmail.com");
        registrationElm.passWord(driver).sendKeys("1234");
        registrationElm.createButton(driver).click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://mofkera.com/account/register");
        Assert.assertTrue(driver.findElement(By.className("errors")).isDisplayed());
    }
    @Test
    public void returnClicke() {
registrationElm.returnToStore(driver).click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://mofkera.com/");
    }


 @AfterMethod
 public void closeBrowser(){
//    driver.quit();
    }


}
