package br.com.ecommerce.beans;

public class Livro extends Produto{
	
	private String isbn;
	private String autor;
	private String editora;

	public void setAll(int i, String d, float vc, float vv, int q, String t, String isbn, String autor, String editora) {
		super.setAll(i, d, vc, vv, q, t);
		this.isbn = isbn;
		this.autor = autor;
		this.editora = editora;
	}
	
	public String getAll() {
		return
				"ISBN: " + isbn + "\n" +
				"Autor: " + autor + "\n" +
				"Editora: " + editora + "\n" +
				super.getAll();
	}

	public Livro(int i, String d, float vc, float vv, int q, String t, String isbn, String autor, String editora) {
		super(i, d, vc, vv, q, t);
		this.isbn = isbn;
		this.autor = autor;
		this.editora = editora;
	}
	
	public Livro() {
		super();
	}





	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	

}
