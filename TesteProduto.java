package br.com.ecommerce.implementacao;

import javax.swing.JOptionPane;

import Tela.Magica;
import br.com.ecommerce.beans.Produto;

public class TesteProduto {

	public static void main(String[] args) {
		Produto churros = new Produto();
		churros.setAll(
				Integer.parseInt(JOptionPane.showInputDialog("ID")), 
				JOptionPane.showInputDialog("Descrição").toUpperCase(), 
				Float.parseFloat(JOptionPane.showInputDialog("Valor Compra")),
				Float.parseFloat(JOptionPane.showInputDialog("Valor Venda")),
				Integer.parseInt(JOptionPane.showInputDialog("Qtde")), 
				JOptionPane.showInputDialog("Tipo").toUpperCase()
				);
		System.out.println(churros.getId());
		System.out.println(churros.getDescricao());
		System.out.println(churros.getValorCompra());
		System.out.println(churros.getValorVenda());
		System.out.println(churros.getQtde());
		System.out.println(churros.getTipo());
		System.out.println("Total Compra: " + churros.getTotalCompra());
		System.out.println("Total Venda: " + churros.getTotalVenda());
		
	}

}