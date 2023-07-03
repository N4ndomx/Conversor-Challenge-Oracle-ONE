package view;

import java.awt.Component;

import javax.swing.JOptionPane;

public class Ventanas {
	private String titulo;

	public Ventanas(String titulo) {

		this.titulo = titulo;
	}

	public void mensaje(Component parent, String msg, int type) {
		JOptionPane.showMessageDialog(parent, msg, this.titulo, type);
	}

	public String selector(Component parent, String msg, int type, String[] values) {
		return (String) JOptionPane.showInputDialog(parent, msg, this.titulo, type, null, values, values[0]);
	}

	public String solicitarDato(Component parent, String msg, int type) {
		return (String) JOptionPane.showInputDialog(null, msg, this.titulo, type);
	}

	public boolean validacionNumerica(String input) {
		boolean resul = false;
		if (input == null || input.isEmpty()) {
			resul = true; // El input es nulo o vacío
		} else {
			for (int i = 0; i < input.length(); i++) {
				char c = input.charAt(i);
				if (!Character.isDigit(c) && c != '.'&& c != '-') {
					resul = true; // Se encontró un carácter no numérico ni punto
					break;
				}
			}
		}
		return resul; // El string solo contiene números y/o punto
	}

}
