package org.example.pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PencarianPage {
    public static WebDriver webDriver;
    public PencarianPage(WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }

    @FindBy(xpath = "//input[@id='table-inputpemilih_dtSearch']" )
    private WebElement pencarianField;
    public void setPencarianField(String inputPencarian){
        pencarianField.sendKeys(inputPencarian);
        pencarianField.sendKeys(Keys.RETURN);
    }

    @FindBy(xpath = "//td[.='Gina']")
    private WebElement verifySearch;
    public String setVerifySearch(){
        return verifySearch.getText();
    }
}
