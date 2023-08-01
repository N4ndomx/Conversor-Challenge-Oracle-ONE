package view;

import controllers.ModenasController;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MonedasView implements InterfazGrafica {
    private ModenasController monedasController;
    private Ventanas ventana;
    private String[] monedas;

    public MonedasView(ModenasController monedasController, Ventanas ventanas) {
        this.monedasController = monedasController;
        this.ventana = ventanas;
        
        // Definir las opciones de monedas
        monedas = new String[]{"Pesos Mexicanos", "Dolares Estadounidenses", "Euros", "Real Brasileño", "Won Surcoreano"};
    }
    
    @Override
    public void ejecutar() {
        String cantidad;
        boolean soloNumeros;
        // Revisar esta lista 
        List<String> listaMonedas = new ArrayList<>(Arrays.asList(monedas));

        do {
            cantidad = ventana.solicitarDato(null, "Cantidad de Dinero que Deseas Convertir ");
            soloNumeros = ventana.validacionNumerica(cantidad);
            if (soloNumeros) {
                ventana.mensaje(null, "Solo ingrese números");
            }
        } while (soloNumeros);

        String procedencia = ventana.selector(null, "Moneda de Procedencia", monedas);
        listaMonedas.remove(procedencia);
        String convertir = ventana.selector(null, "Moneda a Convertir",  listaMonedas.toArray(new String[listaMonedas.size()]));

        double resultado = monedasController.getConversion(procedencia, convertir, cantidad);
        ventana.mensaje(null, "Sus $" + cantidad + " " + procedencia + " son $" + resultado + " " + convertir);
    }

   

}

