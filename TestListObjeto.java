package br.com.colecoes.principal;

import java.util.ArrayList;

import br.com.colecoes.beans.Cargo;

public class TestListObjeto {

	public static void main(String[] args) {
		ArrayList<Cargo> lista = new ArrayList<Cargo>();
		lista.add(new Cargo("DBA", "JUNIOR",5000));
		lista.add(new Cargo("ESTAGIARIO", "SENIOR", 3500));
		System.out.println(lista);
		for (Cargo obj : lista ) {
			System.out.println(obj.getAll());
		}
	}	

}
