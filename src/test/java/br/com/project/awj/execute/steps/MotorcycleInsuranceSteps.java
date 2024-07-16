package br.com.project.awj.execute.steps;

import static org.junit.Assert.assertTrue;

import br.com.project.awj.pages.MotorcycleInsurancePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class MotorcycleInsuranceSteps {

	private MotorcycleInsurancePage motorcyclePage = new MotorcycleInsurancePage();

	@And("Clica no menu Motorcycle")
	public void clicaMenuMotorcycle() {
		motorcyclePage.clicaMenuMotorcycle();
	}

	@And("Preenche formulário da Aba 'Enter Vehicle Data' de Motorcycle Insurance {string},{string},{string},{string},{string}")
	public void preencheFormularioAbaVehicleData(String cylinderCapacity, String enginePerformance,
			String dataManufacture, String listPrice, String annualMileage) {
		motorcyclePage.preencheAbaVehicleData(cylinderCapacity, enginePerformance, dataManufacture, listPrice,
				annualMileage);
	}

	@And("Preenche formulário da Aba 'Enter Insurant Data' de Motorcycle Insurance {string},{string},{string},{string},{string},{string},{string}")
	public void preencheFormularioAbaInsurantData(String firstName, String lastName, String dateBirth,
			String streetAddress, String zipCode, String city, String website) {
		motorcyclePage.preencheAbaInsurantData(firstName, lastName, dateBirth, streetAddress, zipCode, city, website);
	}

	@And("Preenche formulário da Aba 'Enter Product Data' de Motorcycle Insurance {string}")
	public void preencheFormularioAbaProductData(String startDate) {
		motorcyclePage.preencheAbaProductData(startDate);
	}

	@And("Preenche formulário da Aba 'Select Price Option' de Motorcycle Insurance")
	public void preencheFormularioAbaSelectPriceOption() {
		motorcyclePage.preencheAbaSelectPriceOption();
	}

	@And("Preenche formulário da Aba 'Send Quote' de Motorcycle Insurance {string},{string},{string},{string},{string},{string}")
	public void preencheFormularioAbaSendQuote(String email, String phone, String userName, String password,
			String confirmPassword, String comments) {
		motorcyclePage.preencheAbaSendQuote(email, phone, userName, password, confirmPassword, comments);
	}

	@Then("Valida a mensagem 'Sending e-mail success!' de Motorcycle Insurance")
	public void validaMensagemSucessoTela() {
		assertTrue(motorcyclePage.validaMensagemSucesso());
		motorcyclePage.clicaBotaoOK();
	}
}
