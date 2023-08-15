package br.com.fiap.bean;
/**
 * Classe para objetos do tipo ContaPoupanca
 * @lucasrabd
 * @version 1.0
 */
public class ContaPoupanca implements ContaBancaria {
	
	private int numConta;
	private float saldo;
	
	public ContaPoupanca() {}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo; 
	}
	/**
	 * Método sacar que permite sacar o valor informado.
	 * Valor a ser sacado não pode ser superior ao valor do saldo atutal.
	 * @lucasrabd
	 * @param valor - valor indicado a ser sacado.
	 * @return float - valor do saldo (atualizado)
	 */
	public float sacar(float valor) {
		try {
			if (valor <= saldo) {
				saldo -= valor;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return saldo;
	}
	/** 
	 * Método depositar que permite depositar o valor informado
	 * @author lucasrabd
	 * @param valor - valor indicado para ser depositado
	 * @return float - valor do saldo (atualizado)
	 */
	public float depositar(float valor) {
		saldo += valor;
		return saldo;	
				
		}
				
	}
	
	

	
	