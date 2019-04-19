import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class PracticeSelenium {



    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Mitul\\IdeaProjects\\seleniumdemo\\driver\\chromedriver.exe");
        WebDriver dvla = new ChromeDriver();
        dvla.get ( "https://demo.nopcommerce.com/ ");
        dvla.manage().window().maximize();
        dvla.manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS);

        WebElement registerlink = dvla.findElement(By.className( "ico-register "));
        registerlink.click();

        WebElement genderlink = dvla.findElement(By.id("gender-female"));
        genderlink.click();

        WebElement namelink = dvla.findElement(By.name("FirstName"));
        namelink.sendKeys("Minal");

        WebElement lastnamelink = dvla.findElement( By.name("LastName"));
        lastnamelink.sendKeys( "Patel ");

        WebElement daylink = dvla.findElement( By.name( "DateOfBirthDay"));
        daylink.sendKeys("7");

        WebElement monthlink = dvla.findElement( By.name( "DateOfBirthMonth"));
        monthlink.sendKeys("August");

        WebElement yearlink = dvla.findElement ( By.name ("DateOfBirthYear"));
        yearlink.sendKeys("1986");

        WebElement emaillink = dvla.findElement( By.id ("Email"));
        emaillink.sendKeys("xyz@hotmail.com");

        WebElement companyname = dvla.findElement( By.name("Company"));
        companyname.sendKeys(" Parthzbitz ");

        WebElement tick = dvla.findElement( By.name("Newsletter"));
        tick.click();

        WebElement password = dvla.findElement(By.name("Password"));
        password.sendKeys( "Dani1234");

        WebElement repassword = dvla.findElement(By.name("ConfirmPassword"));
        repassword.sendKeys("Dani1234");

        WebElement submit = dvla.findElement( By.id ("register-button"));
        submit.click();


    }
}
