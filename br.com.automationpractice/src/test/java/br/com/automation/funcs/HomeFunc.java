package br.com.automation.funcs;

import br.com.automation.pages.HomePage;
import br.com.automationpractice.communs.BaseTest;

public class HomeFunc extends BaseTest {

    HomePage homePage = new HomePage();

    public void acessarTelaHome() {
        driver.navigate().to("http://www.automationpractice.pl/index.php");


    }

    public void selecionarSubMenu(String subMenu) {
        subMenu = subMenu.replace("","").toUpperCase();
        switch(subMenu){
            case "WOMEN":
                driver.findElement(homePage.sumbMenuWomen).click();
                break;

            case "DRESSES":
                driver.findElement(homePage.sumbMenuDresses).click();
                break;


            default:
                System.out.println("Menu não existe");
        }
    }

}

