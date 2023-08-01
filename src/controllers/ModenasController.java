package controllers;
import model.ServiceMonedas;

public class ModenasController {
	private ServiceMonedas monedasService;
	
	
	public ModenasController() {
		monedasService = new ServiceMonedas();
	}
	 public double getConversion(String from ,String to ,String amount) {
		 
	return	monedasService.getConverion(from, to, Double.parseDouble(amount));

	}
	 
	 
}
