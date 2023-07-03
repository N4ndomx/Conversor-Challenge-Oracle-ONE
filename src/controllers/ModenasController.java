package controllers;
import model.ConversorMonedasModel;

public class ModenasController {
	private ConversorMonedasModel modelConversorMonedas;
	
	 public ModenasController(ConversorMonedasModel inyecConversor) {
		 this.modelConversorMonedas = inyecConversor;
	}
	public ModenasController() {
		// TODO Auto-generated constructor stub
	}
	 public double getConversion(String from ,String to ,String amount) {
	return	modelConversorMonedas.getConverion(from, to, Double.parseDouble(amount));

	}
	 
	 
}
