import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Login_Test {
    WebDriver driver =null;
    SoftAssert soft = new SoftAssert();

    @BeforeMethod
    public void openBrowser(){
        driver = new ChromeDriver();
        driver.navigate().to("https://mofkera.com/account/register");
        driver.manage().window().maximize();
    }

    @Test
    public  void validLogin(){

        driver.findElement();


    }


}


