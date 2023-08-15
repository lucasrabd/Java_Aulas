package br.com.fiap;

import javax.swing.JOptionPane;

public class UsarArCondicionado {

	public static void main(String[] args) {
		int temperatura;
		String modo;

		ArCondicionado ac1 = new ArCondicionado();
		String aux;
		try {
			aux = JOptionPane.showInputDialog("Digite a temperatura:");
			temperatura = Integer.parseInt(aux);
			aux = JOptionPane.showInputDialog("Selecione o modo:");
			modo = aux;
			
			ac1.temperatura = temperatura;
			ac1.modo = modo;
			ac1.mostrar();
			ac1.aumentarTemperatura();
			ac1.aumentarTemperatura();
			ac1.mostrar();
		
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Formato incorreto.");
		
			
			
			
			
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
