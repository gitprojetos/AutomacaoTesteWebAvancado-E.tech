package br.com.automation.pages;

import org.openqa.selenium.By;

public class MyAccountPage {

    By titleUsuarioLogado = By.xpath("//a[@class='account']/child::span");

    public By getTitleUsuarioLogado(){
        return titleUsuarioLogado;
    }
}
