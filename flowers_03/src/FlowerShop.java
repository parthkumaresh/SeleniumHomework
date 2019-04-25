import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FlowerShop {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Mitul\\IdeaProjects\\website_5\\src\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bunches.co.uk");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement flowers = driver.findElement(By.xpath("//div[@class='bn-navigation__item-contents']//a[contains(text(),'Flowers')]"));
        flowers.click();

        WebElement flowerType = driver.findElement(By.className("filter-top-level"));
        flowerType.click();

        WebElement germini = driver.findElement(By.xpath("//div[@class='col-12 col-lg-2 hidden-md-down filter-list']//p[contains(text(),'Germini')]"));
        germini.click();

        WebElement purple = driver.findElement(By.xpath("//a[contains(text(),'12 Classic Carnations')]"));
        purple.click();

        WebElement radio = driver.findElement(By.className("product_variant"));
        radio.click();

        WebElement conti =driver.findElement(By.xpath("//button[@class='continue bn-button--lg bn-button bn-button--primary']"));
        conti.click();
    }
}
