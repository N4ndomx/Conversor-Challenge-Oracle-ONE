package model;

public class ConversorTemperaturaModel {
	private double temperatura;
	private String escala;

	public ConversorTemperaturaModel(double temperatura, String escala) {
		// TODO Auto-generated constructor stub
		this.escala = escala;
		this.temperatura = temperatura;
	}

	public ConversorTemperaturaModel() {
		// TODO Auto-generated constructor stub
	}

	public double convertir(String escalaConvertir) {
		double temperaturaConver = 0;
		switch (this.escala) {
		case "Celsius":
			if (escalaConvertir == "Fahrenheit") {
				temperaturaConver = (temperatura * 9 / 5) + 32;
			} else if (escalaConvertir == "Kelvin") {
				temperaturaConver = temperatura + 273.15;
			}

			break;
		case "Fahrenheit":
			if (escalaConvertir == "Celsius") {
				temperaturaConver = (temperatura - 32) * 5 / 9;
			} else if (escalaConvertir == "Kelvin") {
				temperaturaConver = (temperatura + 459.67) * 5 / 9;
			}
			break;
		case "Kelvin":
			if (escalaConvertir == "Celsius") {
				temperaturaConver = temperatura - 273.15;
			} else if (escalaConvertir == "Fahrenheit") {
				temperaturaConver = (temperatura * 9 / 5) - 459.67;
			}

			break;

		}
		return temperaturaConver;

	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	public String getEscala() {
		return escala;
	}

	public void setEscala(String escala) {
		this.escala = escala;
	}

}
