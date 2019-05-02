package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Utility {
       public WebDriver driver;

       public Utility (WebDriver driver){

           this.driver = driver;
        }public void clickOnElement (By by){
        driver.findElement(by).click();
        }public void sendTextToElement (By by, String str){
        driver.findElement(by).sendKeys(str);

        }public void mouseHoverToElement (By by){
        Actions actions = new Actions (driver);
        actions.moveToElement(driver.findElement(by)).perform();

        }public void mouseHoverToElementAndClick(By by){
        Actions actions = new Actions (driver);
        actions.moveToElement(driver.findElement(by));

        }public void selectByVisibleTextFromDropDownMenu(By by,String text){
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);

        }public void selectByValueFromDropDownMenu (By by,String value){
        Select select = new Select (driver.findElement(by));
        select.selectByValue(value);

        }public void selectByIndexFromDropDownMenu (By by, int index ) {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(index);

        }public void waitUntilElementToBeClickable(By by, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(by)));


        }public void waitUntilPresenceOfElementLocated(By by, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));


        }public static int generateRandomNumber(){
        return (int)(Math.random() * 5000 + 1);


         }public void waitUntilVisibilityOfElementLocated(By by, int timeout){
         WebDriverWait wait = new WebDriverWait(driver, timeout);
         wait.until(ExpectedConditions.visibilityOfElementLocated(by));


        }public boolean verifyThatElementIsDisplayed(By by){
        WebElement element = driver.findElement(by);
        if (element.isDisplayed()){
            return true;
        }else {
            return false;
        }
        }


    public boolean verifyThatTextIsDisplayed(By by, String text){
        WebElement element = driver.findElement(by);
        if (text.equals(element.getText())){
            return true;
        }else {
            return false;
        }
        }
    public List<WebElement> webElementList(By by){
        return driver.findElements(by);
    }


}