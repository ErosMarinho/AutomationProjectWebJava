package br.com.project.awj.pages;

import org.openqa.selenium.By;

import br.com.project.awj.core.BasePage;

public class HomeBackofficePage extends BasePage {

	/**
	 * MAPEAMENTO DOS COMPONENTES ELEMENTOS
	 */


	private By tag_Acessos = By.xpath("//span[contains(text(),'Acessos')]");
	private By title_Menu_Pessoa_Fisica = By.xpath("//li[contains(text(),'Pessoa Física')]");
	

	/**
	 * METODOS DA FUNCIONALIDADE DOS COMPONENTES NA TELA
	 */

	public void acessasite() {
		interactions.url("https://sampleapp.tricentis.com/101/app.php");	
	}
	
	

	public boolean validarTagAreaOperaca() {
		if (interactions.isElementDisplayed(tag_Acessos, "tag_Acessos")
				&& interactions.getText(tag_Acessos, "tag_Acessos").equals("Acessos")) {
			return true;
		}
		return false;
	}

	public boolean validarTituloDoMenuPessoaFisica() {
		if (interactions.isElementDisplayed(title_Menu_Pessoa_Fisica, "title_Menu_Pessoa_Fisica")
				&& interactions.getText(title_Menu_Pessoa_Fisica, "title_Menu_Pessoa_Fisica").equals("Pessoa Física")) {
			return true;
		}			
			return false;
	}

}