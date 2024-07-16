package br.com.project.awj.execute.steps;

import static org.junit.Assert.assertTrue;

import br.com.project.awj.pages.TruckInsurancePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class TruckInsuranceSteps {

	private TruckInsurancePage truckPage = new TruckInsurancePage();

	@And("Clica no menu Truck")
	public void clicaMenuTruck() {
		truckPage.clicaMenuTruck();
	}

	@And("Preenche formulário da Aba 'Enter Vehicle Data' de Truck Insurance {string},{string},{string},{string},{string},{string},{string}")
	public void preencheFormularioAbaVehicleData(String enginePerformance, String dataManufacture, String payload,
			String totalWeight, String listPrice, String licensePlateNumber, String annualMileage) {
		truckPage.preencheAbaVehicleData(enginePerformance, dataManufacture, payload, totalWeight, listPrice,
				licensePlateNumber, annualMileage);
	}

	@And("Preenche formulário da Aba 'Enter Insurant Data' de Truck Insurance {string},{string},{string},{string},{string},{string},{string}")
	public void preencheFormularioAbaInsurantData(String firstName, String lastName, String dateBirth,
			String streetAddress, String zipCode, String city, String website) {
		truckPage.preencheAbaInsurantData(firstName, lastName, dateBirth, streetAddress, zipCode, city, website);
	}

	@And("Preenche formulário da Aba 'Enter Product Data' de Truck Insurance {string}")
	public void preencheFormularioAbaProductData(String startDate) {
		truckPage.preencheAbaProductData(startDate);
	}

	@And("Preenche formulário da Aba 'Select Price Option' de Truck Insurance")
	public void preencheFormularioAbaSelectPriceOption() {
		truckPage.preencheAbaSelectPriceOption();
	}

	@And("Preenche formulário da Aba 'Send Quote' de Truck Insurance {string},{string},{string},{string},{string},{string}")
	public void preencheFormularioAbaSendQuote(String email, String phone, String userName, String password,
			String confirmPassword, String comments) {
		truckPage.preencheAbaSendQuote(email, phone, userName, password, confirmPassword, comments);
	}

	@Then("Valida a mensagem 'Sending e-mail success!' de Truck Insurance")
	public void validaMensagemSucessoTela() {
		assertTrue(truckPage.validaMensagemSucesso());
		truckPage.clicaBotaoOK();
	}
}
