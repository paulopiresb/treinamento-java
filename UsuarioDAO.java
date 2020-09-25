package br.com.projetofinal.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.projetofinal.beans.Usuario;

public interface UsuarioDAO extends CrudRepository<Usuario,Integer>{
/*
 * DAO => Data Acess Object é um Design Pattern, que sugestiona a criação do 
 * CRUD (Create - Read - Update - Delete) dentro desta classe	
 */
	
	Usuario findByEmailAndSenha(String email, String senha);

}
