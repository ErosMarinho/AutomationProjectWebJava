package br.com.project.awj.execute.steps;

import static org.junit.Assert.assertTrue;

import br.com.project.awj.pages.AutomobileInsurancePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AutomobileInsuranceSteps {

	private AutomobileInsurancePage automobilePage = new AutomobileInsurancePage();

	// ACESSO AO HOME BACKOFFICE

	@Given("Acessa o site do Tricentis")
	public void acessasite() {
		automobilePage.acessasite();
	}

	@And("Clica no menu Automobile")
	public void clicaMenuAutomobile() {
		automobilePage.clicaMenuAutomobile();
	}

	@And("Preenche formulário da Aba 'Enter Vehicle Data' de Automobile Insurance {string},{string},{string},{string},{string}")
	public void preencheFormularioAbaVehicleData(String enginePerformance, String dataManufacture, String listPrice,
			String licensePlateNumber, String annualMileage) {
		automobilePage.preencheAbaVehicleData(enginePerformance, dataManufacture, listPrice, licensePlateNumber,
				annualMileage);
	}

	@And("Preenche formulário da Aba 'Enter Insurant Data' de Automobile Insurance {string},{string},{string},{string},{string},{string},{string}")
	public void preencheFormularioAbaInsurantData(String firstName, String lastName, String dateBirth,
			String streetAddress, String zipCode, String city, String website) {
		automobilePage.preencheAbaInsurantData(firstName, lastName, dateBirth, streetAddress, zipCode, city, website);
	}

	@And("Preenche formulário da Aba 'Enter Product Data' de Automobile Insurance {string}")
	public void preencheFormularioAbaProductData(String startDate) {
		automobilePage.preencheAbaProductData(startDate);
	}

	@And("Preenche formulário da Aba 'Select Price Option' de Automobile Insurance")
	public void preencheFormularioAbaSelectPriceOption() {
		automobilePage.preencheAbaSelectPriceOption();
	}

	@And("Preenche formulário da Aba 'Send Quote' de Automobile Insurance {string},{string},{string},{string},{string},{string}")
	public void preencheFormularioAbaSendQuote(String email, String phone, String userName, String password,
			String confirmPassword, String comments) {
		automobilePage.preencheAbaSendQuote(email, phone, userName, password, confirmPassword, comments);
	}

	@Then("Valida a mensagem 'Sending e-mail success!' de Automobile Insurance")
	public void validaMensagemSucessoTela() {
		assertTrue(automobilePage.validaMensagemSucesso());
		automobilePage.clicaBotaoOK();
	}

}