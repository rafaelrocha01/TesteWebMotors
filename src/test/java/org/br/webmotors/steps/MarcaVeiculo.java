package org.br.webmotors.steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import io.restassured.RestAssured;
import org.br.webmotors.core.RestLib;
import org.br.webmotors.page.api.MarcaPO;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Assert;

public class MarcaVeiculo {

    public MarcaPO marcaPO;

    @Dado("que eu possuo a url da api de consulta de marcas")
    public void queEuPossuoAUrlDaApiDeConsultaDeMarcas() {
        RestAssured.baseURI = "http://desafioonline.webmotors.com.br/api/OnlineChallenge";
        marcaPO = new MarcaPO();
    }

    @Quando("eu fizer a requisição get")
    public void euFizerARequisiçãoGet() {
        marcaPO.getMarcas();
    }

    @Então("a api deve retornar as marcas dos veiculos")
    public void aApiDeveRetornarAsMarcasDosVeiculos() throws JSONException {
        JSONArray json = new JSONArray(RestLib.resp.asString());
        JSONObject rec = json.getJSONObject(0);
        Assert.assertEquals("Chevrolet", rec.getString("Name").toString());
    }

    @Então("a api deve retornar o status {int}")
    public void aApiDeveRetornarOStatus(int arg0) {
        Assert.assertTrue(RestLib.status == arg0);
    }
}
