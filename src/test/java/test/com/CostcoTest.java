/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobject.com.CostcoAddCartTest;
import pageobject.com.CostcoCheckoutTest;
import pageobject.com.CostcoHoverTest;
import pageobject.com.CostcoLoginTest;
import pageobject.com.CostcoRegisterTest;
import pageobject.com.CostcoSearchTest;
import pageobject.com.CostcoSelectCountryTest;
import pageobject.com.CostcoVerifyTitle;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 *
 * @author nishant.koirala
 */
public class CostcoTest {

    private WebDriver driver;
    private String baseUrl;

    public CostcoTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @BeforeClass
    public static void setUpClass() throws Exception {

    }

    @AfterClass
    public static void tearDownClass() throws Exception {

    }

    @BeforeTest
    public void starting() {
        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions(); 
        options.addArguments("--headless"); 
        options.addArguments("--disable-gpu"); 
        options.addArguments("--window-size=1400,800");
        WebDriver driver = new ChromeDriver(options); 
        
         }

    @AfterTest
    public void ending() {
        driver.quit();
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        

    }

    @AfterMethod
    public void tearDownMethod() throws Exception {

    }
    
    
//      @Test(priority = 0)
//    public void verifyHomepageTitle() throws Exception {
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.get("https://www.costco.com/");
//            String expectedTitle = "Welcome to Costco Wholesale";
//            String actualTitle = driver.getTitle();
//            Assert.assertEquals(actualTitle, expectedTitle);
//            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
//            FileUtils.copyFile(scrFile, new File("./verify.png"));
//    }
//       // Page Object Model
//     @Test(priority = 1)
//     public void Register() throws Exception {
//         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//         CostcoRegisterTest register = PageFactory.initElements(driver, CostcoRegisterTest.class);
//         register.Registers("mike@abc.com","Mike123*","Mike123*","123");
//         File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
//         FileUtils.copyFile(scrFile, new File("./register.png"));
//         
//     }
//       // Page Object Model
//     @Test(priority = 2)
//     public void Login() throws Exception {
//         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//         CostcoLoginTest login = PageFactory.initElements(driver, CostcoLoginTest.class);
//         login.loginToCostco("mike@abc.com","Mike123*");
//         File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
//         FileUtils.copyFile(scrFile, new File("./login.png"));
//         
//     }
//     
//     
//        @Test(priority = 3)
//        public void Dropdown() throws Exception {
//     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.get("https://www.costco.com/");
//        driver.findElement(By.xpath("//*[@id=\"country-select\"]")).click();
//        driver.findElement(By.xpath("//*[@id=\"country-select-popover-container\"]/ul/li[1]/a")).click();
//        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
//        FileUtils.copyFile(scrFile, new File("./select.png"));
//
//    }
//
//    @Test(priority = 4)
//    public void hover_Items() throws Exception {
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//        WebElement elem1 = driver.findElement(By.xpath("//*[@id=\"Home_Ancillary_2\"]"));
//        Actions act = new Actions(driver);
//        Action a1 = act.moveToElement(elem1).build();
//        a1.perform();
//        WebDriverWait wait = new WebDriverWait(driver, 3);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Appliances")));
//        WebElement elem2 = driver.findElement(By.linkText("Appliances"));
//        elem2.click();
//        driver.findElement(By.xpath("//*[@id=\"productTile_100682823\"]/div[2]/div[2]/span/a")).click();
//        WebElement elem3 = driver.findElement(By.xpath("//*[@id=\"Home_Ancillary_4\"]"));
//        Actions act1 = new Actions(driver);
//        Action a2 = act1.moveToElement(elem3).build();
//        a2.perform();
//        WebDriverWait wait1 = new WebDriverWait(driver, 3);
//        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Shop Optical")));
//        WebElement elem4 = driver.findElement(By.linkText("Shop Optical"));
//        elem4.click();
//        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
//        FileUtils.copyFile(scrFile, new File("./hover.png"));
//    }
//    
//    @Test(priority = 5)
//    public void Search_Items() throws Exception {
//
////        driver.get("https://www.costco.com/");
////        Searching Basketball
//        driver.findElement(By.xpath("//*[@id=\"search-field\"]")).click();
//        driver.findElement(By.xpath("//*[@id=\"search-field\"]")).sendKeys("Basketball");
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@id=\"formcatsearch\"]/div[2]/button/i")).click();
//        WebDriverWait wait02 = new WebDriverWait(driver, 10);
//        wait02.until(ExpectedConditions.visibilityOfElementLocated(By.id("productTile_4000102394")));
//        driver.findElement(By.id("productTile_4000102394")).click();
//        driver.findElement(By.xpath("//*[@id=\"plusQty\"]/em")).click();
//        Thread.sleep(0500);
//        driver.findElement(By.xpath("//*[@id=\"plusQty\"]/em")).click();
//        Thread.sleep(0500);
//        driver.findElement(By.xpath("//*[@id=\"minusQty\"]/em")).click();
//        WebDriverWait wait5 = new WebDriverWait(driver, 10);
//        wait5.until(ExpectedConditions.elementToBeClickable(By.id("add-to-cart-btn")));
//        driver.findElement(By.id("add-to-cart-btn")).click();
//        WebDriverWait wait0 = new WebDriverWait(driver, 10);
//        wait0.until(ExpectedConditions.visibilityOfElementLocated(By.id("costcoModal")));
//        driver.get("https://www.costco.com/");
//        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
//        FileUtils.copyFile(scrFile, new File("./search.png"));
//
////        WebDriverWait wait6 = new WebDriverWait(driver, 10);
////        wait6.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"costcoModalText\"]/div[2]/div[1]/button")));
////        driver.findElement(By.xpath("//*[@id=\"costcoModalText\"]/div[2]/div[1]/button")).click();
////        Searching Baseball
//    }
//
//    @Test(priority = 6)
//    public void Add_Cart_Items() throws Exception {
//        driver.findElement(By.xpath("//*[@id=\"search-field\"]")).click();
//        driver.findElement(By.xpath("//*[@id=\"search-field\"]")).sendKeys("Baseball");
//        Thread.sleep(0500);
//        driver.findElement(By.xpath("//*[@id=\"formcatsearch\"]/div[2]/button/i")).click();
//        WebDriverWait wait02 = new WebDriverWait(driver, 10);
//        wait02.until(ExpectedConditions.visibilityOfElementLocated(By.id("productTile_4000175359")));
//        driver.findElement(By.id("productTile_4000175359")).click();
//        WebDriverWait wait7 = new WebDriverWait(driver, 10);
//        wait7.until(ExpectedConditions.elementToBeClickable(By.id("add-to-cart-btn")));
//        driver.findElement(By.id("add-to-cart-btn")).click();
//        WebDriverWait wait00 = new WebDriverWait(driver, 10);
//        wait00.until(ExpectedConditions.visibilityOfElementLocated(By.id("costcoModal")));
//        driver.get("https://www.costco.com/");
//        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
//        FileUtils.copyFile(scrFile, new File("./addcart.png"));
////        WebDriverWait wait8 = new WebDriverWait(driver, 10);
////        wait8.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"costcoModalText\"]/div[2]/div[1]/button")));
////        driver.findElement(By.xpath("//*[@id=\"costcoModalText\"]/div[2]/div[1]/button")).click();
//
//    }
//
//    @Test(priority = 7)
//    public void Checkout_Items() throws Exception {
//
////        Checkout Items
//        driver.findElement(By.id("cart-d")).click();
//        WebDriverWait wait9 = new WebDriverWait(driver, 5);
//        wait9.until(ExpectedConditions.elementToBeClickable(By.id("shopCartCheckoutSubmitButton"))).click();
//        driver.findElement(By.id("shopCartCheckoutSubmitButton"));
//        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
//        FileUtils.copyFile(scrFile, new File("./checkout.png"));
//
//       
//    }
     
    
    
       // Page Object Model
    
