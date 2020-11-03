package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.BookManagementPage;
import com.cybertek.library.pages.EditUserPage;
import com.cybertek.library.pages.UserManagementPage;
import com.cybertek.library.utils.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EditUser_StepDefinitions {
    UserManagementPage userManagementPage = new UserManagementPage();
    EditUserPage editUserPage = new EditUserPage();
    BookManagementPage book = new BookManagementPage();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);


    @Then("I click on Edit User link and edit the info")
    public void i_click_on_edit_user_link_and_edit_the_info(Map<String, String> dataTable) {
        wait.until(ExpectedConditions.elementToBeClickable(userManagementPage.editUserBtn));
        userManagementPage.editUserBtn.click();
        Select select1 = new Select(editUserPage.editUserGroup);
        Select select2 = new Select(editUserPage.editUserStatus);

        wait.until(ExpectedConditions.visibilityOfAllElements(editUserPage.editUserStatus));
        String fullName = dataTable.get("Full Name");
        String password = dataTable.get("Password");
        String email = dataTable.get("Email");
//        String user_Group = dataTable.get("User Group");
//        String status = dataTable.get("Status");
        String address = dataTable.get("Address");

        editUserPage.fullName.clear();
        editUserPage.fullName.sendKeys(fullName);
        editUserPage.password.clear();
        editUserPage.password.sendKeys(password);
        editUserPage.email.clear();
        editUserPage.email.sendKeys(email);
        select1.selectByVisibleText(dataTable.get("User Group"));

        select2.selectByVisibleText(dataTable.get("Status"));
        editUserPage.editAddress.clear();
        editUserPage.editAddress.sendKeys(address);

    }


    @Then("I should be able to verify that user information is edited")
    public void i_should_be_able_to_verify_that_user_information_is_edited(Map<String, String> name) {

        List<String> names = new ArrayList<>();
        for (int i = 0; i < editUserPage.updatedFullName.size(); i++) {
            names.add(editUserPage.updatedFullName.get(i).getText());
            Assert.assertTrue(names.contains(name.get("Full Name")));
        }
    }
}
