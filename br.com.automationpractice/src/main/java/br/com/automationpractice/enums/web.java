package br.com.automationpractice.enums;

import br.com.automationpractice.interfaces.AplicacaoWeb;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public enum web implements AplicacaoWeb {

    CHROME {
        @Override
        public WebDriver getDriver() {
            return new ChromeDriver();
        }
    },

    FIREFOX {
        @Override
        public WebDriver getDriver() {
            return new FirefoxDriver();
        }
    };
}
