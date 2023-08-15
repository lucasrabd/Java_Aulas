package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.bean.ContaPoupanca;

public class UsaConta {

	public static void main(String[] args) {
		String aux, escolha = "Sim";
		int numConta, opcao;
		float saldo, valor;
		while (escolha.equalsIgnoreCase("Sim")) {
			try {
				aux = JOptionPane.showInputDialog("Digite o número da conta");
				numConta = Integer.parseInt(aux);
				aux = JOptionPane.showInputDialog("Digite o saldo da conta");
				saldo = Float.parseFloat(aux);
				ContaPoupanca cp = new ContaPoupanca();
				cp.setNumConta(numConta);
				cp.setSaldo(saldo);
				aux = JOptionPane.showInputDialog("Escolha a operação:" + "\n(1) saque\n(2) depósito");
				opcao = Integer.parseInt(aux);
				switch (opcao) {
				case 1: 
					aux = JOptionPane.showInputDialog("Digite o valor para sacar");
					valor = Float.parseFloat(aux);
					JOptionPane.showMessageDialog(null, "Dados da conta:" + "\nNúmero da conta: " + cp.getNumConta() + "\nSaldo atual: " + cp.sacar(valor));
					break;
				case 2:
						aux = JOptionPane.showInputDialog("Digite o valor para depósito");
					valor =  Float.parseFloat(aux);
					JOptionPane.showMessageDialog(null, "Dados da conta: " + "\nNúmero da conta: " + cp.getNumConta() + "\nSaldo atual: " + cp.depositar(valor));
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida!");;
				}
			} catch (NumberFormatException e) {
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			escolha = JOptionPane.showInputDialog("Deseja continuar?");
		}
		JOptionPane.showMessageDialog(null, "Fim de programa!");
		}
	}
