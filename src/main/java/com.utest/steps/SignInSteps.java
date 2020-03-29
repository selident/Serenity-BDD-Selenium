package com.utest.steps;

import com.utest.pages.HomePage;
import com.utest.pages.LandingPage;
import com.utest.pages.SignInPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class SignInSteps extends ScenarioSteps {

    SignInPage signInPage;

    LandingPage landingPage;

    HomePage homePage;

    @Step
    public void go_to_sign_in_page(String landingURL) {
        landingPage.navigateToLandingPage(landingURL);
        landingPage.clickSignIn();
    }

    @Step
    public void login_into_application(String email, String password) {
        signInPage.enterEmail(email);
        signInPage.enterPassword(password);
        signInPage.clickSubmit();
    }

    @Step
    public void go_to_API_keys_page() {
        homePage.clickAPIKeysTab();
    }
}
