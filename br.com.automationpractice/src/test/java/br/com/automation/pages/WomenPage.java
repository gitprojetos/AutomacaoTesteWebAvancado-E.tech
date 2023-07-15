package br.com.automation.pages;

import org.openqa.selenium.By;

public class WomenPage {

    public By filtroRoupas = By.id("selectProductSort");
    public By selectOptionsSortBy = By.xpath("//select[@id='selectProductSort']/child::option[not(contains(text(),'--'))]");

    public By getFiltroRoupas() {
        return filtroRoupas;
    }

    public By getSelectOptionsSortBy() {
        return selectOptionsSortBy;
    }
}
