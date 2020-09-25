package br.com.colecoes.beans;

public class Cargo {

	private String nome;
	private String nivel;
	private double salario;

	public String getAll() {
		return nome + "\n" + nivel + "\n" + salario;
	}
	
	public void setAll(String nome, String nivel, double salario) {
		this.nome = nome;
		this.nivel = nivel;
		this.salario = salario;
	}
	
	
	public Cargo(String nome, String nivel, double salario) {
		super();
		this.nome = nome;
		this.nivel = nivel;
		this.salario = salario;
	}



	public Cargo() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	

}
