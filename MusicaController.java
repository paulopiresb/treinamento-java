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

import br.com.projetofinal.beans.Musica;
import br.com.projetofinal.dao.MusicaDAO;

@CrossOrigin("*")
@RestController
public class MusicaController {
	@Autowired 
	private MusicaDAO dao;
	
	@GetMapping("lancamento/{tipo}")
	public ResponseEntity<ArrayList<Musica>> getLancamento(@PathVariable int tipo){
		ArrayList<Musica> resultado = (ArrayList<Musica>) dao.findByLancamento(tipo);
		if (resultado.size()==0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(resultado);
	}
	
	@PostMapping("/novamusica")
	public ResponseEntity<Musica> gravar(@RequestBody Musica musica){
		try {
			dao.save(musica);
			return ResponseEntity.ok(musica);
		}catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(403).build();
		}
	
	}
	
	@GetMapping("/musicas")
	public ResponseEntity<ArrayList<Musica>> getMusicas() {
		ArrayList<Musica> lista=(ArrayList<Musica>) dao.findAll();
		if (lista.size()==0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(lista);
		
		
	}
	
	@GetMapping("/musica/{codigo}")
	public ResponseEntity<Musica> getMusica(@PathVariable int codigo){
		Musica objeto = dao.findById(codigo).orElse(null);
		if (objeto==null) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(objeto);
		
	}
	// Criem os métodos para:
	//Exibir todas as musicas
	//Consultar a musica pelo ID
	
	
}
