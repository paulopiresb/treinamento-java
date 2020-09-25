package br.com.colecoes.principal;

import java.util.HashMap;

import br.com.colecoes.beans.Cargo;

public class TesteMap {

	public static void main(String[] args) {
		HashMap<Integer, Cargo> lista = new HashMap<Integer,Cargo>();
		lista.put(1, new Cargo("DBA", "JUNIOR",5000));
		lista.put(2, new Cargo("ESTAGIARIO", "SENIOR", 3500));
		System.out.println(lista);
		System.out.println(lista.keySet());
		System.out.println(lista.values());
		for (Cargo obj : lista.values()) {
			System.out.println(obj.getAll());
			System.out.println("=================");
		}
	}

}
