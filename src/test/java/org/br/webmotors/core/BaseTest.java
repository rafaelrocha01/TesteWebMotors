package org.br.webmotors.core;


import io.restassured.RestAssured;
import org.openqa.selenium.remote.RemoteWebDriver;


public class BaseTest {

    protected DriverSelenium driverSelenium;

    protected RemoteWebDriver startTestCase() {
        driverSelenium = new DriverSelenium();
        return driverSelenium.getDriver();
    }

    public void finishTestCase() {
        driverSelenium.closeDriver();
    }
}
