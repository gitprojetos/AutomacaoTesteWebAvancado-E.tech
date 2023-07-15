package br.com.automation.steps;

import br.com.automation.funcs.HomeFunc;
import br.com.automationpractice.communs.BaseTest;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.an.E;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class HomeStep extends BaseTest {

    HomeFunc homeFunc = new HomeFunc();

    @Dado("estiver na tela home")
    public void estiverNaTelaHome() {
        homeFunc.acessarTelaHome();
    }

    @E("selecionar o submenu {string}")
    public void selecionarOSubmenu(String subMenu) {
        homeFunc.selecionarSubMenu(subMenu);

    }
}
