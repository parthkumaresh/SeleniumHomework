import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Templates {

    public static void main(String[] args) {
        System.setProperty("webdriver.Chrome.driver","C:\\Users\\Mitul\\IdeaProjects\\nopTemplate_07\\src\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.nop-templates.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement aboutus = driver.findElement(By.xpath("//span[@class='menu-link with-sublist about plus-button close']"));
        aboutus.click();

        WebElement contact = driver.findElement(By.xpath("//div[@class='sublist-wrap active']//a[@class='sl-link contact-us'][contains(text(),'Contact us')]"));
        contact.click();

        WebElement name = driver.findElement(By.id("FullName"));
        name.sendKeys("Minal");

        WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("xyz123@gmail.com");

        WebElement enquiry = driver.findElement(By.id("Enquiry"));
        enquiry.sendKeys("hello");

        WebElement robot = driver.findElement(By.className("recaptcha-checkbox-checkmark"));
        robot.click();

        WebElement submit = driver.findElement(By.xpath("//input[@name='send-email']"));
        submit.click();

        driver.close();

    }
}