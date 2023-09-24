/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pageobject.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author nishant.koirala
 */
public class CostcoHoverTest {
    WebDriver driver;

    public CostcoHoverTest(WebDriver driver) {
        this.driver = driver;
    }
    
    @FindBy(xpath = "//*[@id=\\\"Home_Ancillary_2\\\"]")
    private WebElement hover1;

    @FindBy(linkText = "Appliances")
    private WebElement linktext1 ;
    
    @FindBy(xpath = "//*[@id=\\\"Home_Ancillary_4\\\"]")
    private WebElement hover2;

    @FindBy(linkText = "Shop Optical")
    private WebElement linktext2 ;
    
    public void Hover() throws Exception {
        try{
            WebElement elem1 = hover1;
            Actions act = new Actions(driver);
            Action a1 = act.moveToElement(elem1).build();
            a1.perform();
            linktext1.click();
            WebElement elem2 = hover2;
            Actions act1 = new Actions(driver);
            Action a2 = act1.moveToElement(elem2).build();
            a2.perform();
            linktext2.click();
            }
        catch (Exception ex){
            ex.printStackTrace();
            
        }
    }
    
}
