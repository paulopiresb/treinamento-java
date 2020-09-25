package br.com.colecoes.principal;

import java.util.ArrayList;
import java.util.Collections;

public class TestList {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		//do {
		//	lista.add(JOptionPane.showInputDialog("Digite um cargo"));
		//}while(JOptionPane.showConfirmDialog
		//		(null, "Continuar?","Titulo", JOptionPane.YES_NO_OPTION)==0);
		//	System.out.println(lista);
		lista.add("DBA");
		lista.add("DEV");
		lista.add("ESTAGIARIO");
		lista.add("ANALISTA");
		System.out.println(lista.get(2));
		System.out.println(lista.remove(2));
		System.out.println("Sem ordenar: " + lista);
		
		Collections.sort(lista);
		System.out.println("Ordenar: " + lista);
		//For convencional
		//for (int cont=0;cont<lista.size();cont++) {
		//	System.out.println("=================");
		//	System.out.println("Cargo: " + lista.get(cont));
		//}
		
		//For each
		for (String elemento : lista) {
			System.out.println("==============");
			System.out.println("Cargo: " + elemento);
		}
	}

}
