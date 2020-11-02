package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.EditUserPage;
import com.cybertek.library.pages.UserManagementPage;
import com.cybertek.library.utils.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Map;

public class EditUser_StepDefinitions {
    UserManagementPage userManagementPage = new UserManagementPage();
    EditUserPage editUserPage = new EditUserPage();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);

    Select status = new Select(editUserPage.editUserStatus);

    @Then("I click on Edit User link and edit the info")
    public void i_click_on_edit_user_link_and_edit_the_info(Map<String,String> dataTable) {
        String fullName=dataTable.get("Full Name");
        String password=dataTable.get("Password");
        String email=dataTable.get("Email");
        String user_Group=dataTable.get("User Group");
        String status=dataTable.get("Status");
        String address=dataTable.get("Address");




    }


    @Then("I should be able to verify that user information is edited")
    public void i_should_be_able_to_verify_that_user_information_is_edited() {

    }


}
