
import org.example.InformationElm;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Information_Test {
    WebDriver driver = null;
    SoftAssert soft = new SoftAssert();
    InformationElm informationElm = new InformationElm();

    @BeforeMethod
    public void openLoginPage() {
        driver = new ChromeDriver();
        driver.navigate().to("https://mofkera.com/checkouts/c/7ab0afb85b502449d78fb697e57162a2/information");
        driver.manage().window().maximize();
    }
    @Test
    public void fillIn_All_Information_Form() throws InterruptedException {
        informationElm.emailORmobile(driver).sendKeys("Mohamedabd@gmail.com");
        informationElm.country(driver).selectByIndex(0);
        informationElm.firstName(driver).sendKeys("Mohamed");
        informationElm.lastName(driver).sendKeys("Eslam");
        informationElm.company(driver).sendKeys("ITI");
        informationElm.address(driver).sendKeys("380 - 6october City");
        informationElm.apartment(driver).sendKeys("3");
        informationElm.city(driver).sendKeys("6 October");
        informationElm.governorate(driver).selectByIndex(2);
        informationElm.postalCode(driver).sendKeys("3210001");
        informationElm.phone(driver).sendKeys("01054795346");
        Thread.sleep(2000);
        informationElm.goTOShipping(driver).click();
        Assert.assertEquals(driver.getCurrentUrl().contains("https://mofkera.com/checkouts/c/7ab0afb85b502449d78fb697e57162a2/information"), false);
        Assert.assertTrue(informationElm.discountInput(driver).isEnabled());
    }

    @Test
    public void fillIn_WithoutFirstName_Information_Form() throws InterruptedException {
        informationElm.emailORmobile(driver).sendKeys("Mohamedabd@gmail.com");
        informationElm.country(driver).selectByIndex(0);
        informationElm.lastName(driver).sendKeys("Eslam");
        informationElm.company(driver).sendKeys("ITI");
        informationElm.address(driver).sendKeys("380 - 6october City");
        informationElm.apartment(driver).sendKeys("3");
        informationElm.city(driver).sendKeys("6 October");
        informationElm.governorate(driver).selectByIndex(2);
        informationElm.postalCode(driver).sendKeys("3210001");
        informationElm.phone(driver).sendKeys("01054795346");
        Thread.sleep(2000);
        informationElm.goTOShipping(driver).click();
        Assert.assertTrue(informationElm.messageFirstName(driver).isDisplayed());

    }

    @Test
    public void fillIn_WithoutLastName_Information_Form() throws InterruptedException {
        informationElm.emailORmobile(driver).sendKeys("Mohamedabd@gmail.com");
        informationElm.country(driver).selectByIndex(0);
        informationElm.firstName(driver).sendKeys("Mohamed");
        informationElm.company(driver).sendKeys("ITI");
        informationElm.address(driver).sendKeys("380 - 6october City");
        informationElm.apartment(driver).sendKeys("3");
        informationElm.city(driver).sendKeys("6 October");
        informationElm.governorate(driver).selectByIndex(2);
        informationElm.postalCode(driver).sendKeys("3210001");
        informationElm.phone(driver).sendKeys("01054795346");
        Thread.sleep(1000);
        informationElm.goTOShipping(driver).click();
        Assert.assertTrue(informationElm.messageLastName(driver).isDisplayed());
    }

    @Test
    public void fillIn_withoutPhone_Information_Form() throws InterruptedException {
        informationElm.emailORmobile(driver).sendKeys("Mohamedabd@gmail.com");
        informationElm.country(driver).selectByIndex(0);
        informationElm.firstName(driver).sendKeys("Mohamed");
        informationElm.lastName(driver).sendKeys("Eslam");
        informationElm.company(driver).sendKeys("ITI");
        informationElm.address(driver).sendKeys("380 - 6october City");
        informationElm.apartment(driver).sendKeys("3");
        informationElm.city(driver).sendKeys("6 October");
        informationElm.governorate(driver).selectByIndex(2);
        informationElm.postalCode(driver).sendKeys("3210001");
        Thread.sleep(2000);
        informationElm.goTOShipping(driver).click();
        Assert.assertTrue(informationElm.messagePhone(driver).isDisplayed());
    }

    @Test
    public void fillIn_WithoutAddress_Information_Form() throws InterruptedException {
        informationElm.emailORmobile(driver).sendKeys("Mohamedabd@gmail.com");
        informationElm.country(driver).selectByIndex(0);
        informationElm.firstName(driver).sendKeys("Mohamed");
        informationElm.lastName(driver).sendKeys("Eslam");
        informationElm.company(driver).sendKeys("ITI");
        informationElm.apartment(driver).sendKeys("3");
        informationElm.city(driver).sendKeys("6 October");
        informationElm.governorate(driver).selectByIndex(2);
        informationElm.postalCode(driver).sendKeys("3210001");
        informationElm.phone(driver).sendKeys("01054795346");
        Thread.sleep(2000);
        informationElm.goTOShipping(driver).click();
        Assert.assertTrue(informationElm.messageAddress(driver).isDisplayed());
    }

    @Test
    public void fillIn_withoutCity_Information_Form() throws InterruptedException {
        informationElm.emailORmobile(driver).sendKeys("Mohamedabd@gmail.com");
        informationElm.country(driver).selectByIndex(0);
        informationElm.firstName(driver).sendKeys("Mohamed");
        informationElm.lastName(driver).sendKeys("Eslam");
        informationElm.company(driver).sendKeys("ITI");
        informationElm.address(driver).sendKeys("380 - 6october City");
        informationElm.apartment(driver).sendKeys("3");
        informationElm.governorate(driver).selectByIndex(2);
        informationElm.postalCode(driver).sendKeys("3210001");
        informationElm.phone(driver).sendKeys("01054795346");
        Thread.sleep(2000);
        informationElm.goTOShipping(driver).click();
        Assert.assertTrue(informationElm.messageCity(driver).isDisplayed());
    }

    @Test
    public void fillIn_withInvalidEmail_Information_Form() throws InterruptedException {
        informationElm.emailORmobile(driver).sendKeys("Mohamedabdmail.com");
        informationElm.country(driver).selectByIndex(0);
        informationElm.firstName(driver).sendKeys("Mohamed");
        informationElm.lastName(driver).sendKeys("Eslam");
        informationElm.company(driver).sendKeys("ITI");
        informationElm.address(driver).sendKeys("380 - 6october City");
        informationElm.apartment(driver).sendKeys("3");
        informationElm.city(driver).sendKeys("6 October");
        informationElm.governorate(driver).selectByIndex(2);
        informationElm.postalCode(driver).sendKeys("3210001");
        informationElm.phone(driver).sendKeys("01054795346");
        Thread.sleep(2000);
        informationElm.goTOShipping(driver).click();
        Assert.assertTrue(informationElm.messageEmail(driver).isDisplayed());

    }


    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }
}
