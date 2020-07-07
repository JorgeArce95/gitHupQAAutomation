package pageobject;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class productPage extends BasePage{


    private By nameProduct = By.linkText("MacBook");
    private By searchInput = By.xpath("//div[@id='search']//input[@class='form-control input-lg']");
    private By Lupa = By.xpath("//div[@id='search']//span[@class='input-group-btn']");
    private By addCar = By.id("button-cart");
    private By valorTextSuccess = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    private By valorTextFail = By.xpath("//div[@class='alert alert-danger alert-dismissible']");
    private By nameProductCurrency = By.linkText("Canon EOS 5D");


    public productPage(String url, WebDriver driver) {
        super(url, driver);

    }
    public  WebElement setSearchInputKeys() {
        return driver.findElement(this.searchInput);
    }
    public  WebElement setLupaButton() {
        return driver.findElement(this.Lupa);
    }
    public  WebElement setResultNameProductButton() { return driver.findElement(this.nameProduct); }
    public  WebElement setAddCartButton() {
        return driver.findElement(this.addCar);
    }
    public  WebElement displayValorTextSuccess() { return driver.findElement(this.valorTextSuccess); }
    public  WebElement displayValorTextFail() {
        return driver.findElement(this.valorTextFail);
    }
    public WebElement setResultNameProductCurrencyButton() {
        return driver.findElement(this.nameProductCurrency);
    }


    @Step
    public void insertSearchInput(String name){
        waitUntilElementExists(setSearchInputKeys());
        setSearchInputKeys().sendKeys(name);
        System.out.println("Texto Ingresado correctamente "+"\r\n");

    }
    @Step
    public void clickLupaButton(){
        waitUntilElementExists(setLupaButton());
        System.out.println("Click al elemento llamado: "+setLupaButton().getText()+"\r\n");
        setLupaButton().click();

    }
    @Step
    public void clickNameProductButton(){
        waitUntilElementExists(setResultNameProductButton());
        System.out.println("Click al elemento llamado: "+setResultNameProductButton().getText()+"\r\n");
        setResultNameProductButton().click();

    }

    @Step
    public void clickAddCartButton(){
        waitUntilElementExists(setAddCartButton());
        System.out.println("Click al elemento llamado: PolicyCheckBox"+"\r\n");
        setAddCartButton().click();

    }
    @Step
    public void clickNameProductCurrencyButton() {
        waitUntilElementExists(setResultNameProductCurrencyButton());
        System.out.println("Click al elemento llamado: " + setResultNameProductCurrencyButton().getText() + "\r\n");
        setResultNameProductCurrencyButton().click();

    }




}
