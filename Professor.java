package br.com.universidade.modelo;

public class Professor {

	private String nome;
	private float valorHora;
	private int id;
	private String area;
	
	public void setAll(String pNome, float pValorHora, int pId, String pArea) {
		nome=pNome;
		valorHora=pValorHora;
		id=pId;
		area=pArea;
	}
	
	public String getAll() {
		return nome + "\n" + valorHora + "\n" + id + "\n" + area;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public float getValorHora() {
		return valorHora;
	}
	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	
	
	
}

