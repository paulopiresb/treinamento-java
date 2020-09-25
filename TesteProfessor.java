package br.com.universidade.implementacao;

import javax.swing.JOptionPane;

import br.com.universidade.modelo.Professor;

public class TesteProfessor {

	public static void main(String[] a) {
		Professor p = new Professor();
		p.setId(Integer.parseInt(JOptionPane.showInputDialog("ID")));
		p.setNome(JOptionPane.showInputDialog("Nome do Professor"));
		p.setArea(JOptionPane.showInputDialog("Área de atuação"));
		p.setValorHora(Float.parseFloat(JOptionPane.showInputDialog("Valor Hora")));
		System.out.println(p.getAll());
		
		Professor p2 = new Professor();
		p2.setAll(
				JOptionPane.showInputDialog("Nome"),
				Float.parseFloat(JOptionPane.showInputDialog("Valor Hora")),
				Integer.parseInt(JOptionPane.showInputDialog("ID")),
				JOptionPane.showInputDialog("Área de atuação")
				);
		System.out.println(p2.getAll());
	}

}
