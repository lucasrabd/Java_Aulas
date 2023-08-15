package br.com.fiap;

import javax.swing.JOptionPane;

public class ArCondicionado {
	public int temperatura;
	public String modo;

public void aumentarTemperatura() {
	this.temperatura++;
}


public void diminuirTemperatura() {
	this.temperatura--;
}

public void trocaModo(String modo) {
	this.modo = modo;
}

public void mostrar() {
	JOptionPane.showMessageDialog(null, "Temperatura atual: " + this.temperatura +"\nModo atual: " + this.modo);
 }
}