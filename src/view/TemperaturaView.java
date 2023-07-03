package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import controllers.TemperaturasController;

public class TemperaturaView {
	private TemperaturasController tempControlador;
	private Ventanas ventana;
	private String[] escalas;

	public TemperaturaView(TemperaturasController temControler, Ventanas ventanas) {
		// TODO Auto-generated constructor stub
		this.tempControlador = temControler;
		this.ventana = ventanas;
		escalas = new String[] { "Celsius", "Fahrenheit", "Kelvin" };
	}

	public void ejecutar() {
		String tem;
		boolean soloNumeros;
		List<String> listaEscala = new ArrayList<>(Arrays.asList(escalas));
		// TODO Auto-generated method stub
		do {
			tem = ventana.solicitarDato(null, "Cantidad de Temperatura que Deseas Convertir ", 1);
			soloNumeros = ventana.validacionNumerica(tem);
			if (soloNumeros) {
				ventana.mensaje(null, "Solo ingrese números", 1);
			}

		} while (soloNumeros);

		String procedencia = ventana.selector(null, "Escala de Procedencia", 1, escalas);
		listaEscala.remove(procedencia);
		String convertir = ventana.selector(null, "Escala a Convertir", 1,
				listaEscala.toArray(new String[listaEscala.size()]));

		double resultado = tempControlador.convertirTemperatura(procedencia, convertir, Double.parseDouble(tem));
		ventana.mensaje(null, "°" + tem + " " + procedencia + " son °" + resultado + " " + convertir, 1);
	}

}