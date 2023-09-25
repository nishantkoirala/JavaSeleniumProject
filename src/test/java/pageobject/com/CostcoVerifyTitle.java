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
            
            
            driver.getTitle();
            Assert.assertEquals(driver.getTitle(), Welcome to Costco Wholesale);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
    
}
