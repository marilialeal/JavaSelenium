package com.selenium.uimaps;

import org.openqa.selenium.WebDriver;
import com.selenium.core.Element;
import com.selenium.enums.ByValue;

public class FormularioMap {

	WebDriver driver;
	
	public FormularioMap(WebDriver driver) {
		this.driver= driver;
	}

	public Element inputEventos = new Element (driver, ByValue.XPATH,"//input[@id='wpforms-260271-field_1_2']");
	public Element textAreaPorque = new Element (driver, ByValue.ID,"wpforms-260271-field_2");
	public Element textAreaTiposEventos = new Element (driver, ByValue.ID,"wpforms-260271-field_3");
	public Element inputFrequencia = new Element (driver, ByValue.XPATH,"//input[@id='wpforms-260271-field_4_4']");
	public Element textPorqueNParticipa = new Element (driver, ByValue.ID,"wpforms-260271-field_5");
	public Element textQuaisAtividades = new Element (driver, ByValue.ID,"wpforms-260271-field_6");
	public Element btnSubmit = new Element (driver, ByValue.XPATH,"//button[text()='Submit']");
	
	//validar mensagem final
	public Element msgFinal = new Element (driver, ByValue.XPATH, "//h3[text()='Congrats, You Completed the First Step!']");
}

