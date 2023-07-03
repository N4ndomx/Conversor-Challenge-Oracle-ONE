package controllers;

import model.ConversorTemperaturaModel;

public class TemperaturasController {
	private ConversorTemperaturaModel temperaturaModel;

	public TemperaturasController(ConversorTemperaturaModel temModel) {
		this.temperaturaModel = temModel;
	}

	public double convertirTemperatura(String escalaOriginal, String escalaConversion, double temperatura) {
		temperaturaModel.setEscala(escalaOriginal);
		temperaturaModel.setTemperatura(temperatura);
		return temperaturaModel.convertir(escalaConversion);

	}

}
