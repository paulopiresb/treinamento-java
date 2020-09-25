package br.com.ecommerce.implementacao;

import javax.swing.JOptionPane;

import br.com.ecommerce.beans.Produto;

public class TesteProdutoConstrutor {

	public static void main(String[] args) {
		Produto produto = new Produto(
				Integer.parseInt(JOptionPane.showInputDialog("ID")),
				JOptionPane.showInputDialog("Descrição").toUpperCase(),
				Float.parseFloat(JOptionPane.showInputDialog("Vlr Compra")),
				Float.parseFloat(JOptionPane.showInputDialog("Vlr Venda")),
				Integer.parseInt(JOptionPane.showInputDialog("Qtde")),
				JOptionPane.showInputDialog("Tipo").toUpperCase()
				);
		
		System.out.println(produto.getAll());

	}

}
