package br.com.colecoes.principal;

import java.util.HashSet;

public class TestSet {

	public static void main(String[] args) {
		HashSet<String> lista = new HashSet<String>();
		lista.add("DBA");
		lista.add("ANALISTA");
		lista.add("GERENTE DE PROJETO");
		lista.add("SUPORTE");
		lista.add("DBA");
		System.out.println(lista);

	}

}
