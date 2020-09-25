package br.com.ecommerce.implementacao;

import Tela.Magica;
import br.com.ecommerce.beans.Livro;
import br.com.ecommerce.beans.Cd;

public class AplicacaoProduto {

	public static void main(String[] args) {

		char opcao = Magica.s("Digite <L> ou <C>").charAt(0);
		if (opcao=='L') {
			Livro livro = new Livro(
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
			System.out.println(livro.getAll());
		}else if (opcao=='C') {
			Cd cd = new Cd(
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
			System.out.println(cd.getAll());
		}else {
			System.out.println("Opção Invalida");
		}
	}
}
