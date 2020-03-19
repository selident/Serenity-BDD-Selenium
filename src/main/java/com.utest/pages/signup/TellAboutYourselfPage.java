package com.utest.pages.signup;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TellAboutYourselfPage extends PageObject {

    protected WebDriver driver;

    @FindBy(id = "firstName")
    private WebElement firstNameTxt;

    @FindBy(id = "lastName")
    private WebElement lastNameTxt;

    @FindBy(id = "email")
    private WebElement emailTxt;

    @FindBy(id = "genderCode")
    private WebElement genderCbx;

    @FindBy(xpath = "//div[@name='genderCode']//input")
    private WebElement genderInput;

    @FindBy(id = "birthMonth")
    private WebElement birthMonthCbx;

    @FindBy(xpath = "//div[@name='birthMonth']//input")
    private WebElement birthMonthInput;

    @FindBy(id = "birthDay")
    private WebElement birthDayCbx;

    @FindBy(xpath = "//div[@name='birthDay']//input")
    private WebElement birthDayInput;

    @FindBy(id = "birthYear")
    private WebElement birthYearCbx;

    @FindBy(xpath = "//div[@name='birthYear']//input")
    private WebElement birthYearInput;

    @FindBy(xpath = "//div[@name='languages']//input")
    private WebElement languageInput;

    @FindBy(xpath = "//span[text()='Next: Location']")
    private WebElement nextLocationBtn;

    @FindBy(id = "emailError")
    private WebElement invalidEmailMsg;

    public TellAboutYourselfPage(WebDriver driver) {
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
        $(genderCbx).waitUntilClickable().click();
        this.driver.findElement(By.xpath("//div[text()='" + gender + "']")).click();
    }

    public void selectBirthMonth(String month) {
        $(birthMonthCbx).waitUntilClickable().click();
        $(birthMonthInput).waitUntilPresent().sendKeys(month + "\n");
    }

    public void selectBirthDay(String day) {
        $(birthDayCbx).waitUntilClickable().click();
        birthDayInput.sendKeys(day + "\n");
    }

    public void selectBirthYear(String year) {
        $(birthYearCbx).waitUntilClickable().click();
        birthYearInput.sendKeys(year + "\n");
    }

    public void enterLanguages(List<String> languages) {
        for (String language : languages) {
            languageInput.sendKeys(language + "\n");
        }
    }

    public void clickNextLocationButton() {
        nextLocationBtn.click();
    }

    public boolean isEmailValid(String msg) {
        return invalidEmailMsg.getText().equals(msg);
    }
}
