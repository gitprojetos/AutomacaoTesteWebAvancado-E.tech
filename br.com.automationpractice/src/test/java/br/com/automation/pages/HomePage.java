package br.com.automation.pages;

import br.com.automationpractice.communs.BaseTest;
import org.openqa.selenium.By;

public class HomePage extends BaseTest {

    public By  sumbMenuWomen= By.xpath("//a[@title='Women']");
    public By  sumbMenuDresses= By.xpath("//a[@title='Dresses' and follwing-sibling::ul[@class='submenu-container clearfix first-in-line-xs']]");


}
