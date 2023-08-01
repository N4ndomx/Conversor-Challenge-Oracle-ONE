package model.temperatura;

public class KelvinConversion implements TemperaturaConversion {
	private double temperaturaBase ;
	
	public KelvinConversion(double temperatura) {
		// TODO Auto-generated constructor stub
		this.temperaturaBase = temperatura;
	}
	
	@Override
	public double toCelsius() {
		// TODO Auto-generated method stub
		return temperaturaBase - 273.15;
	}

	@Override
	public double toFahrenheit() {
		// TODO Auto-generated method stub
		return (temperaturaBase * 9 / 5) - 459.67;
	}

	@Override
	public double toKelvin() {
		// TODO Auto-generated method stub
		return temperaturaBase;
	}

}
