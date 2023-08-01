package model.temperatura;

public class CelsiusConversion implements TemperaturaConversion {
	double TemperaturaBase;
	
	public CelsiusConversion(double TemperaturaCelsius) {
		this.TemperaturaBase = TemperaturaCelsius;
	}
	
	@Override
	public double toCelsius() {
		// TODO Auto-generated method stub
		return TemperaturaBase;
	}

	@Override
	public double toFahrenheit() {
		// TODO Auto-generated method stub
		return (TemperaturaBase * 9 / 5) + 32;
	}

	@Override
	public double toKelvin() {
		// TODO Auto-generated method stub
		return TemperaturaBase + 273.15;
	}

}
