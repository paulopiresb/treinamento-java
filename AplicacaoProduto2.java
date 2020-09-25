package br.com.ecommerce.implementacao;

import Tela.Magica;
import br.com.ecommerce.beans.Cd;
import br.com.ecommerce.beans.Livro;
import br.com.ecommerce.beans.Produto;

public class AplicacaoProduto2 {

	public static void main(String[] args) {
		
		Produto produto = new Produto();

		char opcao = Magica.s("Digite <L> ou <C>").charAt(0);
		if (opcao=='L') {
			produto = new Livro(
					Magica.i("ID"),
					Magica.s("Descrição"),
					Magica.f("Compra"),
					Magica.f("Venda"),
					Magica.i("QTDE"),
					Magica.s("Tipo"),
					Magica.s("ISBN"),
					Magica.s("Autor"),
					Magica.s("Editora")
					);
			
		}else if (opcao=='C') {
			produto = new Cd(
					Magica.i("ID"),
					Magica.s("Descrição"),
					Magica.f("Compra"),
					Magica.f("Venda"),
					Magica.i("QTDE"),
					Magica.s("Tipo"),
					Magica.s("Artista"),
					Magica.s("Gravadora"),
					Magica.s("Duração")
					);
			
		}else {
			System.out.println("Opção Invalida");
		}
		System.out.println(produto.getAll());
	}
}
