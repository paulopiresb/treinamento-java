package br.com.banco.beans;

public class Conta {

	private int numero;
	private String tipo;
	private float saldo;
	private float limite;
	private String titular;
	private float aplicacao;
	
	/*
	 *  Criem o construtor cheio e vazio
	 *  Criem o getAll() e o setAll()
	 */
	
	public Conta() {}
	
	public Conta(int n, String t, float s, float l, String tit, float a) {
		numero=n;
		tipo=t;
		saldo=s;
		limite=l;
		titular=tit;
		aplicacao=a;
	}
	
	public void setAll(int n, String t, float s, float l, String tit, float a) {
		numero=n;
		tipo=t;
		saldo=s;
		limite=l;
		titular=tit;
		aplicacao=a;
	}
	
	public String getAll() {
		return
				"Número da Conta: " + numero + "\n" +
				"Tipo da Conta: " + tipo + "\n" +
				"Saldo: " + saldo + "\n" +
				"Limite: " + limite + "\n" +
				"Titular: " + titular + "\n" +
				"Número da Conta: " + aplicacao;
	}
	public void depositar(float valor) {
		saldo+=valor;
	}
	
	public void sacar(float valor) {
		saldo-=valor;
	}
	
	public void aplicarRendimentos (float porcentagem) {
		aplicacao = aplicacao + aplicacao * (porcentagem/100);
	}
	
	public void aplicarAutomatico() {
		float valor = saldo * (float) 0.25;
		if (tipo.contentEquals("CORRENTE")) {
			saldo-=valor;
			aplicacao+=valor;
		}
	}
	
	public float exibirSaldo() {
		return saldo + limite;
	}
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public float getLimite() {
		return limite;
	}
	public void setLimite(float limite) {
		this.limite = limite;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public float getAplicacao() {
		return aplicacao;
	}
	public void setAplicacao(float aplicacao) {
		this.aplicacao = aplicacao;
	}
	

}
