package controllers;
import model.ConversorMonedas;

public class ModenasController {
	private ConversorMonedas modelConversorMonedas;
	
	 public ModenasController(ConversorMonedas inyecConversor) {
		 this.modelConversorMonedas = inyecConversor;
	}
	
	 public double conversion(String from ,String to ,String amount) {
	return	modelConversorMonedas.getConverion(from, to, Integer.parseInt(amount));

	}
	 
	 
}
