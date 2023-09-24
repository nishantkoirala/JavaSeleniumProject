/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pageobject.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author nishant.koirala
 */
public class CostcoCheckoutTest {
    
    WebDriver driver;

    public CostcoCheckoutTest(WebDriver driver) {
        this.driver = driver;
    }
    
    @FindBy(id = "shopCartCheckoutSubmitButton")
    private WebElement checkout;
    
    public void Checkout() throws Exception {
        try {
            checkout.click();
            
        }
        catch(Exception ex) {
            ex.printStackTrace();
            
        }
    }
}
