package br.com.universidadereferencia.beans;

public class Endereco {

	private String logradouro;
	private String complemento;
	private String numero;
	private String bairro;
	private String cidade;
	private String uf;
	private String cep;
	
	public Endereco () {}
	
	public Endereco(String logradouro, String complemento, String numero, String bairro, String cidade, String uf,
			String cep) {
		super();
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.cep = cep;
	}
	
	
	public void setAll(String pLogradouro, String pComplemento, String pNumero, String pBairro, String pCidade, String pUf, String pCep) {
		logradouro=pLogradouro;
		complemento=pComplemento;
		numero=pNumero;
		bairro=pBairro;
		cidade=pCidade;
		uf=pUf;
		cep=pCep;
	}
	
	public String getAll () {
		return
				"Logradouro: " + logradouro + "\n" +
				"Complemento: " + complemento + "\n" +
				"Número: " + numero + "\n" +
				"Bairro: " + bairro + "\n" +
				"Cidade: " + cidade + "\n" +
				"UF: " + uf + "\n" +
				"CEP: " + cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

}
