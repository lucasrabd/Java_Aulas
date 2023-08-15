package br.com.fiap;

import javax.swing.JOptionPane;

public class Televisor {

	public int volume;
	public int canal;
	
	public void aumentarVolume() {
		this.volume++;
	}

	
	public void diminuirVolume() {
		this.volume--;
	}
	
	public void trocaCanal(int canal) {
		this.canal = canal;
	}
	
	public void mostrar() {
		JOptionPane.showMessageDialog(null, "Volume atual: " + this.volume +"\nCanal atual: " + this.canal);
	}
	
	public void mostrar2() {
	  System.out.println("Volume atual: " + this.volume +"\nCanal atual: " + this.canal);
	}
	
	
}
