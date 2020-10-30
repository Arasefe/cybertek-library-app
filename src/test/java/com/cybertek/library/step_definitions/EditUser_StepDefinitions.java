package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.EditUserPage;
import com.cybertek.library.pages.UserManagementPage;
import com.cybertek.library.utils.Driver;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EditUser_StepDefinitions {
    UserManagementPage userManagementPage = new UserManagementPage();
    EditUserPage editUserPage = new EditUserPage();

    WebDriverWait wait=new WebDriverWait(Driver.getDriver(),20);

    Select select = new Select(editUserPage.editUserStatus);
    @When("I click on Edit User link")
    public void i_click_on_Edit_User_link() {
        wait.until(ExpectedConditions.elementToBeClickable(userManagementPage.addUserIcon));

        for (int i = 0; i < 101; i++) {
            userManagementPage.editUserBtn.click();
            select.selectByVisibleText("INACTIVE");
        }
    }
}
