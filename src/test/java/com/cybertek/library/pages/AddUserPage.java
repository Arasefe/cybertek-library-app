package com.cybertek.library.pages;

import com.cybertek.library.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddUserPage extends PageBase{

    public AddUserPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    WebDriverWait wait=new WebDriverWait(Driver.getDriver(),40);

    @FindBy(xpath="//input[@name='full_name']")
    public WebElement fullName;

    @FindBy(name="password")
    public WebElement password;

    @FindBy(name="email")
    public WebElement eMail;

    @FindBy(id="address")
    public WebElement address;

    @FindBy(xpath="//button[.='Save changes']")
    public WebElement saveChangesBtn;

    @FindBy(xpath="//button[.='Close']")
    public WebElement closeButton;



}
