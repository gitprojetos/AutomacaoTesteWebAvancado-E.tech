package br.com.automation.steps;

import br.com.automation.funcs.MyAccountFunc;
import br.com.automation.pages.MyAccountPage;
import io.cucumber.java.pt.Entao;
import org.junit.Assert;

public class MyAccountSteps {

    MyAccountFunc myAccountFunc = new MyAccountFunc();
    @Entao("deve visualizar o nome {string}")
    public void deveVisualizarNome(String nome){
        Assert.assertEquals(nome, myAccountFunc.getNomeUsuarioLogado());

    }
}
