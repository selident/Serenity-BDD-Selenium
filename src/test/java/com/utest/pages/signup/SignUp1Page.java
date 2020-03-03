package com.utest.pages.signup;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SignUp1Page extends PageObject {

    protected WebDriver driver;

    @FindBy(id = "firstName")
    private WebElement firstNameTxt;

    @FindBy(id = "lastName")
    private WebElement lastNameTxt;

    @FindBy(id = "email")
    private WebElement emailTxt;

    @FindBy(id = "genderCode")
    private WebElement genderCbx;

    @FindBy(xpath = "//div[@name='genderCode']/input")
    private WebElement genderInput;

    @FindBy(id = "birthMonth")
    private WebElement birthMonthCbx;

    @FindBy(xpath = "//div[@name='birthMonth']/input")
    private WebElement birthMonthInput;

    @FindBy(id = "birthDay")
    private WebElement birthDayCbx;

    @FindBy(xpath = "//div[@name='birthDay']/input")
    private WebElement birthDayInput;

    @FindBy(id = "birthYear")
    private WebElement birthYearCbx;

    @FindBy(xpath = "//div[@name='birthYear']/input")
    private WebElement birthYearInput;

    @FindBy(xpath = "//span[@name='languages']/input")
    private WebElement languageInput;

    @FindBy(xpath = "//span[text()='Next: Location']")
    private WebElement nextLocationBtn;

    @FindBy(id = "emailError")
    private WebElement invalidEmailMsg;

    public SignUp1Page(WebDriver driver) {
        this.driver = driver;
    }

    public void enterFirstName(String firstName) {
        firstNameTxt.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        lastNameTxt.sendKeys(lastName);
    }

    public void enterEmail(String email) {
        emailTxt.sendKeys(email);
    }

    public void selectGender(String gender) {
        genderCbx.click();
        genderInput.sendKeys(gender);
    }

    public void selectBirthMonth(String month) {
        birthMonthCbx.click();
        birthDayInput.sendKeys(month);
    }

    public void selectBirthDay(String day) {
        birthDayCbx.click();
        birthDayInput.sendKeys(day);
    }

    public void selectBirthYear(String year) {
        birthYearCbx.click();
        birthYearInput.sendKeys(year);
    }

    public void enterLanguages(List<String> languages) {
        for (String language : languages) {
            languageInput.sendKeys(language);
            languageInput.sendKeys("\n");
        }
    }

    public void clickNextLocationButton() {
        nextLocationBtn.click();
    }

    public boolean isEmailValid(String msg){
        return invalidEmailMsg.getText().equals(msg);
    }
}
