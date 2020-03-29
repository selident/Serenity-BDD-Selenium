package com.utest.steps;

import com.utest.pages.APIKeysPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class APIKeySteps extends ScenarioSteps {

    APIKeysPage apiKeysPage;

    @Step
    public void add_api_key(String name) {
        apiKeysPage.enterAPIKeyName(name);
        apiKeysPage.clickGenerate();
    }

    @Step
    public void edit_api_key(String oldName, String newName) {
        apiKeysPage.clickEditAPIKey(oldName);
        apiKeysPage.enterEditAPIKeyName(newName);
        apiKeysPage.clickEditButton();
    }

    @Step
    public void delete_api_key(String name) {
        apiKeysPage.deleteAPIKey(name);
        apiKeysPage.acceptAlert();
    }

    @Step
    public void verify_if_api_key_exist(String name){
        Assert.assertTrue(apiKeysPage.isAPIKeyExist(name));
    }
}
