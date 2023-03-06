import org.example.LoginElm;
import org.example.ProductElm;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

public class Product_Test {

    WebDriver driver =null;
    SoftAssert soft = new SoftAssert();
    ProductElm productElm = new ProductElm() ;

    @BeforeMethod
    public void openLoginPage(){
        driver = new ChromeDriver();
        driver.navigate().to("https://mofkera.com/account/login");
        driver.manage().window().maximize();
    }
    



    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
}
