package com.utest.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class APIKeysPage extends PageObject {

    protected WebDriver driver;

    @FindBy(id = "api_key_form_name")
    private WebElement apiKeyNameTxt;

    @FindBy(id = "edit_key_form_name")
    private WebElement editApiKeyNameTxt;

    @FindBy(xpath = "//*[@name='commit']")
    private WebElement generateBtn;

    @FindBy(xpath = "//*[@name='commit']")
    private WebElement edit;

    @FindBy(xpath = "//*[text()='Edit']")
    private WebElement editBtn;

    public APIKeysPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterAPIKeyName(String name) {
        $(apiKeyNameTxt).sendKeys(name);
    }

    public void clickGenerate() {
        $(generateBtn).waitUntilClickable().click();
    }

    public void clickEditAPIKey(String name) {

        WebElement element = driver.findElement(By.xpath("//*[contains(@class, 'edit-key-btn')][@data-name='" + name + "']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
    }

    public void enterEditAPIKeyName(String name) {
        $(editApiKeyNameTxt).waitUntilVisible().sendKeys(name);
    }

    public void clickEditButton() {
        $(editBtn).waitUntilClickable().click();
    }

    public boolean isAPIKeyExist(String apiKey) {
        WebElement element = driver.findElement(By.xpath("//*[text()='" + apiKey + "']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        return element.isDisplayed();
    }

    public void deleteAPIKey(String apiKey) {
        driver.findElement(By.xpath("//*[contains(@class, 'edit-key-btn')][@data-name='" + apiKey + "']/following-sibling::a")).click();
    }

    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }
}
