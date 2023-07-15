package br.com.automationpractice.communs;

import br.com.automationpractice.interfaces.AplicacaoWeb;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public abstract class BaseTest {

    public static WebDriver driver;

    /**
     * Vamos guardar a instancia do nosso driver que está vindo da nossa interface.
     * Vamos chamar nosso objeto driver e ele vai guardar nossa interface
     *
     * Interface = AplicacaoWeb -> Onde guardar o retorno do driver
     *
     * driver = aplicacao.getDriver();
     * Metodo inicializar Driver - Responsavel por guardar a instanciação do driver do nosso
     * objeto driver.
     *
     */

    protected void inicializarDriver(AplicacaoWeb aplicacaoWeb) {
        driver = aplicacaoWeb.getDriver();
        //A partir desse comentário para baixo é apenas uma configuração.
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
}
