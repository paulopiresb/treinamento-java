package br.com.ecommerce.implementacao;

import Tela.Magica;
import br.com.ecommerce.beans.Produto;
import br.com.ecommerce.beans.Venda;

public class ApicacaoVenda {

	
	
	public static void main(String[] args) {
		Venda venda = new Venda();
		Produto produto = new Produto(); // instanciei produto pq ele est� dentro da Venda
		
		venda.setNumero(Magica.i("N�mero da Venda"));
		venda.setOperacao(Magica.s("Operacao"));
		venda.setTotal(Magica.f("Valor Total"));
		venda.setProduto(produto);
		
		produto.setDescricao(Magica.s("Descri��o"));;
		produto.setId(Magica.i("Qtde Produto"));
		produto.setQtde(Magica.i("Qtde Produto"));
		produto.setTipo(Magica.s("Tipo de Produto"));
		produto.setValorCompra(Magica.f("Valor Compra"));	
		produto.setValorVenda(Magica.f("Valor Venda"));
		
		//System.out.println(venda.getAll());
		System.out.println(venda.getTotal());
		System.out.println(venda.getProduto().getDescricao());

	}

}
