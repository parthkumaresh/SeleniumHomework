import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class BabyNursery {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Mitul\\IdeaProjects\\website_2\\src\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.argos.co.uk/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector(".privacy-prompt-footer > a:nth-child(1)")).click();

        WebElement tab = driver.findElement (By.xpath("//a[contains(@class,'font-condensed uppercase meganav__level-1-title')][contains(text(),'Baby & Nursery')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(tab).build().perform();
        WebElement prams = driver.findElement(By.xpath("//a[contains(text(),'Baby & Nursery')]"));
        prams.click();

        Thread.sleep(70000);

//        WebElement toy = driver.findElement(By.xpath("//span[contains(text(),'Baby toys')]"));
//        toy.click();
//
//        WebElement travel = driver.findElement(By.xpath("//a[@class='sidebar__link sidebar__link--category']//span[contains(text(),'Travel')]"));
//        travel.click();
//
//         WebElement pram = driver.findElement(By.xpath("//div[@class='browse']//li[1]//a[1]"));
//         pram.click();


    }
}
