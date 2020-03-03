package com.utest.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage extends PageObject {

    protected WebDriver driver;

    @FindBy(linkText = "Sign Up For Free")
    private WebElement signUpBtn;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToLandingPage(String landingURL) {
        this.driver.navigate().to(landingURL);
        this.driver.manage().window().maximize();
    }

    public void clickSignUpForFree() {
        signUpBtn.click();
    }
}
