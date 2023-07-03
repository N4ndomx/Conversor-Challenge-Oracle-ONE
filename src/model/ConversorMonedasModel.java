package model;

public class ConversorMonedasModel {

	public double getConverion(String from, String to, double amount) {
		String urlString = "https://api.frankfurter.app/latest?" +
                "&amount=" +String.valueOf(amount)+
                "&from=" + getIDPais(from) +
                "&to=" + getIDPais( to);
        System.out.println(urlString);
        
		String response = APIConnector.getRate(urlString);
        
		return APIConnector.extractRate(response,getIDPais( to));
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
