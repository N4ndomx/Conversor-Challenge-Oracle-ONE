package view;
import controllers.ModenasController;
import controllers.TemperaturasController;

public class Main {

	public static void main(String[] args) {
		
		
		Ventanas ventana = new Ventanas("Conversor");

		String[] conversores = { "Conversor de Moneda", "Conversor de Temperatura" };
		
		boolean bandera = true;

		while (bandera) {
			ModenasController monedasC = new ModenasController();
			String seleccion = ventana.selector(null, "Seleccione una opcion de Conversor", conversores);
			switch (seleccion) {
			case "Conversor de Moneda":
				MonedasView conversorMonedaView = new MonedasView(monedasC, ventana);
				conversorMonedaView.ejecutar();
				break;

			case "Conversor de Temperatura":
				TemperaturasController tempC = new TemperaturasController();
				TemperaturaView conversorTemperaturaView = new TemperaturaView(tempC, ventana);
				conversorTemperaturaView.ejecutar();

				break;
			}
			bandera = ventana.mensajeConfirmacion(null, "¿Desea continuar?");
		}
		ventana.mensaje(null, "Programa Finalizado");
	}

}
