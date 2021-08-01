import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AssignmentForShoppingcart
{
    public static WebDriver driver;
    String homePageExpectedTitle = "nopCommerce demo store";
    String homePageActualTitle;
    @BeforeAll
    public static void setup()
    {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
    }
     @Test
     @Order(1)
    public void pagetitle()
    {
        homePageActualTitle=driver.getTitle();
        Assertions.assertEquals(homePageActualTitle,homePageExpectedTitle);

    }
    @Test
    @Order(2)
    public  void apperallink()
    {

        driver.findElement(By.linkText("Apparel")).click();
        boolean appreallink = driver.findElement(By.linkText("Apparel")).isDisplayed();
        Assertions.assertTrue(appreallink,"Apperal link is selected");

    }
    @Test
    @Order(3)
    public void login()
    {

        boolean login= driver.findElement(By.linkText("Log in")).isDisplayed();
        Assertions.assertTrue(login,"login page is displayed");
        driver.findElement(By.linkText("Log in")).click();
    }
    @Test
    @Order(4)
    public void radiobutton()
    {
        driver.findElement(By.cssSelector("input#pollanswers-1")).click();
        boolean radio =driver.findElement(By.cssSelector("input#pollanswers-1")).isSelected();
        Assertions.assertFalse(radio,"excellent button is selected");

    }
    @AfterAll
    public static void teardown()
    {
        driver.quit();
    }
}
