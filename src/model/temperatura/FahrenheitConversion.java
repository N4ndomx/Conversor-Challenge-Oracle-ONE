package model.temperatura;

public class FahrenheitConversion implements TemperaturaConversion {
	private double temperaturaBase ;
	
	public FahrenheitConversion(double temperatura) {
		// TODO Auto-generated constructor stub
		this.temperaturaBase = temperatura;
	}
	
	@Override
	public double toCelsius() {
		// TODO Auto-generated method stub
		 return (temperaturaBase - 32) * 5 / 9;
	}

	@Override
	public double toFahrenheit() {
		// TODO Auto-generated method stub
		return temperaturaBase;
	}

	@Override
	public double toKelvin() {
		// TODO Auto-generated method stub
		return (temperaturaBase + 459.67) * 5 / 9;
	}

}
