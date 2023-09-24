/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pageobject.com;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/**
 *
 * @author nishant.koirala
 */
public class CostcoVerifyTitle {
    
    WebDriver driver;

    public CostcoVerifyTitle(WebDriver driver) {
        this.driver = driver;
    }
    
    public void Verify ()
            throws Exception {
        try {
            
            String expectedTitle = "Welcome to Costco Wholesale";
            String actualTitle = driver.getTitle();
            Assert.assertEquals(actualTitle, expectedTitle);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
    
}
