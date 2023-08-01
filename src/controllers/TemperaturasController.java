package controllers;

import model.TemperaturaService;

public class TemperaturasController {
	private TemperaturaService temperaturaService;

	public TemperaturasController() {
		temperaturaService = new TemperaturaService();
	}

	public double convertirTemperatura(String escalaOriginal, String escalaConversion, double temperatura) {
		temperaturaService.setConversionBase(escalaOriginal,temperatura);;
		return temperaturaService.convertir(escalaConversion);

	}

}
