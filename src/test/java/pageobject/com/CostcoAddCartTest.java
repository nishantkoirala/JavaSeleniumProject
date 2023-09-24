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
public class CostcoAddCartTest {
    
    WebDriver driver;

    public CostcoAddCartTest(WebDriver driver) {
        this.driver = driver;
    }
    
    @FindBy(xpath = "//*[@id=\\\"search-field\\\"]")
    private WebElement search;

    @FindBy(xpath = "//*[@id=\\\"search-field\\\"]")
    private WebElement type ;
    
    @FindBy(xpath = "//*[@id=\\\"formcatsearch\\\"]/div[2]/button/i")
    private WebElement click;
    
    @FindBy(id = "productTile_4000175359")
    private WebElement product;

    @FindBy(id = "add-to-cart-btn")
    private WebElement addcart ;
    
    public void AddCart( String type1 ) throws Exception {
        try {
            search.click();
            type.sendKeys(type1);
            click.click();
            product.click();
            addcart.click();
            driver.get("https://www.costco.com/");
            
        }
        catch(Exception ex) {
            ex.printStackTrace();
             }
    }
    
    
    
}
