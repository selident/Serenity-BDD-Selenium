package com.utest.pages.signup;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUp2Page extends PageObject {

    protected WebDriver driver;

    @FindBy(css = "span.sub-title")
    private WebElement step2TitleTxt;

    public SignUp2Page(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isSubTitleDisplayed(String subTitle) {
        return step2TitleTxt.getText().equals(subTitle);
    }
}
