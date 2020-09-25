package br.com.projetofinal.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity //
@Table(name="TB_ARTISTA") //temos uma tabela
public class Artista {
	
	@JsonIgnoreProperties("artista") //ignora o artista que está em musica para não ficar em recurssão
	@OneToMany(mappedBy="artista", cascade=CascadeType.ALL) //MappedBy para informar que o relacionamento é pelo artista, e cascade se tiver alteracao em Artista leva a alteracao para musica
	private List<Musica> musicas;

	public List<Musica> getMusicas() {
		return musicas;
	}
	public void setMusicas(List<Musica> musicas) {
		this.musicas = musicas;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //IDENTITY serve para incremento no mysql
	@Column (name="id")
	private int id;
	
	@Column (name= "nome", length=40)
	private String nomeArtistico;
	
	@Column (name= "nacionalidade", length=20)
	private String nacionalidade;
			
	public Artista() {
		super();
	}
	public Artista(int id, String nomeArtistico, String nacionalidade) {
		super();
		this.id = id;
		this.nomeArtistico = nomeArtistico;
		this.nacionalidade = nacionalidade;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeArtistico() {
		return nomeArtistico;
	}
	public void setNomeArtistico(String nomeArtistico) {
		this.nomeArtistico = nomeArtistico;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	

}
