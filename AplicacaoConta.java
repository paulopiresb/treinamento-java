package br.com.banco.implementacao;

import br.com.banco.beans.Conta;

public class AplicacaoConta {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setNumero(123);
		conta.setTipo("CORRENTE");
		conta.setAplicacao(0);
		conta.setLimite(100);
		conta.setSaldo(10000);
		conta.setTitular("REGINA");
		
		conta.sacar(2000);
		System.out.println(conta.getSaldo());
		conta.depositar(1000);
		System.out.println(conta.getSaldo());
		conta.aplicarAutomatico();
		System.out.println("Saldo :" + conta.getSaldo());
		System.out.println("Aplicação: " + conta.getAplicacao());
		float porc = 10;
		conta.aplicarRendimentos(porc);
		System.out.println("Aplicação após rendimento de: " + porc +"%" +conta.getAplicacao());
	}

}
