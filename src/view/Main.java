package view;

import model.ConversorMonedas;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import controllers.ModenasController;
public class Main {

	public static void main(String[] args) {
		ModenasController monedasC = new ModenasController(new ConversorMonedas());
		Ventanas n = new Ventanas("Conversor");
		
		String [] conversores = {
				"Conversor de Moneda", "Conversor de Temperatura"
		};
		
		String [] monedas = {"Pesos Mexicanos","Dolares Estadounidenses","Euros","Real Brasileño","Won Surcoreano"};
		boolean bandera = true;
		while (bandera) {
			String seleccion =  n.selector(null, "Seleccione una opcion de Conversor", 1, conversores);
			switch (seleccion) {
			case "Conversor de Moneda": 
				
				List<String> lista = new ArrayList<>(Arrays.asList(monedas));
				System.out.println("moneda");
				String money = n.solicitarDato(null, "Cantidad de Dinero que Deseas Convertir ", 1);
				String procedencia = n.selector(null,"Moneda de Procedencia" , 1, monedas);
				lista.remove(procedencia);
				String convertir = n.selector(null,"Moneda a Convertir" , 1, lista.toArray(new String[lista.size()]));
				double data = monedasC.conversion(procedencia, convertir,money );
				n.mensaje(null, "Sus $"+money+" "+procedencia+" son "+data+" "+convertir, 1);
				break;
				
			 case "Conversor de Temperatura":
				 
				 
				 System.out.println("tem");
				 
				 
				 break;
			default:
				//throw new IllegalArgumentException("Unexpected value: " + seleccion);
			}
			n.mensaje(null, "¿Desea continuar?", 2);
		}
	}

	
}
