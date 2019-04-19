import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ChromeDriverDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS);
        WebElement loginlinlk = driver.findElement(By.linkText("Log in"));
        loginlinlk.click();
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("minalp999@gmail.com");
        //Enter password
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("abs243");
        WebElement loginB = driver.findElement( By.xpath("ChromeDriverDemo.java:23"));
        loginB.click();
       Thread.sleep(188);
       driver.close();




    }
}
