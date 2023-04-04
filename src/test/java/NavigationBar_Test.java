import org.example.LoginElm;
import org.example.NavigationBarElm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NavigationBar_Test {
    WebDriver driver =null;
    SoftAssert soft = new SoftAssert();
NavigationBarElm navigationBarElm = new NavigationBarElm();

    @BeforeMethod
    public void openLoginPage(){
        driver = new ChromeDriver();
        driver.navigate().to("https://mofkera.com/ar");
        driver.manage().window().maximize();
    }
    @Test
    public void item1_Planner() throws InterruptedException {
      navigationBarElm.plannerLink(driver).click();
      Thread.sleep(2000);
      String act = navigationBarElm.productHeadText(driver).getText();
      String exp = "YEAR GIFT BOX 2023";
        Assert.assertEquals(act , exp);
        Assert.assertEquals(driver.getCurrentUrl(),"https://mofkera.com/ar/collections/planners-2023");
    }

    @Test
    public void item2_backpackItem() throws InterruptedException {
        navigationBarElm.backPackItem(driver).click();
        Thread.sleep(2000);
        String act = navigationBarElm.productHeadText(driver).getText();
        String exp = "Backpacks";
        Assert.assertEquals(act , exp);
        Assert.assertEquals(driver.getCurrentUrl(),"https://mofkera.com/ar/collections/backpacks");

    }
    @Test
    public void item3_ramadan() throws InterruptedException {
        navigationBarElm.backPackItem(driver).click();
        Thread.sleep(2000);
        String act = navigationBarElm.productHeadText(driver).getText();
        String exp = "TODO RAMADAN BOX";
        Assert.assertEquals(act , exp);
        Assert.assertEquals(driver.getCurrentUrl(),"https://mofkera.com/ar/collections/todo-ramadan-1444");
    }
    @Test
    public void item4_notebook()throws InterruptedException{
        navigationBarElm.notebooksItem(driver).click();
        Thread.sleep(2000);
        String act = navigationBarElm.productHeadText(driver).getText();
        String exp = "Note Books";
        Assert.assertEquals(act , exp);
        Assert.assertEquals(driver.getCurrentUrl(),"https://mofkera.com/ar/collections");

    }
    @Test
    public void item5_sketchbook()throws InterruptedException{
        navigationBarElm.sketchbookItem(driver).click();
        Thread.sleep(2000);
        String act = navigationBarElm.productHeadText(driver).getText();
        String exp = "Sketchbook";
        Assert.assertEquals(act , exp);
        Assert.assertEquals(driver.getCurrentUrl(),"https://mofkera.com/ar/collections/sketchbook/sketchbook");

    }
    @Test
    public void item6_laptop() throws InterruptedException {
        navigationBarElm.laptopItem(driver).click();
        Thread.sleep(2000);
        String act = navigationBarElm.productHeadText(driver).getText();
        String exp = "Laptop Sleeves";
        Assert.assertEquals(act , exp);
        Assert.assertEquals(driver.getCurrentUrl(),"https://mofkera.com/ar/collections/laptop-sleeves");
    }
    @Test
    public void item7_pencil() throws InterruptedException{
        navigationBarElm.pencilCase(driver).click();
        Thread.sleep(2000);
        String act = navigationBarElm.productHeadText(driver).getText();
        String exp = "Pencilcase";
        Assert.assertEquals(act , exp);
        Assert.assertEquals(driver.getCurrentUrl(),"https://mofkera.com/ar/collections/pencilcase/pencilcase");
    }
    @Test
    public void item8_makeup() throws InterruptedException{
        navigationBarElm.makeUp(driver).click();
        Thread.sleep(2000);
        String act = navigationBarElm.productHeadText(driver).getText();
        String exp = "makeup bag";
        Assert.assertEquals(act , exp);
        Assert.assertEquals(driver.getCurrentUrl(),"https://mofkera.com/ar/collections/makeup-bag");
    } @Test
    public void item9_giftbox() throws InterruptedException{
        navigationBarElm.gift(driver).click();
        Thread.sleep(2000);
        String act = navigationBarElm.productHeadText(driver).getText();
        String exp = "Gift Box™";
        Assert.assertEquals(act , exp);
        Assert.assertEquals(driver.getCurrentUrl(),"https://mofkera.com/ar/collections/gift-box%E2%84%A2");
    }
    @Test
    public void item10_coloring() throws InterruptedException{
        navigationBarElm.coloring(driver).click();
        Thread.sleep(2000);
        String act = navigationBarElm.productHeadText(driver).getText();
        String exp = "Coloring";
        Assert.assertEquals(act , exp);
        Assert.assertEquals(driver.getCurrentUrl(),"https://mofkera.com/ar/collections/coloring");
    }
    @Test
    public void item11_forKids() throws InterruptedException{
        navigationBarElm.forKids(driver).click();
        Thread.sleep(2000);
        String act = navigationBarElm.productHeadText(driver).getText();
        String exp = "For Kids™";
        Assert.assertEquals(act , exp);
        Assert.assertEquals(driver.getCurrentUrl(),"https://mofkera.com/ar/collections/for-kids-%E2%84%A2");
    }
    @Test
    public void item12_todo() throws InterruptedException{
        navigationBarElm.toDOItem(driver).click();
        Thread.sleep(2000);
        String act = navigationBarElm.productHeadText(driver).getText();
        String exp = "To Do";
        Assert.assertEquals(act , exp);
        Assert.assertEquals(driver.getCurrentUrl(),"https://mofkera.com/ar/collections/to-do");
    }

    @AfterMethod
    public void closeWeb (){
       driver.quit();
    }


}
