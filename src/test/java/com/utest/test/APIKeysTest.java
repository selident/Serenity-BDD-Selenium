package com.utest.test;

import com.utest.steps.APIKeySteps;
import com.utest.steps.SignInSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class APIKeysTest {

    @Managed(uniqueSession = true)
    public WebDriver driver;

    String LANDING_URL = "https://openweathermap.org/";

    @Steps
    private SignInSteps signInSteps;

    @Steps
    private APIKeySteps apiKeySteps;

    @Test
    public void add_api_key() {

        signInSteps.go_to_sign_in_page(LANDING_URL);
        signInSteps.login_into_application("wizetest1@gmail.com", "autotest");
        signInSteps.go_to_API_keys_page();
        apiKeySteps.add_api_key("ABCXYZ");
        apiKeySteps.verify_if_api_key_exist("ABCXYZ");
    }

    @Test
    public void edit_api_key() {

        signInSteps.go_to_sign_in_page(LANDING_URL);
        signInSteps.login_into_application("wizetest1@gmail.com", "autotest");
        signInSteps.go_to_API_keys_page();
        apiKeySteps.edit_api_key("ABCXYZABCXYZ1111111", "22222222");
        apiKeySteps.verify_if_api_key_exist("22222222");
    }

    @Test
    public void delete_api_key() {

        signInSteps.go_to_sign_in_page(LANDING_URL);
        signInSteps.go_to_API_keys_page();
        apiKeySteps.delete_api_key("ABCXYZ1");
    }
}
