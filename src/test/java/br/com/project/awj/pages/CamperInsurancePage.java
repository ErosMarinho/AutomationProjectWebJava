package br.com.project.awj.pages;

import org.openqa.selenium.By;

import br.com.project.awj.core.BasePage;

public class CamperInsurancePage extends BasePage {

	/**
	 * MAPEAMENTO DOS ELEMENTOS
	 */

	private By menuCamper = By.xpath("//*[@name='Navigation Camper']");
	private By selectMake = By.xpath("//*[@id='make']/option[8]");
	private By selectEnginePerformance = By.xpath("//*[@id='engineperformance']");
	private By inputDateManufacture = By.xpath("//*[@id='dateofmanufacture']");
	private By selectNumberSeats = By.xpath("//*[@id='numberofseats']/option[6]");
	private By selectFuelType = By.xpath("//*[@id='fuel']/option[2]");
	private By inputPayload = By.xpath("//*[@id='payload']");
	private By inputTotalWeight = By.xpath("//*[@id='totalweight']");
	private By inputListPrice = By.xpath("//*[@id='listprice']");
	private By inputLicensePlateNumber = By.xpath("//*[@id='licenseplatenumber']");
	private By inputAnnualMileage = By.xpath("//*[@id='annualmileage']");
	private By buttonNext = By.xpath("//*[@id='nextenterinsurantdata']");
	private By inputFirstName = By.xpath("//*[@id='firstname']");
	private By inputLastName = By.xpath("//*[@id='lastname']");
	private By inputDateBirth = By.xpath("//*[@id='birthdate']");
	private By radiobuttonGender = By.xpath("//*[text()='Male']");
	private By inputStreetAddress = By.xpath("//*[@id='streetaddress']");
	private By selectCountry = By.xpath("//*[@id='country']/option[32]");
	private By inputZipCode = By.xpath("//*[@id='zipcode']");
	private By inputCity = By.xpath("//*[@id='city']");
	private By selectOccupation = By.xpath("//*[@id='occupation']/option[2]");
	private By radiobuttonHobbies = By.xpath("//*[text()=' Speeding']");
	private By inputWebsite = By.xpath("//*[@id='website']");
	private By buttonNext2 = By.xpath("//*[@id='nextenterproductdata']");
	// private By buttonOpenPicture = By.xpath("//*[@id='open']");
	private By inputStartDate = By.xpath("//*[@id='startdate']");
	private By selectInsuranceSum = By.xpath("//*[@id='insurancesum']/option[3]");
	private By selectDamageInsurance = By.xpath("//*[@id='damageinsurance']/option[4]");
	private By radiobuttonEuroProtection = By.xpath("//*[text()='Euro Protection']");
	private By radiobuttonLegalDefenseInsurance_ = By.xpath("//*[text()='Legal Defense Insurance']");
	private By buttonNext3 = By.xpath("//*[@id='nextselectpriceoption']");
	private By radiobuttonGold = By.xpath("//th[2]/label[2]/span");
	private By buttonNext4 = By.xpath("//*[@id='nextsendquote']");
	private By inputEmail = By.xpath("//*[@id='email']");
	private By inputPhone = By.xpath("//*[@id='phone']");
	private By inputUserName = By.xpath("//*[@id='username']");
	private By inputPassword = By.xpath("//*[@id='password']");
	private By inputConfirmPassword = By.xpath("//*[@id='confirmpassword']");
	private By inputComments = By.xpath("//*[@id='Comments']");
	private By buttonSend = By.xpath("//*[@id='sendemail']");
	private By txtMessageSuccess = By.xpath("//*[text()='Sending e-mail success!']");
	private By buttonOK = By.xpath("//*[@class='confirm']");

	/**
	 * METODOS DE FUNÇÕES
	 */

	public void clicaMenuCamper() {
		interactions.isElementDisplayed(menuCamper, "menuCamper");
		interactions.click(menuCamper, "menuCamper");
		interactions.waitTime(3000);
	}

	public void preencheAbaVehicleData(String enginePerformance, String dataManufacture, String payload,
			String totalWeight, String listPrice, String licensePlateNumber, String annualMileage) {
		interactions.click(selectMake, "selectMake");
		interactions.write(selectEnginePerformance, enginePerformance, "selectEnginePerformance");
		interactions.write(inputDateManufacture, dataManufacture, "inputDateManufacture");
		interactions.click(selectNumberSeats, "selectNumberSeats");
		interactions.click(selectFuelType, "selectFuelType");
		interactions.write(inputPayload, payload, "inputPayload");
		interactions.write(inputTotalWeight, totalWeight, "inputTotalWeight");
		interactions.write(inputListPrice, listPrice, "inputListPrice");
		interactions.write(inputLicensePlateNumber, licensePlateNumber, "inputLicensePlateNumber");
		interactions.write(inputAnnualMileage, annualMileage, "inputAnnualMileage");
		interactions.click(buttonNext, "buttonNext");
	}

	public void preencheAbaInsurantData(String firstName, String lastName, String dateBirth, String streetAddress,
			String zipCode, String city, String website) {
		interactions.write(inputFirstName, firstName, "inputFirstName");
		interactions.write(inputLastName, lastName, "inputLastName");
		interactions.write(inputDateBirth, dateBirth, "inputDateBirth");
		interactions.click(radiobuttonGender, "radiobuttonGender");
		interactions.write(inputStreetAddress, streetAddress, "inputStreetAddress");
		interactions.click(selectCountry, "selectCountry");
		interactions.write(inputZipCode, zipCode, "inputZipCode");
		interactions.write(inputCity, city, "inputCity");
		interactions.click(selectOccupation, "selectOccupation");
		interactions.click(radiobuttonHobbies, "radiobuttonHobbies");
		interactions.write(inputWebsite, website, "inputWebsite");
		interactions.click(buttonNext2, "buttonNext2");
	}

	public void preencheAbaProductData(String startDate) {
		interactions.write(inputStartDate, startDate, "inputStartDate");
		interactions.click(selectInsuranceSum, "selectOccupation");
		interactions.click(selectDamageInsurance, "selectDamageInsurance");
		interactions.click(radiobuttonEuroProtection, "radiobuttonEuroProtection");
		interactions.click(radiobuttonLegalDefenseInsurance_, "radiobuttonLegalDefenseInsurance_");
		interactions.click(buttonNext3, "buttonNext3");
	}

	public void preencheAbaSelectPriceOption() {
		interactions.click(radiobuttonGold, "radiobuttonGold");
		interactions.click(buttonNext4, "buttonNext4");
	}

	public void preencheAbaSendQuote(String email, String phone, String userName, String password,
			String confirmPassword, String comments) {
		interactions.write(inputEmail, email, "inputEmail");
		interactions.write(inputPhone, phone, "inputPhone");
		interactions.write(inputUserName, userName, "inputUserName");
		interactions.write(inputPassword, password, "inputPassword");
		interactions.write(inputConfirmPassword, confirmPassword, "inputConfirmPassword");
		interactions.write(inputComments, comments, "inputComments");
		interactions.click(buttonSend, "buttonSend");
	}

	public boolean validaMensagemSucesso() {
		if (interactions.isElementDisplayed(txtMessageSuccess, "txtMessageSuccess")
				&& interactions.getText(txtMessageSuccess, "txtMessageSuccess").equals("Sending e-mail success!")) {
			return true;
		}
		return false;
	}

	public void clicaBotaoOK() {
		interactions.waitTime(2000);
		interactions.click(buttonOK, "buttonOK");
	}

}
