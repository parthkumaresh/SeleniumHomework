package seleniumdemo;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.Utility;

import java.util.concurrent.TimeUnit;

public class Nopcommerecedemo {
     private WebDriver driver ;
     Utility utility;

        @Before
        public void setUp(){
        System.setProperty("webdriver.Chrome.driver","C:\\\\Users\\\\Mitul\\\\IdeaProjects\\\\seleniumdemo1\\\\src\\\\Driver\\\\chromedriver.exe\"");
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println("Page was loaded");
        utility = new Utility(driver);
        }

           @Test
           public void userShouldNavigateToLoginPageSuccessfully(){
           utility.clickOnElement(By.linkText("Log in"));
           WebElement text = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
           Assert.assertTrue("Welcome, Please Sign In!",text.isDisplayed());}

           @Test
           public void userShouldLoginSuccessFully() {
            By loginLink = By.linkText("Log in");
            utility.clickOnElement(loginLink);
            utility.sendTextToElement(By.id("Email"), "xyz123@hotmail.com");
            utility.sendTextToElement(By.name("Password"), "Abc123");
            utility.clickOnElement(By.xpath("//input[@value='Log in']"));
           }

             @After
             public void tearDown () {
             driver.quit();
             }
            }


       // public static void main(String[] args) throws InterruptedException {
       //  System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        // WebDriver driver = new ChromeDriver();
         //driver.get("https://demo.nopcommerce.com/");
         //driver.manage().window().maximize();
         //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         // find element of longin link
       //  WebElement longinLink = driver.findElement(By.linkText("Log in"));
       //  longinLink.click();
         //Enter email
      //   WebElement emailField = driver.findElement(By.id("Email"));
      //   driver.findElement(By.id("Email")).sendKeys("kesah_2004@yahoo.com");
         // Enter password
     //    WebElement poasswordField = driver.findElement(By.id("Password"));
    //     driver.findElement(By.name("Password")).sendKeys("1234");
         // click on log in button
    //     WebElement loginBtn = driver.findElement(By.xpath("//input[@value='Log in']"));
    //     loginBtn.click();
         // driver.findElement(By.xpath("//input[@value='Log in'] ")).click();
    //     Thread.sleep(5000);
    //     driver.close();








