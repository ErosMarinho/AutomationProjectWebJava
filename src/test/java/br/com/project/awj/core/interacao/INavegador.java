package br.com.project.awj.core.interacao;

import static br.com.project.awj.core.DriverFactory.getDriver;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.project.awj.core.exceptions.InteracaoException;

/**
 * Interface que organiza métodos de manipulação do navegador.
 * 
 * @author Eros Marinho
 */
public interface INavegador {

	static final Logger log = LoggerFactory.getLogger(INavegador.class.getSimpleName());
	
	/**
	 * <p><strong>Substitui:</strong>
	 * <ul>
	 * <li>novaAba()</li>
	 * </ul>
	 * <p><strong>Função:</strong> abre uma nova guia no navegador.
	 * @return {@link Void void}
	 */
	default void newTab() {
		log.info("Método: newTab() - Abrindo uma nova guia.");
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("window.open('about:blank', '-blank')");
	}
	
	/**
	 * <p><strong>Substitui:</strong>
	 * <ul>
	 * <li>trocarAba()</li>
	 * </ul>
	 * <p><strong>Função:</strong> abre uma nova guia no navegador.
	 * @param tab é a {@link Integer aba} do navegador que terá foco.
	 * @return {@link Void void}
	 */
	default void switchTab(Integer tab) {
		log.info(String.format("Método: switchTab() - Trocando para a guia %s.", tab.toString()));
		ArrayList<String> tabs = new ArrayList<String>(getDriver().getWindowHandles());
		tabs.forEach(t -> log.info(t));
		getDriver().switchTo().window(tabs.get(tab));
	}
	
	/**
	 * <p><strong>Substitui:</strong>
	 * <ul>
	 * <li>fecharAba()</li>
	 * </ul>
	 * <p><strong>Função:</strong> encerra a guia atual do navegador.
	 * @return {@link Void void}
	 */
	default void closeTab() {
		log.info("Método: closeTab() - Fechando a guia atual.");
		getDriver().close();
	}
	
	/**
	 * <p><strong>Função:</strong> realiza um scroll na tela até o elemento especificado.
	 * @param by é o {@link By seletor} do elemento.
	 * @param description é o {@link String nome} do elemento.
	 * @return {@link Void void}
	 * @throws NoSuchElementException caso o elemento não existir.
	 * @throws TimeoutException caso exceder o tempo de carregamento do elemento.
	 * @throws ElementNotVisibleException caso a visão do elemento estiver obstruída ou ele estiver oculto.
	 * @throws StaleElementReferenceException caso o elemento não estiver mais visível na DOM.
	 * @throws ElementNotInteractableException caso o elemento estiver visível, mas em um estado não interagível.
	 * @throws Exception caso ocorra uma exceção não tratada.
	 * @see InteracaoException
	 */
	public default void scroll(String position, String description) {
		log.info(String.format("Método: scroll() - Posicionando a tela até o elemento %s.", description));
		try {
			if(position.equals("up")) {
				((JavascriptExecutor) getDriver()).executeScript("window.scrollTo(0,0)");
			} else if(position.equals("down")) {
				((JavascriptExecutor) getDriver()).executeScript("window.scrollTo(0,1000)");
			}					
		} catch (Exception e) {
			throw new InteracaoException(e, description);
		}
	}
	
	public default void scrollToElement(By by, String description) {
		log.info(String.format("Método: scroll() - Descendo a tela até o elemento %s.", description));
		try {
				((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);",  getDriver().findElement(by));								
		} catch (Exception e) {
			throw new InteracaoException(e, description);
		}
	}
	
	
	public default void navigateBack() {
		log.info("Método: navigateBack() - Retornando à página anterior no histórico de navegação");
		try {
			getDriver().navigate().back();
		} catch (Exception e) {
			throw new InteracaoException(e, "Retornando à página anterior");
		}
		
	}
	
}