//    @Test(priority = 0)
//    public void verifyHomepageTitle() throws Exception {
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.get("https://www.costco.com/");
//        CostcoVerifyTitle verify = PageFactory.initElements(driver, CostcoVerifyTitle.class);
//         verify.Verify();
//         File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
//         FileUtils.copyFile(scrFile, new File("./verify.png"));
//
//    }

     
   @Test(priority = 0)
    public void verifyHomepageTitle() throws Exception {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.costco.com/");
        CostcoVerifyTitle verify = PageFactory.initElements(driver, CostcoVerifyTitle.class);
         verify.Verify();
         File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
         FileUtils.copyFile(scrFile, new File("./verify.png"));

    }
    
     @Test(priority = 1)
     public void Register() throws Exception {
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         CostcoRegisterTest register = PageFactory.initElements(driver, CostcoRegisterTest.class);
         register.Registers("mike@abc.com","Mike123*","Mike123*","123");
          File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
          FileUtils.copyFile(scrFile, new File("./register.png"));
         
     }
     
     @Test(priority = 2)
     public void Login() throws Exception {
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         CostcoLoginTest login = PageFactory.initElements(driver, CostcoLoginTest.class);
         login.loginToCostco("mike@abc.com","Mike123*");
          File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
         FileUtils.copyFile(scrFile, new File("./login.png"));
         
     }
     
     @Test(priority = 3)
     public void Select_Dropdown_Country() throws Exception {
         
         CostcoSelectCountryTest select = PageFactory.initElements(driver, CostcoSelectCountryTest.class);
         select.SelectCountry();
          File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
         FileUtils.copyFile(scrFile, new File("./select.png"));
         
         
     }
     
     @Test(priority = 4)
     public void Hover_Items() throws Exception {
          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
          CostcoHoverTest hover = PageFactory.initElements(driver, CostcoHoverTest.class);
          hover.Hover();
          Thread.sleep(1000);
          CostcoHoverTest hover1 = PageFactory.initElements(driver, CostcoHoverTest.class);
          hover1.Hover();
           File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
         FileUtils.copyFile(scrFile, new File("./hover.png"));
         
     }
     
     @Test(priority = 5)
     public void Search_Items() throws Exception {
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         CostcoSearchTest search = PageFactory.initElements(driver, CostcoSearchTest.class);
         search.Search("Basketball");
          File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
         FileUtils.copyFile(scrFile, new File("./search.png"));
         
         
     }
     
     @Test(priority = 6)
     public void Add_Cart_Items() throws Exception {
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         CostcoAddCartTest addcart = PageFactory.initElements(driver, CostcoAddCartTest.class);
         addcart.AddCart("Baseball");
          File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
         FileUtils.copyFile(scrFile, new File("./addcart.png"));
         
         
     }
     
     @Test(priority = 7)
     public void Checkout_Items() throws Exception {
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         CostcoCheckoutTest checkout = PageFactory.initElements(driver, CostcoCheckoutTest.class);
         checkout.Checkout();
          File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
         FileUtils.copyFile(scrFile, new File("./checkout.png"));
         
         
     }
     
     
     
     
     
     
       // Regular Model
