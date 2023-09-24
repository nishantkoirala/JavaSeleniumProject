/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author nishant.koirala
 */
public class CostcoFormTest {

    private WebDriver driver;
    private String baseUrl;
    private static CostcoFormLogin costcoformlogin;

    public CostcoFormTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @BeforeClass
    public static void setUpClass() throws Exception {
        
        FileInputStream inputStream = new FileInputStream(new File("c:\\data\\contact.xlsx"));
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet contact = workbook.getSheetAt(0);
        Row r = contact.getRow(0);
        Cell c = r.getCell(1); //name
        String name = c.getStringCellValue();
        System.out.println("name=" + name);

        r = contact.getRow(1);
        c = r.getCell(1); //password
        String password = c.getStringCellValue();
        System.out.println("password=" + password);

        r = contact.getRow(2);
        c = r.getCell(1); //email
        String email = c.getStringCellValue();
        System.out.println("email=" + email);

        r = contact.getRow(3);
        c = r.getCell(1); //age
        String age = c.getNumericCellValue() + "";
        System.out.println("age=" + age);

        r = contact.getRow(4);
        c = r.getCell(1); //address
        String address = c.getStringCellValue() + "";
        System.out.println("address=" + address);

        costcoformlogin = new CostcoFormLogin(name, password, email, age, address);

    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        driver.close();
    }

    @Test
    public void testCostcoForm() throws Exception {

        driver.get("file:///C:/Users/nishant.koirala/Desktop/costco.html");
//    driver.get("http://itexps.com/simpleform.html");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("uname")));
        driver.findElement(By.id("uname")).click();
        driver.findElement(By.id("uname")).clear();
        driver.findElement(By.id("uname")).sendKeys(costcoformlogin.getUsername());
        WebDriverWait wait1 = new WebDriverWait(driver, 20);
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass")));
        driver.findElement(By.id("pass")).click();
        driver.findElement(By.id("pass")).clear();
        driver.findElement(By.id("pass")).sendKeys(costcoformlogin.getPassword());
        driver.findElement(By.id("uemail")).click();
        driver.findElement(By.id("uemail")).clear();
        driver.findElement(By.id("uemail")).sendKeys(costcoformlogin.getEmail());
        driver.findElement(By.id("age")).click();
        driver.findElement(By.id("age")).clear();
        driver.findElement(By.id("age")).sendKeys(costcoformlogin.getAge());
        driver.findElement(By.name("country")).click();
        driver.findElement(By.name("country")).clear();
        driver.findElement(By.name("country")).sendKeys("usa");
        driver.findElement(By.xpath("//label[2]/input")).click();
        driver.findElement(By.xpath("//label[3]/input")).click();
        driver.findElement(By.xpath("//tr[7]/td[2]/label[2]/input")).click();
        driver.findElement(By.id("city")).click();
        new Select(driver.findElement(By.id("city"))).selectByVisibleText("Chicago");
        driver.findElement(By.xpath("//textarea")).click();
        driver.findElement(By.xpath("//textarea")).clear();
        driver.findElement(By.xpath("//textarea")).sendKeys(costcoformlogin.getAddress());
        driver.findElement(By.xpath("//input[@value='Submit']")).click();
    }
    
   

}
