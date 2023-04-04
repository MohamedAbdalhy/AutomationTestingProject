import org.example.ConfirmShippingElm;
import org.example.InformationElm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ConfirmShipping_Test {
    WebDriver driver = null;
    SoftAssert soft = new SoftAssert();
    InformationElm informationElm = new InformationElm();
    ConfirmShippingElm confirmShippingElm = new ConfirmShippingElm();
    String email = "Mohamedabd@gmail.com";
    String shippingRate ;
    int selectIndex = 8 ;

    @BeforeMethod
    public void openLoginPage() {
        driver = new ChromeDriver();
        driver.navigate().to("https://mofkera.com/checkouts/c/7ab0afb85b502449d78fb697e57162a2/information");
        driver.manage().window().maximize();
    }
    @Test
    public void fillIn_All_Information_Form() throws InterruptedException {
        informationElm.emailORmobile(driver).sendKeys(email);
        informationElm.country(driver).selectByIndex(0);
        informationElm.firstName(driver).sendKeys("Mohamed");
        informationElm.lastName(driver).sendKeys("Eslam");
        informationElm.company(driver).sendKeys("ITI");
        informationElm.address(driver).sendKeys("380 - 6october City");
        informationElm.apartment(driver).sendKeys("3");
        informationElm.city(driver).sendKeys("6 October");
        informationElm.governorate(driver).selectByIndex(8);
        informationElm.postalCode(driver).sendKeys("3210001");
        informationElm.phone(driver).sendKeys("01054795346");
        Assert.assertTrue(informationElm.discountInput(driver).isEnabled());
        Thread.sleep(2000);
        informationElm.goTOShipping(driver).click();
        Assert.assertEquals(driver.getCurrentUrl().contains("https://mofkera.com/checkouts/c/7ab0afb85b502449d78fb697e57162a2/information"), false);
        Thread.sleep(2000);
      Assert.assertEquals(confirmShippingElm.confirmationEmail(driver).getText(),email);
      if (selectIndex == 2 ){
      Assert.assertEquals(confirmShippingElm.shippingrate(driver).getText(),"E£65.00");}
      else if (selectIndex==8){
          Assert.assertEquals(confirmShippingElm.shippingrate(driver).getText().contains("E£35.00"),true);}
      Thread.sleep(2000);
      confirmShippingElm.toPay(driver).click();
        Thread.sleep(4000);
      Assert.assertTrue(confirmShippingElm.ChosePaymentMethod(driver).isDisplayed());
    }
    @AfterMethod
    public void closeweb(){
       driver.quit();


    }
    }


