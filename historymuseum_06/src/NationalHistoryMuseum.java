import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class NationalHistoryMuseum {
    public static void main(String[] args) {
        System.setProperty("webdriver.Chrome.driver","C:\\Users\\Mitul\\IdeaProjects\\historymuseum_06\\src\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.nhm.ac.uk/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement visit = driver.findElement(By.xpath("//a[@class='global-header--nav-list__link'][contains(text(),'Visit')]"));
        visit.click();

        WebElement name =  driver.findElement(By.className("item-input"));
        name.sendKeys("Minal");

        WebElement surname = driver.findElement(By.className("lastname"));
        surname.sendKeys("Patel");
    }
}
