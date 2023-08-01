package model.temperatura;

public class TestConversionTemperatura {
	public static void main(String[] args) {
		TemperaturaConversion base;
		base = new CelsiusConversion(0);
		System.out.println(base.toFahrenheit());		
		
	}
}
