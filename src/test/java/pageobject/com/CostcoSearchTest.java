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
public class CostcoSearchTest {
    
    WebDriver driver;

    public CostcoSearchTest(WebDriver driver) {
        this.driver = driver;
    }
    
    @FindBy(xpath = "//*[@id=\\\"search-field\\\"]")
    private WebElement search;

    @FindBy(xpath = "//*[@id=\\\"search-field\\\"]")
    private WebElement type ;
    
    @FindBy(xpath = "//*[@id=\\\"formcatsearch\\\"]/div[2]/button/i")
    private WebElement click;
    
    @FindBy(id = "productTile_4000102394")
    private WebElement product;
    
    @FindBy(xpath = "//*[@id=\\\"plusQty\\\"]/em")
    private WebElement plus;

    @FindBy(xpath = "//*[@id=\\\"minusQty\\\"]/em")
    private WebElement minus;
    
    @FindBy(id = "add-to-cart-btn")
    private WebElement addcart;
    
   

    public void Search( String type1) throws Exception {
        try {
            driver.get("https://www.costco.com/");
            search.click();
            type.sendKeys(type1);
            click.click();
            product.click();
            plus.click();
            plus.click();
            minus.click();
            addcart.click();
            driver.get("https://www.costco.com/");
            
            
        }
        catch(Exception ex) {
            ex.printStackTrace();
        
    }
    }
    
    
}
