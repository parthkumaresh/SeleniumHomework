import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Computercommerce {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Mitul\\IdeaProjects\\seleniumdemo\\driver\\chromedriver.exe");
        WebDriver keyboard = new ChromeDriver();
        keyboard.get ( "https://demo.nopcommerce.com/computers");
        keyboard.manage().window().maximize();
        keyboard.manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS);

        WebElement com = keyboard.findElement(By.xpath("//ul[@class='top-menu']//a[contains(text(),'Computers')]"));
        com.click();

        WebElement desktop = keyboard.findElement(By.xpath("//li[@class='inactive']//a[contains(text(),'Desktops')]"));
        desktop.click();

        WebElement addToCart = keyboard.findElement(By.xpath("//div[contains(text(),'Build it')]"));
        addToCart.click();
        Thread.sleep(5000);

        keyboard.close();


    }
}
