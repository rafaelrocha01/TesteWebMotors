package org.br.webmotors.core;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumLib {
    public RemoteWebDriver driver;

    public SeleniumLib(RemoteWebDriver driver){
        this.driver = driver;
    }

    public void clicar(WebElement webElement){
        webElement.click();
    }

    public void clicarScroll(WebElement webElement){
        setScrollToElement(webElement);
        webElement.click();
    }

    public void escrever(String texto, WebElement webElement){
        webElement.sendKeys(texto);
    }

    public void clicarPorTexto(String texto){
        WebElement element = driver.findElement(By.xpath("//*[text() = '"+texto+"']"));
        setScrollToElement(element);
        clicar(driver.findElement(By.xpath("//*[text() = '"+texto+"']")));
    }

    public void escreverEnter(String texto, WebElement webElement){
        webElement.sendKeys(texto);
        webElement.sendKeys(Keys.ENTER);
    }

    public void setScrollToElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    public String obterTexto(WebElement element){
        setScrollToElement(element);
        return element.getText();
    }

}
