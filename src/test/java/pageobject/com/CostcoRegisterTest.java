/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pageobject.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author nishant.koirala
 */
public class CostcoRegisterTest {
    WebDriver driver;

    public CostcoRegisterTest(WebDriver driver) {
        this.driver = driver;
    }
    
    @FindBy(id = "header_sign_in")
    private WebElement signin;

    @FindBy(id = "createAccount")
    private WebElement createaccount;

    @FindBy(id = "email")
    private WebElement email;
    
    @FindBy(id = "newPassword")
    private WebElement newpassword;

    @FindBy(id = "reenterPassword")
    private WebElement reenterpassword;

    @FindBy(id = "membershipNumber")
    private WebElement membership;
    
    public void Registers(String Email, String NewPassword, String ReenterPassword, String Membership)
            throws Exception {
        try {
            driver.get("https://www.costco.com/");
            signin.click();
            createaccount.click();
            email.click();
            email.sendKeys(Email);
            newpassword.click();
            newpassword.sendKeys(NewPassword);
            reenterpassword.click();
            reenterpassword.sendKeys(ReenterPassword);
            membership.click();
            membership.sendKeys(Membership);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
    
}
