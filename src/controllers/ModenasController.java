package controllers;
import model.ServiceMonedas;

public class ModenasController {
	private ServiceMonedas monedasService;
	
	
	public ModenasController() {
		monedasService = new ServiceMonedas();
	}
	 public double getConversion(String from ,String to ,double amount) {
		 
	return	monedasService.getConverion(from, to, amount);

	}
	 
	 
}
