package view;

import java.awt.Component;

import javax.swing.JOptionPane;

public class Ventanas {
	private String titulo;

	public Ventanas(String titulo) {

		this.titulo = titulo;
	}

	public void mensaje(Component parent, String msg) {
		JOptionPane.showMessageDialog(parent, msg, this.titulo, JOptionPane.INFORMATION_MESSAGE);
	}

	public boolean mensajeConfirmacion(Component parent, String msg) {
		boolean bandera = false;

		int opcion = JOptionPane.showConfirmDialog(parent, msg, titulo, JOptionPane.YES_NO_CANCEL_OPTION);

		if (JOptionPane.OK_OPTION == opcion)
			bandera = true;
		return bandera;
	}

	public String selector(Component parent, String msg, String[] values) {
		return (String) JOptionPane.showInputDialog(parent, msg, this.titulo, JOptionPane.INFORMATION_MESSAGE, null, values, values[0]);
	}

	public String solicitarDato(Component parent, String msg) {
		return (String) JOptionPane.showInputDialog(null, msg, this.titulo, JOptionPane.INFORMATION_MESSAGE);
	}

	public boolean validacionNumerica(String input) {
		boolean resul = false;
		if (input == null || input.isEmpty()) {
			resul = true; // El input es nulo o vacío
		} else {
			for (int i = 0; i < input.length(); i++) {
				char c = input.charAt(i);
				if (!Character.isDigit(c) && c != '.' && c != '-') {
					resul = true; // Se encontró un carácter no numérico
					break;
				}
			}
		}
		return resul; // El string revisado
	}

}
