package br.com.ecommerce.beans;

/*
 * Design Patter DTO sugere:
 * - TODOS os atributos privados
 * - Getter e Setter para CADA atributo
 * - Possuir no mínimo DOIS construtores (um vazio e outro completo - todos os atributos)
 */

public class Produto {
	
	private int id;
	private String descricao;
	private float valorCompra;
	private float valorVenda;	
	private int qtde;
	private String tipo;
	//Construtor Vazio
	public Produto() {}
	
	//Construtor Cheio
	public Produto(int i, String d, float vc, float vv, int q, String t) {
		id = i;
		descricao=d;
		valorCompra=vc;
		valorVenda=vv;
		qtde=q;
		tipo=t;
	}

    public void entrarEstoque(int q) {
    	qtde+=q;
    }

    public void saidaEstoque(int q) {
    	qtde-=q;
    }
	
    public float cederDesconto(float porcentagem) {
    	return valorVenda - valorVenda * (porcentagem/100);
    }
	
    public void ajustarValores(float porcentagem) {
    	valorCompra = valorCompra + valorCompra * (porcentagem/100);
    	valorVenda = valorVenda + valorVenda * (porcentagem/100);
    }
		
	// Crie o método entrarEstoque()
	// Este método irá receber uma quantidade de produtos que será adicionada no estoque
	// esta quantidade deverá ser ADICIONADA na qtde atual
	
	// Crie o método saidaEstoque()
	// Este método irá receber uma quantidade de produtos que será retirada do estoque
	// esta quantidade deverá ser SUBTRAIDA na qtde atual
	
	// Crie o método cederDesconto()
	// Este método irá receber uma porcentagem (Exemplo: 10 para 10%) e então irá
	// exibir o valor da venda de acordo com a porcentagem recebida

	// Crie o método ajustarValores()
	// Este método irá receber uma porcentagem (Exemplo: 10 para 10%) e então irá
	// ALTERAR o valorCompra e o  valorVenda acrescentando a porcentagem no valor
	

	    
    
    public String getEstoque() {
		if (qtde<5) { 
			return "Baixo";
		}else if (qtde>10) {
			return "Alto";
		}else {
			return "Medio";
		}
	}
	
	public float getPromocao() {
		return (float)0.9*valorVenda;
	}

	// Método getPromocao() => valor da venda com 10% de desconto
	// Método getEstoque() +> se a qtde for menor que 5 deve exibir "Baixo",
	// se a qtde estiver entre 6 e 10 deve exibir "Medio"
	// se a qtde for maior que 10 deve exibir "Alto"
	
	public float getTotalCompra() {
		return qtde * valorCompra;
	}
	
	public float getTotalVenda() {
		return qtde * valorVenda;
	}
	
	public void setAll (int pId, String pDescricao, float pValorCompra, float pValorVenda, int pQtde, String pTipo) {
		id=pId;
		descricao=pDescricao;
		valorCompra=pValorCompra;
		valorVenda=pValorVenda;
		qtde=pQtde;
		tipo=pTipo;
	}
	
	public String getAll() {
		return 
				"ID: " + id + "\n" +
				"Descricao: " + descricao + "\n" +
				"Valor Compra: " + valorCompra + "\n" +
				"Qtde: " + qtde + "\n" +
				"Tipo: " + tipo;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(float valorCompra) {
		this.valorCompra = valorCompra;
	}

	public float getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(float valorVenda) {
		this.valorVenda = valorVenda;
	}

	public int getQtde() {
		return qtde;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	
}

