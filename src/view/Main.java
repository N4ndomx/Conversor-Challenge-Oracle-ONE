package view;
import controllers.ModenasController;
import controllers.TemperaturasController;

public class Main {

	public static void main(String[] args) {
		
		
		Ventanas ventana = new Ventanas("Conversor");
		String[] conversores = { "Conversor de Moneda", "Conversor de Temperatura" };
		InterfazGrafica gui = null;
		
		boolean bandera = true;

		while (bandera) {
			String seleccion = ventana.selector(null, "Seleccione una opcion de Conversor", conversores);
			switch (seleccion) {
			case "Conversor de Moneda":
				gui = new MonedasView(new ModenasController(), ventana);
				break;
			case "Conversor de Temperatura":
				gui = new TemperaturaView(new TemperaturasController(), ventana);
				break;
			}
			
			gui.ejecutar();
			
			bandera = ventana.mensajeConfirmacion(null, "¿Desea continuar?");
		}
		ventana.mensaje(null, "Programa Finalizado");
	}

}
