package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest
{
    public static WebDriver driver = new ChromeDriver();

    @BeforeMethod
    public void setUp()
    {
        WebDriverManager.chromedriver().setup();
        driver.get("https://magento.softwaretestingboard.com/men/tops-men/hoodies-and-sweatshirts-men.html");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void Quit()
    {
        driver.quit();
    }



}
