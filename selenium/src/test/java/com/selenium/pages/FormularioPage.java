package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenium.uimaps.FormularioMap;

public class FormularioPage {
WebDriver driver;
	
	public FormularioPage(WebDriver driver) {
		this.driver= driver;
	}
	
	FormularioMap formularioMap = new FormularioMap(driver);
	
	public void preencherFormulario() {
		formularioMap.inputEventos.click(driver);
		formularioMap.textAreaPorque.sendKey(driver, "teste 1 ......");
		formularioMap.textAreaTiposEventos.sendKey(driver, "teste 2 ");
		formularioMap.inputFrequencia.click(driver);
		formularioMap.textPorqueNParticipa.sendKey(driver, "teste 3 ....");
		formularioMap.textQuaisAtividades.sendKey(driver, "teste 4 ....");
		formularioMap.btnSubmit.click(driver);
	}
	
	public void ValidarMensagemSucesso() {
		WebDriverWait wait = new WebDriverWait(driver, 10);

		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(formularioMap.msgFinal.getValue())));
			System.out.println("Sucesso!");
		} catch (Exception e) {
			System.out.println("Falha!");
		}
	
	}
}
