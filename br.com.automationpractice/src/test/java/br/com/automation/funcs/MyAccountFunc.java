package br.com.automation.funcs;

import br.com.automation.pages.MyAccountPage;
import br.com.automationpractice.communs.BaseTest;

public class MyAccountFunc extends BaseTest {
    MyAccountPage myAccountPage = new MyAccountPage();

    public String getNomeUsuarioLogado() {
       String nome = driver.findElement(myAccountPage.getTitleUsuarioLogado()).getText();
       return nome;
    }


}
