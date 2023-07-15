package br.com.automation.funcs;

import br.com.automation.pages.LoginPage;
import br.com.automationpractice.communs.BaseTest;

public class LoginFunc extends BaseTest {

    LoginPage loginPage = new LoginPage();

    public void acessarTelaLogin(){
        driver.get("http://www.automationpractice.pl/index.php?controller=my-account");
    }

    public void realizarLogin(String dadosUsuario, String senhaUsuario){
        driver.findElement(loginPage.getCampoEmailRegistrado()).sendKeys(dadosUsuario);
        driver.findElement(loginPage.getcampoSenhaRegistrada()).sendKeys(senhaUsuario);
        driver.findElement(loginPage.getBotaoSignIn()).click();

    }
    public String getRetornoMensagemErro(){
        return driver.findElement(loginPage.getmensgemErro()).getText();
    }

}
