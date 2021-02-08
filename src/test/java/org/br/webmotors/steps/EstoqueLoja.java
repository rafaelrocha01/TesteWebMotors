package org.br.webmotors.steps;

import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import org.br.webmotors.page.web.DetalheVeiculoPO;
import org.br.webmotors.page.web.ResultadoBuscaPO;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class EstoqueLoja {

    public ResultadoBuscaPO resultadoBuscaPO;
    public DetalheVeiculoPO detalheVeiculoPO;
    public String nomeLoja;

    @E("eu selecionar no menu lateral o checkbox loja")
    public void euSelecionarNoMenuLateralOCheckboxLoja() {
        resultadoBuscaPO = new ResultadoBuscaPO(ConsultaVeiculo.driver);
        detalheVeiculoPO = new DetalheVeiculoPO(ConsultaVeiculo.driver);
        resultadoBuscaPO.selecionarCheckLoja();
    }

    @E("eu clicar e um dos veiculos do reultado")
    public void euClicarEUmDosVeiculosDoReultado() {
        resultadoBuscaPO.clicarPrimeiroIten();
    }

    @E("eu clicar em ver todos os carros deste vendedor")
    public void euClicarEmVerTodosOsCarrosDesteVendedor() {
        List<String> abas = new ArrayList<String>(ConsultaVeiculo.driver.getWindowHandles());
        ConsultaVeiculo.driver.switchTo().window(abas.get(1));
        nomeLoja = detalheVeiculoPO.getNomeLoja();
        detalheVeiculoPO.clicarVerEstoqueLoja();
    }

    @Então("o site deve me retornar uma lista com o estoque da loja")
    public void oSiteDeveMeRetornarUmaListaComOEstoqueDaLoja() {
        Assert.assertTrue(resultadoBuscaPO.validarExibicaoEstoque(nomeLoja));
    }
}
