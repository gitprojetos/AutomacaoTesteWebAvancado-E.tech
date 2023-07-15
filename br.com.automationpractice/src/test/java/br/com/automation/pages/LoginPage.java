package br.com.automation.pages;

import org.openqa.selenium.By;

public class LoginPage {
    By campoEmailRegistrado = By.id("email");
    By campoSenhaRegistrada = By.id("passwd");
    By botaoSignIn = By.id("SubmitLogin");
    By mensgemErro = By.xpath("//div[@class='alert alert-danger']/descendant::li");

    public By getCampoEmailRegistrado() {
        return this.campoEmailRegistrado;
    }

    public By getcampoSenhaRegistrada() {
        return this.campoSenhaRegistrada;
    }

    public By getBotaoSignIn() {
        return this.botaoSignIn;
    }

    public By getmensgemErro() {
        return mensgemErro;
    }
}

