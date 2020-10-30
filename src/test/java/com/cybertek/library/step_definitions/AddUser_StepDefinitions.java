package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.*;
import com.cybertek.library.utils.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AddUser_StepDefinitions {
    AddUserPage addUserPage = new AddUserPage();
    UserManagementPage userManagementPage = new UserManagementPage();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);

    @When("I click {string} icon")
    public void i_click_icon(String string) {
        wait.until(ExpectedConditions.elementToBeClickable(userManagementPage.addUserIcon));
        userManagementPage.addUserIcon.click();
        wait.until(ExpectedConditions.visibilityOf(addUserPage.fullName));
    }

    @When("I fill all the necessary fields")
    public void i_fill_all_the_necessary_fields(Map<String, String> dataTable) {
        System.out.println("dataTable.keySet().size() = " + dataTable.keySet().size());
        System.out.println("dataTable.Value().size() = " + dataTable.values().size());

        String fullName = dataTable.get("Full Name");
        String password = dataTable.get("Password");
        String email = dataTable.get("Email");
        String address = dataTable.get("Address");

        addUserPage.fullName.sendKeys(fullName);
        addUserPage.password.sendKeys(password);
        addUserPage.eMail.sendKeys(email);
        addUserPage.address.sendKeys(address);


    }

    @When("I save changes")
    public void i_save_changes() {
        wait.until(ExpectedConditions.elementToBeClickable(addUserPage.saveChangesBtn));
        addUserPage.saveChangesBtn.click();
    }


    @Then("I should be able to verify that user is added")
    public void i_should_be_able_to_verify_that_user_is_added() {
        List<WebElement> list = new ArrayList<>();
        list.addAll(userManagementPage.userManagementTable);

        List<String> names = new ArrayList<>();
        String actual = addUserPage.fullName.getText();
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i).getText();
            names.add(name);
        }
        Assert.assertTrue(names.contains(actual));
    }

    @Then("I should be able to close the table")
    public void i_should_be_able_to_close_the_table() {
        addUserPage.closeButton.click();
    }
}
