package com.utest.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends PageObject {

    protected WebDriver driver;

    @FindBy(linkText = "API keys")
    private WebElement apiKeysTab;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAPIKeysTab() {
        $(apiKeysTab).waitUntilClickable().click();
    }
}
