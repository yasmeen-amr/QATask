package Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ProductSearch
{
    private static final Logger logger = LogManager.getLogger(ProductSearch.class);
    public WebDriver driver;
    private WebDriverWait wait;

    public ProductSearch(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "/html/body/div[2]/header/div[1]/div/ul/li[2]/a")
    WebElement Sigin;
    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[2]/div[2]/div/div/a")
    WebElement CreateAccount;
    @FindBy(id="firstname")
    WebElement FirstName;
    @FindBy(id ="lastname")
    WebElement LastName;
    @FindBy(id= "email_address")
    WebElement Email;
    @FindBy(id = "password")
    WebElement Password;
    @FindBy(id="password-confirmation")
    WebElement ConfirmPassword;
    @FindBy(xpath = "//*[@id=\"form-validate\"]/div/div[1]/button/span")
    WebElement CreateanAccount;
    @FindBy(xpath = "//*[@id=\"search\"]")
    WebElement Search;
    @FindBy(css = "button.action.search")
    WebElement SearchBUtton;
    @FindBy(css= ".product-item")
    List<WebElement> searchResults;
    @FindBy(css= ".page-title span")
    WebElement searchTitle;


    public void clickSigin()
    {
        try
        {
        logger.trace("Trying to click on Sigin");
        Sigin.click();
        logger.trace("Clicked on Sigin");
        }
        catch (Exception e)
        {
            logger.error("Failed to click on Sigin");
        }
    }

    public void clickCreateAccount()
    {
        try
        {
        logger.trace("Trying to click on CreateAccount");
        CreateAccount.click();
        logger.trace("Clicked on CreateAccount");
        }
        catch (Exception e)
        {
            logger.error("Failed to click on CreateAccount");
        }
    }
    public void enterFirstName(String fname)
    {
        try
        {
            logger.trace("Trying to enter First Name");
            FirstName.sendKeys(fname);
            logger.trace("Entered First Name");
        }
        catch (Exception e)
        {
            logger.error("Failed to enter First Name");
        }
    }
    public void enterLastName(String lname)
    {
        try
        {
           logger.trace("Trying to enter Last Name");
           LastName.sendKeys(lname);
           logger.trace("Entered Last Name");
        }
        catch (Exception e)
        {
            logger.error("Failed to enter Last Name");
        }
    }
    public void enterEmail(String email)
    {
        try
        {
            logger.trace("Trying to enter Email");
            Email.sendKeys(email);
            logger.trace("Entered Email");
        }
        catch (Exception e)
        {
            logger.error("Failed to enter Email");
        }
    }
    public void enterPassword(String pass)
    {
        try
        {
            logger.trace("Trying to enter Password");
            Password.sendKeys(pass);
            logger.trace("Entered Password");
        }
        catch (Exception e)
        {
            logger.error("Failed to enter Password");
        }
    }
    public void enterConfirmPassword(String cpass)
    {
        try
        {
            logger.trace("Trying to enter Confirm Password");
            ConfirmPassword.sendKeys(cpass);
            logger.trace("Entered Confirm Password");
        }
        catch (Exception e)
        {
            logger.error("Failed to enter Confirm Password");
        }
    }
    public void clickCreateanAccount()
    {
        try
        {
            logger.trace("Trying to click on CreateanAccount");
            CreateanAccount.click();
            logger.trace("Clicked on CreateanAccount");
        }
        catch (Exception e)
        {
            logger.error("Failed to click on CreateanAccount");
        }
    }
    public void enterSearch(String search)
    {
        try
        {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(Search));
            logger.trace("Trying to enter Search");
            Search.sendKeys(search);
            logger.trace("Entered Search");
        }
        catch (Exception e)
        {
            logger.error("Failed to enter Search");
        }
    }
    public void clickSearchButton()
    {
        try
        {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(SearchBUtton));
            logger.trace("Trying to click on SearchResult");
            SearchBUtton.click();
            this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            logger.trace("Clicked on SearchResult");
        }
        catch (Exception e)
        {
            logger.error("Failed to click on SearchResult");
        }
    }
    public boolean isSearchResultDisplayed()
    {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOfAllElements(searchResults));            logger.info("Search results are displayed");
            return searchResults.size() > 0;
        } catch (Exception e) {
            logger.warn("No results found or took too long");
            return false;
        }

    }
    public String getSearchTitle()
    {
        return searchTitle.getText().trim();
    }
    public void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 1000);");
    }








}
