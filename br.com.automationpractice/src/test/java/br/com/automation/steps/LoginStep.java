package br.com.automation.steps;

import br.com.automation.funcs.LoginFunc;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.junit.Assert;
import org.openqa.selenium.bidi.log.Log;

import java.util.List;
import java.util.Map;

public class LoginStep {

    LoginFunc loginFunc = new LoginFunc();

    @Dado("estiver na tela de login")
    public void entrarLogin() {
        loginFunc.acessarTelaLogin();
    }

    //@Dado("inserir os dados do usuário {string}")
    //public void inserirDadosUsuario(String dadosUsuarios) {
        //loginFunc.realizarLogin(dadosUsuarios, "123456789");
        //}

    @Quando("inserir os dados do usuário")
    public void inserirOsDadosDoUsuario(DataTable dataTable) {
        List<Map<String, String>> usuario = dataTable.asMaps();
        String email = usuario.get(0).get("email");
        String senha = usuario.get(0).get("senha");
        loginFunc.realizarLogin(email, senha);
    }
    @Entao("deve visualizar a mensagem de erro {string}")
    public void deveVisualizarMensagem(String mensagem) {
        Assert.assertEquals(mensagem, loginFunc.getRetornoMensagemErro());
    }
}
