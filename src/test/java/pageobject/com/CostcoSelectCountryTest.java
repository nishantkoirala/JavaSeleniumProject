/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pageobject.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author nishant.koirala
 */
public class CostcoSelectCountryTest {
    WebDriver driver;

    public CostcoSelectCountryTest(WebDriver driver) {
        this.driver = driver;
    }
    
     @FindBy(xpath = ".//*[@id=\\\"country-select\\\"]")
    private WebElement select;

    @FindBy(xpath = ".//*[@id=\\\"country-select-popover-container\\\"]/ul/li[2]/a")
    private WebElement selectcountry;
    
    public void SelectCountry() throws Exception {
        try {
            driver.get("https://www.costco.com/");
            WebDriverWait wait0 = new WebDriverWait(driver, 10);
            wait0.until(ExpectedConditions.visibilityOfElementLocated(By.id("productTile_4000102394")));
             WebDriverWait wait1 = new WebDriverWait(driver, 10);
             wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\\\"country-select\\\"]"))).click();
            
            selectcountry.click();
            
        }
        catch (Exception ex) {
            ex.printStackTrace();
            
        }
    }
    
}
