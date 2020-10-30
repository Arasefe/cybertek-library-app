package com.cybertek.library.pages;

import com.cybertek.library.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EditUserPage {
    public EditUserPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    WebDriverWait wait=new WebDriverWait(Driver.getDriver(),20);
    @FindBy(xpath = "//select[@id='status']")
    public WebElement editUserStatus;




}

