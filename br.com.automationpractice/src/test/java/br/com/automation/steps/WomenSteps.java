package br.com.automation.steps;

import br.com.automation.funcs.WomenFunc;
import br.com.automationpractice.communs.BaseTest;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import java.util.List;

public class WomenSteps extends BaseTest {

    WomenFunc womenFunc = new WomenFunc();
    @Quando("clicar no filtro de roupas")
    public void clicarNoFiltroDeRoupas() {
        womenFunc.clicarFiltroRoupas();

    }

    @Então("deve visualizar as opções de filtros")
    public void deveVisualizarAsOpçõesDeFiltros(DataTable dataTable) {
        List<String> selectOptionsFiltroRoupas = dataTable.asList();
        List<String> opcoesFiltro =  womenFunc.getOpcoesFiltro();
        int cont = 0;
        for (String opcao: selectOptionsFiltroRoupas ) {
            Assert.assertEquals(opcao, opcoesFiltro.get(cont));
            cont++;
        }


    }


}
