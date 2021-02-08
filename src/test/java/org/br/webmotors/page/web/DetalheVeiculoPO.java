package org.br.webmotors.page.web;

import org.br.webmotors.core.BasePage;
import org.br.webmotors.core.SeleniumLib;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DetalheVeiculoPO extends BasePage {

    @FindBy(xpath = "//h2[text() = 'Sobre o vendedor']/../../div[2]//h2")
    private WebElement getNomeLoja;
    @FindBy(xpath = "//a[@id = 'VehicleSellerInformationStock']/i")
    private WebElement linkEstoque;

    public DetalheVeiculoPO(RemoteWebDriver driver){
        seleniumLib = new SeleniumLib(driver);
        PageFactory.initElements(driver, this);
    }

    public String getNomeLoja(){
        return seleniumLib.obterTexto(getNomeLoja);
    }

    public void clicarVerEstoqueLoja(){
        seleniumLib.clicar(linkEstoque);
    }
}
