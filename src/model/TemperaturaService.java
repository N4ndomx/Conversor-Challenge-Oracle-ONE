package model;

import model.temperatura.CelsiusConversion;
import model.temperatura.FahrenheitConversion;
import model.temperatura.KelvinConversion;
import model.temperatura.TemperaturaConversion;

public class TemperaturaService {
	private TemperaturaConversion conversionBase;

	public TemperaturaService(double temperatura, String escalabase) {
		conversionBase = selectorConversion(escalabase,temperatura);
	}
	public TemperaturaService() {}

	public double convertir(String escalaConvertir) {
		double nuevaTemperatura =0;
		
		switch (escalaConvertir) {
		case "Celsius":
			nuevaTemperatura =conversionBase.toCelsius();
			break;
		case "Fahrenheit":
			nuevaTemperatura =conversionBase.toFahrenheit();
			break;
		case "Kelvin":
			nuevaTemperatura =conversionBase.toKelvin();
			break;

		}
		return nuevaTemperatura ;
		

	}
	
	private  TemperaturaConversion selectorConversion(String escalabase,double temperatura) {
		if (escalabase.equals("Celsius")) {
			return  new CelsiusConversion(temperatura);
		} else if(escalabase.equals("Fahrenheit")){
			return new FahrenheitConversion(temperatura);
		}else {
			return  new KelvinConversion(temperatura);
		}
	}


	public void setConversionBase(String escalabase,double temperatura) {
		this.conversionBase = selectorConversion(escalabase, temperatura);
	}
	
	
	

}
