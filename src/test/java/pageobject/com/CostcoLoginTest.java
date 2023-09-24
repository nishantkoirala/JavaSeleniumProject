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
public class CostcoLoginTest {
    WebDriver driver;

    public CostcoLoginTest(WebDriver driver) {
        this.driver = driver;
    }
    
    @FindBy(id = "header_sign_in")
    private WebElement signin;

    @FindBy(id = "signInName")
    private WebElement username;
    
    @FindBy(id = "password")
    private WebElement password;
    
    public void loginToCostco(String Username, String Password)
            throws Exception {
        try {
            driver.get("https://www.costco.com/");
            signin.click();
            username.sendKeys(Username);
            password.sendKeys(Password);
            
            //   LoginPage login = new LoginPage(driver);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
    
    
}
