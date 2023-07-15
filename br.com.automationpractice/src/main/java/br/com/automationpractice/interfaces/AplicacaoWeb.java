package br.com.automationpractice.interfaces;

import org.openqa.selenium.WebDriver;

/**
 * Interface onde contém um metodo que vai retornar um webdriver;
 * Dentro de uma iterface contém apenas assinatura
 * */
public interface AplicacaoWeb {
    WebDriver getDriver();
}
