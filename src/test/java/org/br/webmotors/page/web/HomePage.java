package org.br.webmotors.page.web;

import org.br.webmotors.core.BasePage;
import org.br.webmotors.core.SeleniumLib;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    @FindBy(xpath = "//a[text() = 'Ver Ofertas']")
    private WebElement btnVerOfertas;

    public HomePage(RemoteWebDriver driver){
        seleniumLib = new SeleniumLib(driver);
        PageFactory.initElements(driver, this);
    }

    public void clicarVerOfetas(){
        seleniumLib.clicar(btnVerOfertas);
    }
}
