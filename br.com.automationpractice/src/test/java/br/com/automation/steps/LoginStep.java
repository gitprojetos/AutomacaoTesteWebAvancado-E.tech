package br.com.automation.steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;

public class LoginStep {

    @Dado("estiver na tela de login")
    public void entrarLogin(){

    }

    @Dado("inserir os dados do usuário {string}")
    public void inserirDadosUsuario(String dadosUsuarios){

    }

    @Entao("deve visualizar a mensagem de erro {string}")
    public void deveVisualizarMensagem(String mensagem){

    }
}
