package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class BasePage {
    public String pageURL;
    public WebDriver driver;

    public BasePage(String _pageURL, WebDriver _driver) {
        this.pageURL = _pageURL;
        this.driver = _driver;
        this.driver.manage().window().maximize();
    }

    public BasePage(WebDriver _driver) {

        this.driver = _driver;

    }

    public void loadPage() {
        driver.navigate().to(pageURL);


    }

    public void waitUntilElementExists(WebElement element) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(element));
        System.out.println("El elemento se encuentra: " + element.isEnabled() + "\r\n");

    }

    public void implicitWaitUntilElementExists() {
        int TimeOut = 10;
        driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);

    }

}
