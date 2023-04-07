package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

    public static WebDriver webDriver;
    public WelcomePage(WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }

    @FindBy(xpath = "//div[@id='kt_quick_user_toggle']")
    private WebElement welcomePage;
    public boolean verifyWelcomePage(){
        return welcomePage.isDisplayed();
    }

    @FindBy(xpath = "//span[.='Pemilih Tetap']")
    private WebElement pemilihTetapButton;
    public void setPemilihTetapButton(){
        pemilihTetapButton.click();
    }
}
