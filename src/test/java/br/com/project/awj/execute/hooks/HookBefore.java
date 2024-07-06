package br.com.project.awj.execute.hooks;

import static br.com.project.awj.core.DriverFactory.getDriver;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.project.awj.core.utils.InputDeDados;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.Before;

public class HookBefore {
	
	public static final Logger log = LoggerFactory.getLogger(HookBefore.class.getSimpleName());
	
	@Before(order = 0)
	public static void coletarDados(Scenario scenario) throws IOException {
		log.info("------------------- INICIANDO TESTE -------------------");	
		
		String pathScenario = scenario.getUri().replace("file:", "");
		
		List<String> allLines = Files.readAllLines(Paths.get(pathScenario));
		int count = 1;
		for (String line : allLines) {
			if (count == scenario.getLine()) {
				InputDeDados.setInput(line);
			}
			count++;
		}
	}

	@Before(order = 0)
	public void setarConfiguracoes() {
		log.info("------------------- INICIANDO TESTE -------------------");	
		getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		new WebDriverWait(getDriver(), 10);
	}
	
	@Before(order = 0)
	public void logInicial() {
		log.info("------------------- INICIANDO TESTE -------------------");	
		}
	
}
