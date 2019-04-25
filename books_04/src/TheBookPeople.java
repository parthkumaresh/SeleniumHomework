import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TheBookPeople {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Mitul\\IdeaProjects\\books_04\\src\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.thebookpeople.co.uk");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement childrenBooks = driver.findElement(By.xpath("//a[@class='dropdown-toggle departmentLink departmentLink_CC']"));
        childrenBooks.click();

        WebElement babies = driver.findElement(By.xpath("//ul[@class='nav nav-list']//a[contains(text(),'Babies')]"));
        babies.click();

        WebElement earlyLearner = driver.findElement(By.xpath("//div[@id='product-965914']//div[contains(@class,'buttonBox hidden-xs-cell')]//button[contains(@class,'btn btn-success btn-block add-to-basket-button')][contains(text(),'Add to basket')]"));
        earlyLearner.click();

        WebElement basket = driver.findElement(By.id("checkout-link"));
        basket.click();

        driver.close();

    }
}