//      @Test(priority = 0)
//    public void verifyHomepageTitle() throws Exception {
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.get("https://www.costco.com/");
//            String expectedTitle = "Welcome to Costco Wholesale";
//            String actualTitle = driver.getTitle();
//            Assert.assertEquals(actualTitle, expectedTitle);
//            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
//            FileUtils.copyFile(scrFile, new File("./image.png"));
//    }
//    
//       @Test(priority = 1)
//       public void Register() throws Exception {
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.findElement(By.id("header_sign_in")).click();
//        driver.findElement(By.id("createAccount")).click();
//        driver.findElement(By.id("email")).click();
//        driver.findElement(By.id("email")).sendKeys("mike@abc.com");
//        Thread.sleep(0500);
//        driver.findElement(By.id("newPassword")).click();
//        driver.findElement(By.id("newPassword")).sendKeys("Mike123*");
//        Thread.sleep(0500);
//        driver.findElement(By.id("reenterPassword")).click();
//        driver.findElement(By.id("reenterPassword")).sendKeys("Mike123*");
//        Thread.sleep(0500);
//        driver.findElement(By.id("membershipNumber")).click();
//        driver.findElement(By.id("membershipNumber")).sendKeys("123");
//
//    }
//       
//       @Test(priority = 2)
//       public void Login() throws Exception {
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.get("https://www.costco.com/");
//        driver.findElement(By.id("header_sign_in")).click();
//        driver.findElement(By.id("signInName")).click();
//        driver.findElement(By.id("signInName")).sendKeys("mike@abc.com");
//        Thread.sleep(0500);
//        driver.findElement(By.id("password")).click();
//        driver.findElement(By.id("password")).sendKeys("mike123");
//
//    }
//       
//        @Test(priority = 3)
//        public void Dropdown() throws Exception {
//     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.get("https://www.costco.com/");
//        driver.findElement(By.xpath("//*[@id=\"country-select\"]")).click();
//        driver.findElement(By.xpath("//*[@id=\"country-select-popover-container\"]/ul/li[1]/a")).click();
//
//    }
//
//    @Test(priority = 4)
//    public void hover_Items() throws Exception {
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//        WebElement elem1 = driver.findElement(By.xpath("//*[@id=\"Home_Ancillary_2\"]"));
//        Actions act = new Actions(driver);
//        Action a1 = act.moveToElement(elem1).build();
//        a1.perform();
//        WebDriverWait wait = new WebDriverWait(driver, 3);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Appliances")));
//        WebElement elem2 = driver.findElement(By.linkText("Appliances"));
//        elem2.click();
//        driver.findElement(By.xpath("//*[@id=\"productTile_100682823\"]/div[2]/div[2]/span/a")).click();
//        WebElement elem3 = driver.findElement(By.xpath("//*[@id=\"Home_Ancillary_4\"]"));
//        Actions act1 = new Actions(driver);
//        Action a2 = act1.moveToElement(elem3).build();
//        a2.perform();
//        WebDriverWait wait1 = new WebDriverWait(driver, 3);
//        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Shop Optical")));
//        WebElement elem4 = driver.findElement(By.linkText("Shop Optical"));
//        elem4.click();
//    }
//    @Test(priority = 5)
//    public void Search_Items() throws Exception {
//
//        driver.get("https://www.costco.com/");
////        Searching Basketball
//        driver.findElement(By.xpath("//*[@id=\"search-field\"]")).click();
//        driver.findElement(By.xpath("//*[@id=\"search-field\"]")).sendKeys("Basketball");
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@id=\"formcatsearch\"]/div[2]/button/i")).click();
//        WebDriverWait wait02 = new WebDriverWait(driver, 10);
//        wait02.until(ExpectedConditions.visibilityOfElementLocated(By.id("productTile_4000102394")));
//        driver.findElement(By.id("productTile_4000102394")).click();
//        driver.findElement(By.xpath("//*[@id=\"plusQty\"]/em")).click();
//        Thread.sleep(0500);
//        driver.findElement(By.xpath("//*[@id=\"plusQty\"]/em")).click();
//        Thread.sleep(0500);
//        driver.findElement(By.xpath("//*[@id=\"minusQty\"]/em")).click();
//        WebDriverWait wait5 = new WebDriverWait(driver, 10);
//        wait5.until(ExpectedConditions.elementToBeClickable(By.id("add-to-cart-btn")));
//        driver.findElement(By.id("add-to-cart-btn")).click();
//        WebDriverWait wait0 = new WebDriverWait(driver, 10);
//        wait0.until(ExpectedConditions.visibilityOfElementLocated(By.id("costcoModal")));
//        Thread.sleep(1000);
//        driver.get("https://www.costco.com/");
//
////        WebDriverWait wait6 = new WebDriverWait(driver, 10);
////        wait6.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"costcoModalText\"]/div[2]/div[1]/button")));
////        driver.findElement(By.xpath("//*[@id=\"costcoModalText\"]/div[2]/div[1]/button")).click();
////        Searching Baseball
//    }
//
//    @Test(priority = 6)
//    public void Add_Cart_Items() throws Exception {
//        driver.findElement(By.xpath("//*[@id=\"search-field\"]")).click();
//        driver.findElement(By.xpath("//*[@id=\"search-field\"]")).sendKeys("Baseball");
//        Thread.sleep(0500);
//        driver.findElement(By.xpath("//*[@id=\"formcatsearch\"]/div[2]/button/i")).click();
//        WebDriverWait wait02 = new WebDriverWait(driver, 10);
//        wait02.until(ExpectedConditions.visibilityOfElementLocated(By.id("productTile_4000175359")));
//        driver.findElement(By.id("productTile_4000175359")).click();
//        WebDriverWait wait7 = new WebDriverWait(driver, 10);
//        wait7.until(ExpectedConditions.elementToBeClickable(By.id("add-to-cart-btn")));
//        driver.findElement(By.id("add-to-cart-btn")).click();
//        WebDriverWait wait00 = new WebDriverWait(driver, 10);
//        wait00.until(ExpectedConditions.visibilityOfElementLocated(By.id("costcoModal")));
//        driver.get("https://www.costco.com/");
//        Thread.sleep(1000);
////        WebDriverWait wait8 = new WebDriverWait(driver, 10);
////        wait8.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"costcoModalText\"]/div[2]/div[1]/button")));
////        driver.findElement(By.xpath("//*[@id=\"costcoModalText\"]/div[2]/div[1]/button")).click();
//
//    }
//
//    @Test(priority = 7)
//    public void If_Remove_Cart_Items() throws Exception {
//        driver.findElement(By.id("cart-d")).click();
//        WebDriverWait wait01 = new WebDriverWait(driver, 5);
//        wait01.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"remove-serial_2114050290\"]")));
//        WebDriverWait wait8 = new WebDriverWait(driver, 15);
//        wait8.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"remove-serial_2114050290\"]"))).click();
//        
//
//    }
//
//    @Test(priority = 8)
//    public void Checkout_Items() throws Exception {
//
////        Checkout Items
//        WebDriverWait wait9 = new WebDriverWait(driver, 5);
//        wait9.until(ExpectedConditions.elementToBeClickable(By.id("shopCartCheckoutSubmitButton"))).click();
//        driver.findElement(By.id("shopCartCheckoutSubmitButton"));
//
//        Thread.sleep(1000);
//    }
     
}
