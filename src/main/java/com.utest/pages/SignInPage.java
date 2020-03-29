package com.utest.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage extends PageObject {

    protected WebDriver driver;

    @FindBy(id = "user_email")
    private WebElement emailTxt;

    @FindBy(id = "user_password")
    private WebElement passwordTxt;

    @FindBy(xpath = "//*[@name='commit']")
    private WebElement submitBtn;

    public SignInPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterEmail(String email) {
        emailTxt.sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordTxt.sendKeys(password);
    }

    public void clickSubmit() {
        $(submitBtn).waitUntilClickable().click();
    }
}
