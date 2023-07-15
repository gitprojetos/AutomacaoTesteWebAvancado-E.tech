package br.com.automation.funcs;

import br.com.automation.pages.WomenPage;
import br.com.automationpractice.communs.BaseTest;

import java.util.ArrayList;
import java.util.List;

public class WomenFunc extends BaseTest {

    WomenPage womenPage = new WomenPage();
    WomenFunc womenFunc = new WomenFunc();

    public void clicarFiltroRoupas(){
        driver.findElement(womenPage.getFiltroRoupas());
    }

    public List<String> getOpcoesFiltro(){
        int elementos  = driver.findElements(womenPage.getSelectOptionsSortBy()).size();
        List<String> opcaoFiltro = new ArrayList<>();
        for(int i = 0; i < elementos; i++){
            String opcao = driver.findElements(womenPage.getFiltroRoupas()).get(i).getText();
            opcaoFiltro.add(opcao);
            System.out.println(opcao);
        }
        return opcaoFiltro;
    }
}
