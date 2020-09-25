package br.com.ecommerce.beans;

public class Cd extends Produto{
	
	private String artista;
	private String gravadora;
	private String duracao;
	
	public void setAll(int i, String d, float vc, float vv, int q, String t, String artista, String gravadora, String duracao) {
		super.setAll(i, d, vc, vv, q, t);
		this.artista = artista;
		this.gravadora = gravadora;
		this.duracao = duracao;
	}
	
	public String getAll() {
		return
				"Artista: " + artista + "\n" +
				"Gravadora: " + gravadora + "\n" +
				"Duração: " + duracao + "\n" +
				super.getAll();
	}
	
	public Cd(int i, String d, float vc, float vv, int q, String t, String artista, String gravadora, String duracao) {
		super(i, d, vc, vv, q, t);
		this.artista = artista;
		this.gravadora = gravadora;
		this.duracao = duracao;
	}
			
	public Cd() {
		super();
	}

	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getGravadora() {
		return gravadora;
	}
	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}
	public String getDuracao() {
		return duracao;
	}
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	
	

}
