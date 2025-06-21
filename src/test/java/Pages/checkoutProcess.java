package Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class checkoutProcess
{
    private static final Logger logger = LogManager.getLogger(ProductSearch.class);
    public WebDriver driver;
    private WebDriverWait wait;

    public checkoutProcess(WebDriver driver)
    {
            this.driver = driver;
            PageFactory.initElements(driver, this);
//            wait =  new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[2]/div/div/strong/a")
    WebElement ProductName;
    @FindBy(xpath = "//*[@id=\"option-label-size-143-item-168\"]")
    WebElement Size;
    @FindBy(xpath = "//*[@id=\"option-label-color-93-item-53\"]")
    WebElement Color;
    @FindBy(xpath = "//*[@id=\"product-addtocart-button\"]")
    WebElement AddToCart;
    @FindBy(xpath = "/html/body/div[2]/header/div[2]/div[1]/a")
    WebElement Cart;
    @FindBy(xpath = "//*[@id=\"top-cart-btn-checkout\"]")
    WebElement Checkout;
    @FindBy(xpath = "//*[@id=\"customer-email\"]")
    WebElement Email;
    @FindBy(css = "#F9QORC2")
    WebElement FirstName;
    @FindBy(css = "#HGCHT8K")
    WebElement LastName;
    @FindBy(css = "#F07OBRN")
    WebElement Company;
    @FindBy(xpath = "//*[@id=\"X92QYYF\"]")
    WebElement Address;
    @FindBy(xpath = "//*[@id=\"EP8MT9X\"]")
    WebElement Address2;
    @FindBy(xpath = "//*[@id=\"GGT2OSM\"]")
    WebElement Address3;
    @FindBy(xpath = "//*[@id=\"N36ORN6\"]")
    WebElement City;
    @FindBy(xpath = "//*[@id=\"H0QCTFO\"]")
    WebElement postalCode;
    @FindBy(xpath = "//*[@id=\"GFNT1ON\"]")
    WebElement CountryDropdown;
    @FindBy(xpath = "//*[@id=\"O8MTWHH\"]")
    WebElement PhoneNumber;
    @FindBy(xpath = "//*[@id=\"VL4CNLK\"]")
    WebElement StateDropDown;
    @FindBy(xpath = "//*[@id=\"checkout-shipping-method-load\"]/table/tbody/tr[1]/td[1]/input")
    WebElement TableRate;
    @FindBy(xpath = "//*[@id=\"checkout-shipping-method-load\"]/table/tbody/tr[2]/td[1]/input")
    WebElement FlatRate;
    @FindBy(xpath = "//*[@id=\"shipping-method-buttons-container\"]/div/button")
    WebElement NextButton;
    @FindBy(xpath = "//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]/div/button")
    WebElement PlaceOrder;

    public void chooseProduct()
    {
        ProductName.click();
        Size.click();
        Color.click();
        AddToCart.click();

    }
    public void goToCart()
    {
        try
        {
            logger.trace("Trying to click on Cart");
            Cart.click();
            logger.trace("Clicked on Cart");
        }catch (Exception e)
        {
            logger.error("Failed to click on Cart");
        }
    }
    public void goToCheckout()
    {
        try
        {
            logger.trace("Trying to click on Checkout");
            Checkout.click();
            logger.trace("Clicked on Checkout");
        }catch (Exception e)
        {
            logger.error("Failed to click on Checkout");
        }
    }

    public void setEmail (String email)
    {
        try
        {
            logger.trace("Trying to enter email");
            Email.sendKeys(email);
            logger.trace("Entered email");
        }catch (Exception e)
        {
            logger.error("Failed to enter email");
        }
    }
    public void setFirstName(String fname)
    {
        try {
            logger.trace("Trying to enter First Name");
            FirstName.sendKeys(fname);
            logger.trace("Entered First Name");
        }catch (Exception e)
        {
            logger.error("Failed to enter First Name");
        }
    }
    public void setLastName(String lname)
    {
        try
        {
            logger.trace("Trying to enter Last Name");
            LastName.sendKeys(lname);
            logger.trace("Entered Last Name");
        }catch (Exception e){
            logger.error("Failed to enter Last Name");
        }
    }
    public void setCompany(String company)
    {
        try
        {
            logger.trace("Trying to enter Company Name");
            Company.sendKeys(company);
            logger.trace("Entered Company Name");
        }catch (Exception e){
            logger.error("Failed to enter Company Name");
        }
    }

    public void setAddress(String add)
    {
        try {
            logger.trace("Trying to enter Address");
            Address.sendKeys(add);
            logger.trace("Entered Address");
        }catch (Exception e)
        {
            logger.error("Failed to enter Address");
        }
    }
    public void setAddress2(String add2)
    {
        try
        {
            logger.trace("Trying to enter Address2");
            Address2.sendKeys(add2);
            logger.trace("Entered Address2");
        }catch (Exception e){
            logger.error("Failed to enter Address2");
        }
    }
    public void setAddress3(String add3)
    {
        try
        {
            logger.trace("Trying to enter Address3");
            Address3.sendKeys(add3);
            logger.trace("Entered Address3");
        }catch (Exception e){
            logger.error("Failed to enter Address3");
        }
    }
    public void setCity(String city)
    {
        try
        {
            logger.trace("Trying to enter City");
            City.sendKeys(city);
            logger.trace("Entered City");
        }catch (Exception e){
            logger.error("Failed to enter City");
        }
    }

    public void selectCountry(String countryName)
    {
        Select country = new Select(CountryDropdown);
        country.selectByVisibleText(countryName);
    }

    public void selectState(String stateName)
    {
        Select state = new Select(StateDropDown);
        state.selectByVisibleText(stateName);
    }

    public void setPostalCode(String postal)
    {
        try
        {
            logger.trace("Trying to enter Postal Code");
            postalCode.sendKeys(postal);
            logger.trace("Entered Postal Code");
        }
        catch (Exception e)
        {
            logger.error("Failed to enter Postal Code");
        }
    }
    public void setPhoneNumber(String phone)
    {
        try
        {
            logger.trace("Trying to enter Phone Number");
            PhoneNumber.sendKeys(phone);
            logger.trace("Entered Phone Number");
        }catch (Exception e)
        {
            logger.error("Failed to enter Phone Number");
        }
    }



    public void selectShippingMethod(String method)
    {
            if (method.equalsIgnoreCase("flat"))
            {
                if (!FlatRate.isSelected()) FlatRate.click();
            }else if (method.equalsIgnoreCase("table"))
            {
                if(!TableRate.isSelected()) TableRate.click();
            }
        }

    public void placeOrder()
    {
        NextButton.click();
        PlaceOrder.click();
    }





}
