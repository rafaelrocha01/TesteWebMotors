package org.br.webmotors.page.api;

import org.br.webmotors.core.BasePage;
import org.br.webmotors.core.RestLib;

public class MarcaPO extends BasePage {

    public MarcaPO(){
        restLib = new RestLib();
    }

    public void getMarcas(){
        restLib.get("/Make");
    }
}
