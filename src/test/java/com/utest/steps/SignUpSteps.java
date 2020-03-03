package com.utest.steps;

import com.utest.pages.LandingPage;
import com.utest.pages.signup.SignUp1Page;
import com.utest.pages.signup.SignUp2Page;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

import java.util.List;

public class SignUpSteps extends ScenarioSteps {

    SignUp1Page signUp1Page;

    SignUp2Page signUp2Page;

    LandingPage landingPage;

    @Step
    public void go_to_sign_up_page(String landingURL) {
        landingPage.navigateToLandingPage(landingURL);
        landingPage.clickSignUpForFree();
    }

    @Step
    public void fill_info_for_first_sign_up_step(String firstName, String lastName, String email, String gender, String month, String day, String year, List<String> languages) {
        signUp1Page.enterFirstName(firstName);
        signUp1Page.enterLastName(lastName);
        signUp1Page.enterEmail(email);
        signUp1Page.selectGender(gender);
        signUp1Page.selectBirthMonth(month);
        signUp1Page.selectBirthDay(day);
        signUp1Page.selectBirthYear(year);
        signUp1Page.enterLanguages(languages);
    }

    @Step
    public void submit_step_one() {
        signUp1Page.clickNextLocationButton();
    }

    @Step
    public void verify_if_sign_up_step_one_succeeded(String subTitle) {
        Assert.assertTrue("Sign up step one submission failed!", signUp2Page.isSubTitleDisplayed(subTitle));
    }

    @Step
    public void verify_if_message_invalid_email_appear(String email) {
        Assert.assertTrue("Invalid email message did not appear!", signUp1Page.isEmailValid(email));
    }
}
