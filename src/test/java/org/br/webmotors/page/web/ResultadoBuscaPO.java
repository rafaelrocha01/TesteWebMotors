package org.br.webmotors.page.web;

import org.br.webmotors.core.BasePage;
import org.br.webmotors.core.SeleniumLib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultadoBuscaPO extends BasePage {

    @FindBy(xpath = "//a[@title = 'honda']")
    private WebElement cardHonda;
    @FindBy(xpath = "//div[text() = 'Todos os modelos']")
    private WebElement cmbModelo;
    @FindBy(xpath = "//div[text() = 'Todas as versões']")
    private WebElement cmbVersao;
    @FindBy(xpath = "//a[text() = 'CITY']")
    private WebElement optCity;
    @FindBy(xpath = "//a[text() = '1.5 DX 16V FLEX 4P AUTOMÁTICO']")
    private WebElement optDxAutomatico;
    @FindBy(xpath = "//input[@id = 'Loja']/..")
    private WebElement chkLoja;
    @FindBy(xpath = "//div[@class = 'ContainerCardVehicle  ']//a[@target = '_blank']")
    private WebElement cardPrimeroIten;

    public ResultadoBuscaPO(RemoteWebDriver driver){
        seleniumLib = new SeleniumLib(driver);
        PageFactory.initElements(driver, this);
    }

    public void clicarCardHonda(String marca){
        seleniumLib.clicarPorTexto(marca);
    }

    public void selecionarModeloCity(String modelo){
        seleniumLib.clicar(cmbModelo);
        seleniumLib.clicarPorTexto(modelo);
    }

    public void selecionarVersaoDxAutomatico(String versao){
        seleniumLib.clicar(cmbVersao);
        seleniumLib.clicarPorTexto(versao);
    }

    public boolean validarResultadoDabusca(String texto){
        return seleniumLib.driver.findElements(By.xpath("//div[@class = 'ContainerCardVehicle  ']//*[text() = '"+texto+"']")).size() > 0;
    }

    public void selecionarCheckLoja(){
        seleniumLib.clicarScroll(chkLoja);
    }

    public void clicarPrimeiroIten(){
        seleniumLib.clicar(cardPrimeroIten);
    }

    public boolean validarExibicaoEstoque(String nomeLoja){
        return seleniumLib.driver.findElement(By.xpath("//ul[@id = 'FilterResultContainer']/li[1]/a")).getText().equals(nomeLoja);
    }
}
