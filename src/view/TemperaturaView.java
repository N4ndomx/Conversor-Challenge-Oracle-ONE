package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import controllers.TemperaturasController;

public class TemperaturaView implements InterfazGrafica{
	private TemperaturasController tempControlador;
	private Ventanas ventana;
	private String[] escalas;

	public TemperaturaView(TemperaturasController temControler, Ventanas ventanas) {
		// TODO Auto-generated constructor stub
		this.tempControlador = temControler;
		this.ventana = ventanas;
		escalas = new String[] { "Celsius", "Fahrenheit", "Kelvin" };
	}
	@Override
	public void ejecutar() {
		String tem;
		boolean soloNumeros;
		List<String> listaEscala = new ArrayList<>(Arrays.asList(escalas));
		
		do {
			tem = ventana.solicitarDato(null, "Cantidad de Temperatura que Deseas Convertir ");
			soloNumeros = ventana.validacionNumerica(tem);
			if (soloNumeros) {
				ventana.mensaje(null, "Solo ingrese números");
			}

		} while (soloNumeros);

		String procedencia = ventana.selector(null, "Escala de Procedencia", escalas);
		listaEscala.remove(procedencia);
		String convertir = ventana.selector(null, "Escala a Convertir",
				listaEscala.toArray(new String[listaEscala.size()]));

		double resultado = tempControlador.convertirTemperatura(procedencia, convertir, Double.parseDouble(tem));
		ventana.mensaje(null, "°" + String.format("%.2f",Double.parseDouble(tem)) + " " + procedencia + " son °" + String.format("%.2f",resultado) + " " + convertir);
	}
	

}
