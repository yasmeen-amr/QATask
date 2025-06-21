package Tests;

import org.testng.annotations.Test;
import Pages.checkoutProcess;

public class checkoutProcessTest extends BaseTest
{
    @Test
    public void checkoutProcessTest() throws  InterruptedException
    {
        checkoutProcess cp = new checkoutProcess(driver);
        cp.chooseProduct();
        Thread.sleep(3000);
        cp.goToCart();
        Thread.sleep(3000);
        cp.goToCheckout();
        Thread.sleep(3000);
        cp.setEmail("ali@example.com");
        cp.setFirstName("Ali");
        cp.setLastName("Ahmed");
        cp.setCompany("X");
        cp.setAddress("Cairo");
        cp.setAddress2("Cairo");
        cp.setAddress3("Cairo");
        cp.setCity("Cairo");
        cp.selectCountry("United States");
        cp.selectState("California");
        cp.setPostalCode("12345");
        cp.setPhoneNumber("1234567890");
        cp.selectShippingMethod("flat");
        cp.placeOrder();



    }
}
