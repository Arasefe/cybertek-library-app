package com.cybertek.library.pages;

import com.cybertek.library.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Map;

public class EditUserPage {
    public EditUserPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    WebDriverWait wait=new WebDriverWait(Driver.getDriver(),20);

    @FindBy(xpath = "//input[@name='full_name']")
    public WebElement fullName;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement email;

    @FindBy(xpath = "//select[@id='user_group_id']")
    public WebElement editUserGroup;

    @FindBy(xpath = "//select[@id='status']")
    public WebElement editUserStatus;

    @FindBy(xpath = "//input[@name='start_date']")
    public WebElement editStartDate;

    @FindBy(xpath = "//input[@name='start_date']")
    public WebElement editEndDate;

    @FindBy(xpath = "//textarea[@id='address']")
    public WebElement editAddress;


    @FindBy(xpath = "//table[@id='tbl_users']//tr/td[3]")
    public List<WebElement> updatedFullName;

}

