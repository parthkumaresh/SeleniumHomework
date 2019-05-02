package utilities;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Registration_Nopcpmmerence_01 {
       public WebDriver driver;
       private Utility utility;
         @Before
         public void setUp (){
         System.setProperty("webdriver.chrome.driver","C:\\Users\\Mitul\\IdeaProjects\\seleniumdemo1\\src\\Driver\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.get("https://demo.nopcommerce.com/");
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
         utility = new Utility(driver);





        }@Test
         public void registerTheEntryForm() {

        utility.clickOnElement(By.linkText("Register"));

//       String pageTitle = driver.getTitle();
//       Assert.assertTrue(pageTitle.contains("Register"));


        utility.clickOnElement(By.id("gender-male"));
        utility.sendTextToElement(By.name("FirstName"), "Minal");
        utility.sendTextToElement(By.name("LastName"), "Patel");
        utility.selectByIndexFromDropDownMenu(By.name("DateOfBirthDay"), 7);
        By dob = By.name("DateOfBirthMonth");
        utility.selectByVisibleTextFromDropDownMenu(dob, "January");
        utility.selectByValueFromDropDownMenu(By.name("DateOfBirthYear"), "1986");
        utility.sendTextToElement(By.id("Email"), "mahi1234" + utility.generateRandomNumber()+"@gmail.Com");
        utility.sendTextToElement(By.id("Password"), "1234567");
        utility.sendTextToElement(By.id("ConfirmPassword"), "1234567");
        By check = By.xpath("//*[@id=\"register-button\"]");
        utility.waitUntilVisibilityOfElementLocated ( check, 30);
        utility.waitUntilElementToBeClickable(check,30);
        utility.clickOnElement(By.id("register-button"));



        String expectedMessage = "Your registration completed";
        String actualMessage = driver.findElement(By.xpath("//div[@class='result']")).getText();
        Assert.assertEquals("Registration Message not displayed", expectedMessage, actualMessage);


       }@After
       public void teardown(){
         driver.quit();
    }


}
//   public static void main(String[] args) throws InterruptedException {
//       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mitul\\IdeaProjects\\seleniumdemo1\\src\\Driver\\chromedriver.exe");
//       WebDriver driver = new ChromeDriver();
//       driver.get("https://demo.nopcommerce.com/");
//       driver.manage().window().maximize();
//       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//       WebElement registerLink = driver.findElement(By.className("ico-register"));
//       registerLink.click();
//       System.out.println("step1");
//
//       WebElement register = driver.findElement(By.className("ico-register"));
//       register.click();
//       System.out.println("step2");
//
//       WebElement femaleGender = driver.findElement(By.id("gender-female"));
//       femaleGender.click();
//       System.out.println("step3");
//
//       WebElement firstName = ((ChromeDriver) driver).findElementById("FirstName");
//       firstName.sendKeys("Firstname");
//       System.out.println("step4");
//
//       WebElement lastName = driver.findElement(By.id("LastName"));
//       lastName.sendKeys("Lastname");
//       System.out.println("step5");
//
//       WebElement dateDay = driver.findElement(By.name("DateOfBirthDay"));
//       dateDay.sendKeys("18");
//       System.out.println("step6");
//
//       WebElement dateMonth = driver.findElement(By.name("DateOfBirthMonth"));
//       dateMonth.sendKeys("February");
//       Thread.sleep(1000);
//       System.out.println("step7");
//
//       WebElement dateYear = driver.findElement(By.name("DateOfBirthYear"));
//       dateYear.sendKeys("1983");
//
//       WebElement email = driver.findElement(By.id("Email"));
//       email.sendKeys("xyz@xyz.com");
//
//       WebElement newsLetter = driver.findElement(By.id("Newsletter"));
//       newsLetter.click();
//
//       WebElement password = driver.findElement(By.id("Password"));
//       password.sendKeys("abcdefg");
//
//       WebElement passwordConfirm = driver.findElement(By.id("ConfirmPassword"));
//       passwordConfirm.sendKeys("abcdefg");
//       Thread.sleep(1000);
//
//       WebElement registerBtn = driver.findElement(By.id("register-button"));
//       registerBtn.click();
//
//       Thread.sleep(5000);
//       driver.close();

