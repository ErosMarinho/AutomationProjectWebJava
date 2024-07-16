package br.com.project.awj.execute.steps;

import static org.junit.Assert.assertTrue;

import br.com.project.awj.pages.CamperInsurancePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CamperInsuranceSteps {

	private CamperInsurancePage camperPage = new CamperInsurancePage();

	@And("Clica no menu Camper")
	public void clicaMenuCamper() {
		camperPage.clicaMenuCamper();
	}

	@And("Preenche formulário da Aba 'Enter Vehicle Data' de Camper Insurance {string},{string},{string},{string},{string},{string},{string}")
	public void preencheFormularioAbaVehicleData(String enginePerformance, String dataManufacture, String payload,
			String totalWeight, String listPrice, String licensePlateNumber, String annualMileage) {
		camperPage.preencheAbaVehicleData(enginePerformance, dataManufacture, payload, totalWeight, listPrice,
				licensePlateNumber, annualMileage);
	}

	@And("Preenche formulário da Aba 'Enter Insurant Data' de Camper Insurance {string},{string},{string},{string},{string},{string},{string}")
	public void preencheFormularioAbaInsurantData(String firstName, String lastName, String dateBirth,
			String streetAddress, String zipCode, String city, String website) {
		camperPage.preencheAbaInsurantData(firstName, lastName, dateBirth, streetAddress, zipCode, city, website);
	}

	@And("Preenche formulário da Aba 'Enter Product Data' de Camper Insurance {string}")
	public void preencheFormularioAbaProductData(String startDate) {
		camperPage.preencheAbaProductData(startDate);
	}

	@And("Preenche formulário da Aba 'Select Price Option' de Camper Insurance")
	public void preencheFormularioAbaSelectPriceOption() {
		camperPage.preencheAbaSelectPriceOption();
	}

	@And("Preenche formulário da Aba 'Send Quote' de Camper Insurance {string},{string},{string},{string},{string},{string}")
	public void preencheFormularioAbaSendQuote(String email, String phone, String userName, String password,
			String confirmPassword, String comments) {
		camperPage.preencheAbaSendQuote(email, phone, userName, password, confirmPassword, comments);
	}

	@Then("Valida a mensagem 'Sending e-mail success!' de Camper Insurance")
	public void validaMensagemSucessoTela() {
		assertTrue(camperPage.validaMensagemSucesso());
		camperPage.clicaBotaoOK();
	}

}
