package org.br.webmotors.steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.br.webmotors.core.BaseTest;
import org.br.webmotors.page.web.HomePage;
import org.br.webmotors.page.web.ResultadoBuscaPO;
import org.junit.Assert;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ConsultaVeiculo extends BaseTest {

    public static RemoteWebDriver driver;
    public HomePage homePage;
    public ResultadoBuscaPO resultadoBusca;

    @Dado("que eu esteja na pagina inicial da webmotors")
    public void queEuEstejaNaPaginaInicialDaWebmotors() {
        driver = startTestCase();
        homePage = new HomePage(driver);
        resultadoBusca = new ResultadoBuscaPO(driver);
    }

    @Quando("clicar em ver ofertas")
    public void clicarEmVerOfertas() {
        homePage.clicarVerOfetas();
    }

    @E("eu selecionar a marca {string} o modelo {string} e a versão {string}")
    public void euSelecionarAMarcaOModeloEAVersão(String marca, String modelo, String versao) {
        resultadoBusca.clicarCardHonda(marca);
        resultadoBusca.selecionarModeloCity(modelo);
        resultadoBusca.selecionarVersaoDxAutomatico(versao);
    }

    @Então("o site deve retornar uma lista com o veiculo da marca {string} modelo {string} e versão {string}")
    public void oSiteDeveRetornarUmaListaComOVeiculoDaMarcaModeloEVersão(String marca, String modelo, String versao) {
        Assert.assertTrue(resultadoBusca.validarResultadoDabusca(marca+" "+modelo));
        Assert.assertTrue(resultadoBusca.validarResultadoDabusca(versao));
        finishTestCase();
    }
}
