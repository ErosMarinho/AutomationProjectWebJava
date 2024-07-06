package br.com.project.awj.execute.steps;

import br.com.project.awj.pages.HomeBackofficePage;
import io.cucumber.java.en.Then;

public class HomeBackofficeSteps {
	
	private HomeBackofficePage homePage = new HomeBackofficePage();

	//ACESSO AO HOME BACKOFFICE
	
	@Then("Acessa o site do Tricentis")
	public void acessasite() {
		homePage.acessasite();
	}
	
	@Then("Validar tag na area de operação")
	public void validarTagAreaOperaca() {
		homePage.validarTagAreaOperaca();
	}
	
}