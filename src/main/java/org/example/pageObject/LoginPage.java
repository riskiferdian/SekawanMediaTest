package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public static WebDriver webDriver;
    public LoginPage(WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }

    @FindBy(xpath = "//h3[@class='font-weight-bolder text-dark']")
    private WebElement loginPage;
    public boolean verifyLoginPage(){
        return loginPage.isDisplayed();
    }

    @FindBy(xpath = "//input[@id='username']")
    private WebElement username;
    public void setUsername(String inputUsername){
        username.sendKeys(inputUsername);
    }

    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;
    public void setPassword(String inputPassword){
        password.sendKeys(inputPassword);
    }

    @FindBy(xpath = "//button[@id='kt_login_signin_submit']")
    private WebElement loginButton;
    public void setLoginButton(){
        loginButton.click();
    }
}
