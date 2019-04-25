import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class marsEarthQuake {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Mitul\\IdeaProjects\\nasalive_08\\src\\Driver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.nasa.gov/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);



        WebElement live = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/section/section/div[2]/div/div[2]/div/div[1]/a[1]/div"));
        live.click();


        WebElement play = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div"));
        play.click();


        WebElement human = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/nav/div[3]/ul/li[1]/ul/li[1]/a"));
        human.click();

        driver.close();
    }
}
