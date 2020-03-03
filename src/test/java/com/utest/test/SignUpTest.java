package com.utest.test;

import com.utest.steps.SignUpSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RunWith(SerenityRunner.class)
public class SignUpTest {

    @Managed(uniqueSession = true)
    public WebDriver driver;

    @Steps
    private SignUpSteps signUpSteps;

    @Test
    public void sign_up_successfully_test() {

        List<String> languages = new ArrayList<String>(Arrays.asList("Russian"));
        signUpSteps.go_to_sign_up_page("https://www.utest.com/");
        signUpSteps.fill_info_for_first_sign_up_step("Long", "Lee", "longhoangly@gmail.com", "Male", "Jan", "20", "1990", languages);
        signUpSteps.submit_step_one();
        signUpSteps.verify_if_sign_up_step_one_succeeded("Add your address");
    }

    @Test
    public void sign_up_failed_invalid_email_test() {

        List<String> languages = new ArrayList<String>(Arrays.asList("Russian"));
        signUpSteps.go_to_sign_up_page("https://www.utest.com/");
        signUpSteps.fill_info_for_first_sign_up_step("Long", "Lee", "invalid_email", "Male", "Jan", "20", "1990", languages);
        signUpSteps.submit_step_one();
        signUpSteps.verify_if_message_invalid_email_appear("Enter valid email");
    }
}
