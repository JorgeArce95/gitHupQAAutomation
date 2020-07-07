package pageobject;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class headerPage extends BasePage{

    private final By myAccountButton = By.xpath("//li[@class='dropdown']/child::a[@href='https://demo.opencart.com/index.php?route=account/account']");
    private final By signInButton = By.xpath("//ul[@class='list-inline']//a[@href='https://demo.opencart.com/index.php?route=account/register']");
    private final By logout = By.xpath("//ul[@class='list-inline']//a[@href='https://demo.opencart.com/index.php?route=account/logout']");
    private By shoppingCart = By.xpath("//div[@id='cart']//span[@id='cart-total']");
    private By viewShoppingCart = By.xpath("//p[@class='text-right']//a[@href='https://demo.opencart.com/index.php?route=checkout/cart']");


    private By typeOfCurrency = By.xpath("//button[@class='btn btn-link dropdown-toggle']/ancestor::div[@class='btn-group']");
    private By euro = By.xpath("//li//button[@name='EUR']");
    private By libra = By.xpath("//li//button[@name='GBP']");
    private By dollar = By.xpath("//li//button[@name='USD']");
    private By validateCurrency = By.xpath("//div[@class='col-sm-4']//ul[2]//li[2]");



    public headerPage(String url, WebDriver driver) {
        super(url, driver);

    }



    public WebElement setMyAccountButton() { return driver.findElement(this.myAccountButton); }

    public WebElement setSignInButton() {
        return driver.findElement(this.signInButton);
    }

    public WebElement setLogoutButton() {
        return driver.findElement(this.logout);
    }

    public  WebElement setShoppingCartButton() { return driver.findElement(this.shoppingCart); }

    public  WebElement setViewShoppingCartButton() {
        return driver.findElement(this.viewShoppingCart);
    }

    public WebElement setTypeOfCurrencyButton() {
        return driver.findElement(this.typeOfCurrency);
    }

    public WebElement setEuroButton() {
        return driver.findElement(this.euro);
    }

    public WebElement setLibraButton() {
        return driver.findElement(this.libra);
    }

    public WebElement setDollarButton() {
        return driver.findElement(this.dollar);
    }

    public WebElement setValidateCurrencyButton() {
        return driver.findElement(this.validateCurrency);
    }




    @Step
    public void clickMyAccountButton() {
        waitUntilElementExists(setMyAccountButton());
        System.out.println("Click al elemento llamado: " + setMyAccountButton().getText() + "\r\n");
        setMyAccountButton().click();

    }

    @Step
    public void clickSignInButton() {
        waitUntilElementExists(setSignInButton());
        System.out.println("Click al elemento llamado: " + setSignInButton().getText() + "\r\n");
        setSignInButton().click();

    }

    @Step
    public void clickLogoutButton() {
        waitUntilElementExists(setLogoutButton());
        System.out.println("Click al elemento llamado: ContinueButton " + setLogoutButton().getText() + "\r\n");
        setLogoutButton().click();
    }

    @Step
    public void clickShoppingCartButton(){
        waitUntilElementExists(setShoppingCartButton());
        System.out.println("Click al elemento llamado: ContinueButton "+"\r\n");
        setShoppingCartButton().click();
    }
    @Step
    public void clickViewShoppingCartButton(){
        waitUntilElementExists(setViewShoppingCartButton());
        System.out.println("Click al elemento llamado: ContinueButton "+"\r\n");
        setViewShoppingCartButton().click();
    }


    @Step
    public void clickTypeOfCurrencyButton() {
        waitUntilElementExists(setTypeOfCurrencyButton());
        System.out.println("Click al elemento llamado: " + setTypeOfCurrencyButton().getText() + "\r\n");
        setTypeOfCurrencyButton().click();

    }

    @Step
    public void clickEuroButton() {
        waitUntilElementExists(setEuroButton());
        System.out.println("Click al elemento llamado: " + setEuroButton().getText() + "\r\n");
        setEuroButton().click();

    }

    @Step
    public void clickLibraButton() {
        waitUntilElementExists(setLibraButton());
        System.out.println("Click al elemento llamado: " + setLibraButton().getText() + "\r\n");
        setLibraButton().click();
    }

    @Step
    public void clickDollarButton() {
        waitUntilElementExists(setDollarButton());
        System.out.println("Click al elemento llamado:  " + setDollarButton().getText() + "\r\n");
        setDollarButton().click();
    }

    @Step
    public void clickValidateCurrencyButton() {
        waitUntilElementExists(setValidateCurrencyButton());
        System.out.println("Click al elemento llamado:  " + setValidateCurrencyButton().getText() + "\r\n");
        setValidateCurrencyButton().click();
    }




}
