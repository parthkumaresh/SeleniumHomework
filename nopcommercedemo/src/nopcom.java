import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class nopcom {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Mitul\\IdeaProjects\\seleniumdemo\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get ( "https://demo.nopcommerce.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS);

        WebElement com = driver.findElement(By.xpath("//ul[@class='top-menu']//a[contains(text(),'Computers')]"));
        com.click();
        Thread.sleep(10000);


        WebElement desktop = driver.findElement(By.xpath("//li[@class='inactive']//a[contains(text(),'Desktops')]"));
        desktop.click();
        Thread.sleep(10000);

        WebElement chart  = driver.findElement(By.xpath("//div[@class='item-grid']//div[1]//div[1]//div[2]//div[3]//div[2]//input[1]"));
        chart.click();

        WebElement basket = driver.findElement(By.id("add-to-cart-button-1"));
        basket.click();


    }
}
