package utilities;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Nopcommerecedemo_01 {
     public WebDriver driver ;
     Utility utility;

        @Before
        public void setUp() {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mitul\\IdeaProjects\\seleniumdemo1\\src\\Driver\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://demo.nopcommerce.com/");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
            System.out.println("Page was loaded");
            utility = new Utility(driver);

        }@Test
           public void userShouldNavigateToLoginPageSuccessfully(){
           utility.clickOnElement(By.linkText("Log in"));
           WebElement text = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
           Assert.assertTrue("Welcome, Please Sign In!",text.isDisplayed());
        }@Test
           public void userShouldLoginSuccessFully() {
//            By loginLink = By.linkText("Log in");
        utility.clickOnElement(By.linkText("Log in"));
        utility.sendTextToElement(By.id("Email"), "xyz123@hotmail.com");
        utility.sendTextToElement(By.name("Password"), "Abc123");
        utility.clickOnElement(By.xpath("//input[@value='Log in']"));
        WebElement confirm = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/input"));
        Assert.assertTrue("Welcome, ToLogInPage !", confirm.isDisplayed());
        }  @Test
        public void verifyThatUserShouldNavigateToDesktopPage(){
        By computersTab = By.xpath("//ul[@class='top-menu']//a[contains(text(),'Computers')]");
        utility.mouseHoverToElement(computersTab);

        By desktopsTab = By.xpath("//ul[@class='top-menu']/li/ul/li/a[contains(text(),'Desktops')]");
        utility.mouseHoverToElementAndClick(desktopsTab);

        By deskTopsText = By.xpath("//div[@class='page-title']/h1");
        Assert.assertTrue(utility.verifyThatTextIsDisplayed(deskTopsText,"Desktops"));


//           }@Test
//            public void userEnteredOnAcoountPageSuccesfully (){
//            utility.clickOnElement(By.linkText("OnPage"));
//            WebElement pass = driver.findElement(By.xpath(""));
//            Assert.assertTrue("Page is open", pass.isDisplayed());


             }@After
             public void tearDown () {
              driver.quit();
             }
             }


//        public static void main(String[] args) throws InterruptedException {
//         System.setProperty("webdriver.chrome.driver", "driver/chromeDriver.exe");
//         WebDriver driver = new ChromeDriver();
//         driver.get("https://demo.nopcommerce.com/");
//         driver.manage().window().maximize();
//         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//          find element of longin link
//         WebElement longinLink = driver.findElement(By.linkText("Log in"));
//         longinLink.click();
//         Enter email
//         WebElement emailField = driver.findElement(By.id("Email"));
//         driver.findElement(By.id("Email")).sendKeys("kesah_2004@yahoo.com");
//          Enter password
//         WebElement poasswordField = driver.findElement(By.id("Password"));
//         driver.findElement(By.name("Password")).sendKeys("1234");
//          click on log in button
//         WebElement loginBtn = driver.findElement(By.xpath("//input[@value='Log in']"));
//         loginBtn.click();
//          driver.findElement(By.xpath("//input[@value='Log in'] ")).click();
//         Thread.sleep(5000);
//         driver.close();








////