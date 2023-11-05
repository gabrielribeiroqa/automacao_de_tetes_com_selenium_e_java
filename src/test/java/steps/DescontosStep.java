package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.HomePage;
import runner.runnerCucumberTest;

public class DescontosStep extends runnerCucumberTest {
    HomePage homePage = new HomePage(driver);

    @Dado("^que estou no  site da qazando$")
    public void que_estou_no_site_da_qazando() throws InterruptedException {
        homePage.acessarAplicacao();
    }

    @Quando("^eu preencho o meu e-mail$")
    public void eu_preencho_o_meu_e_mail() throws InterruptedException {
        homePage.scrollDown();
        homePage.preencherEmail();
    }

    @Quando("^clico em gabhar cupom$")
    public void clico_em_gabhar_cupom() throws InterruptedException {
      homePage.clickGanharDesconto();
    }

    @Então("^eu vejo o código do desconto$")
    public void eu_vejo_o_código_do_desconto() throws InterruptedException {
        homePage.verificarCupomDesconto();

    }

}
