package br.com.automationpractice.configuration;

import br.com.automationpractice.communs.BaseTest;
import br.com.automationpractice.enums.web;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseTest {

    @Before
    public void beforeTest() {

        inicializarDriver(web.CHROME);
    }

    @After
    public void afeterTest() {
        driver.quit();
    }
}
