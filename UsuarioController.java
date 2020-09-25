package br.com.projetofinal.controler;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetofinal.beans.Usuario;
import br.com.projetofinal.dao.UsuarioDAO;

@CrossOrigin("*") //metodo que libera acesso para outras pessoas acessarem a rest controller no tomcat
//essa anotation é a que indica que essa classe é uma controller
//controller é responsável por levar os itens para o DB e vice versa
@RestController  //define a classe como controller
public class UsuarioController {

	@Autowired //importo os metodos do SpringBoot, que serao utilizados pelo DAO
	//aqui eu delego para os metodos definidos no Spring boot
	private UsuarioDAO dao; //atributo do tipo DAO
	
	@PostMapping("/login") // request body eu estou recuperando no corpo do protocolo. Dado vem pelo corpo do protocolo
	public ResponseEntity<Usuario> logar(@RequestBody Usuario user) { //requestbody capta usuario e senha do html
		Usuario resposta = dao.findByEmailAndSenha(user.getEmail(), user.getSenha());
		if (resposta==null) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(resposta);
	}
	
	//esse metodo serve para trazer um objeto da tabela com base no ID selecionado
	//busca na tabela a chave primaria(id) que atribui como variavel
	
	@GetMapping("/usuario/{codigo}") //retorna o usuario - recupera pela url
	public ResponseEntity<Usuario> getUsuario(@PathVariable int codigo) {
		Usuario resposta = dao.findById(codigo).orElse(null);
				if (resposta==null) {
					return ResponseEntity.status(404).build(); //coloca o build para preparar o cabeçalho com o codigo 404
				}
				return ResponseEntity.ok(resposta);
	}
	
	@GetMapping("/usuarios") //retorna toda a lista
	public ResponseEntity<ArrayList<Usuario>> getAll(){
		ArrayList<Usuario> lista = (ArrayList<Usuario>) dao.findAll();
		if (lista.size()==0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(lista);
	}
}
