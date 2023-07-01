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
		return (String) JOptionPane.showInputDialog(null, msg, this.titulo,type);
	}

}
