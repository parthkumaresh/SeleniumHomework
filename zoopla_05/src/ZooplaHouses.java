import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ZooplaHouses {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Mitul\\IdeaProjects\\zoopla_05\\src\\Driver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.zoopla.co.uk/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();

        WebElement forSale = driver.findElement(By.id("search-tabs-for-sale"));
        forSale.click();

        WebElement location = driver.findElement(By.className("search-input-location-placeholder-1"));
        location.sendKeys("Pinner");

        WebElement search = driver.findElement(By.id("search-submit"));
        search.click();

        WebElement  price = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div[2]/ul/li[1]/div/div[2]/a"));
        price.click();
    }
}
