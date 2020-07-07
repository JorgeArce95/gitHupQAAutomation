package pageobject;


import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class registerPage extends BasePage {



    private final By name = By.id("input-firstname");
    private final By lastName = By.id("input-lastname");
    private final By email = By.id("input-email");
    private final By telephone = By.id("input-telephone");
    private final By password = By.id("input-password");
    private final By passwordConfim = By.id("input-confirm");
    private final By privacyPolicy = By.xpath("//div[@class='pull-right']//input[@type='checkbox']");
    private final By continuee = By.xpath("//div[@class='pull-right']//input[@type='submit']");


    public registerPage(String url, WebDriver driver) {
        super(url, driver);

    }



    public WebElement setNameSendKeys() {
        return driver.findElement(this.name);

    }

    public WebElement setLastNameSendKeys() {
        return driver.findElement(this.lastName);
    }

    public WebElement setEmailSendKeys() {
        return driver.findElement(this.email);
    }

    public WebElement setTelephoneSendKeys() {
        return driver.findElement(this.telephone);
    }

    public WebElement setPasswordSendKeys() {
        return driver.findElement(this.password);
    }

    public WebElement setConfirmPasswordSendKeys() {
        return driver.findElement(this.passwordConfim);
    }

    public WebElement setPrivacyPolicyCheckBox() {
        return driver.findElement(this.privacyPolicy);
    }

    public WebElement setContinueButton() {
        return driver.findElement(this.continuee);
    }





    @Step
    public void insertName(String name) {
        waitUntilElementExists(setNameSendKeys());
        setNameSendKeys().sendKeys(name);
        System.out.println("Texto Ingresado correctamente " + "\r\n");

    }

    @Step
    public void insertLastName(String lastName) {
        waitUntilElementExists(setLastNameSendKeys());
        setLastNameSendKeys().sendKeys(lastName);
        System.out.println("Texto Ingresado correctamente" + "\r\n");

    }

    @Step
    public void insertEmail(String email) {
        waitUntilElementExists(setEmailSendKeys());
        setEmailSendKeys().sendKeys(email);
        System.out.println("Texto Ingresado correctamente" + "\r\n");
    }


    @Step
    public void insertTelephone(String telephone) {
        waitUntilElementExists(setTelephoneSendKeys());
        setTelephoneSendKeys().sendKeys(telephone);
        System.out.println("Texto Ingresado correctamente" + "\r\n");

    }

    @Step
    public void insertPassword(String password) {
        waitUntilElementExists(setPasswordSendKeys());
        setPasswordSendKeys().sendKeys(password);
        System.out.println("Texto Ingresado correctamente" + "\r\n");

    }

    @Step
    public void insertConfirmPassword(String confirmPassword) {
        waitUntilElementExists(setConfirmPasswordSendKeys());
        setConfirmPasswordSendKeys().sendKeys(confirmPassword);
        System.out.println("Texto Ingresado correctamente" + "\r\n");

    }

    @Step
    public void clickPrivacyPolicyCheckBox() {
        waitUntilElementExists(setPrivacyPolicyCheckBox());
        System.out.println("Click al elemento llamado: PolicyCheckBox" + "\r\n");
        setPrivacyPolicyCheckBox().click();

    }

    @Step
    public void clickContinueButton() {
        waitUntilElementExists(setContinueButton());
        System.out.println("Click al elemento llamado: ContinueButton " + "\r\n");
        setContinueButton().click();
    }



}
