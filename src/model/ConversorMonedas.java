package model;

public class ConversorMonedas {

	public double  getConverion(String from, String to, int amount) {
		double response = APIConnector.getExchangeRate(getIDPais(from),getIDPais( to), amount);
        //System.out.println(response);
		return response;
	}

	private String getIDPais(String moneda) {
		String id ="";
		switch (moneda) {
		case "Pesos Mexicanos":
			id = "MXN";
			break;
		case "Dolares Estadounidenses":
			id = "USD";
			break;
		case "Euros":
			id = "EUR";
			break;
		case "Real Brasileño":
			id = "BRL";

			break;
		case "Won Surcoreano":
			id = "KRW";

			break;
		}
		return id;
	}

}
