package org.br.webmotors.steps;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"src/test/java/org/br/webmotors/feature/ConsultaVeiculo.feature"},
        plugin = {"io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm", "pretty", "json:target/cucumber-report/report.json"},
        glue = {"org.br.webmotors.steps"})
public class CucumberTest {
}
