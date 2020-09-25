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

import br.com.projetofinal.beans.Artista;
import br.com.projetofinal.dao.ArtistaDAO;

@CrossOrigin("*")
@RestController // vai ser o recepcionista
public class ArtistaController {
	
	@Autowired
	private ArtistaDAO dao;
		
	@GetMapping("/artistas") 
	public ResponseEntity<ArrayList<Artista>> getAll(){
		ArrayList<Artista> resultado = (ArrayList<Artista>)dao.findAll();
		if (resultado.size()==0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(resultado);
	}
	
	@GetMapping("/artista/{id}") 
	public ResponseEntity<Artista> getArtista(@PathVariable int id){
		Artista resultado = dao.findById(id).orElse(null);
		if (resultado==null) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(resultado);
	}
	
	@GetMapping("/nacionalidade/{nac}") 
	public ResponseEntity<ArrayList<Artista>> getNacionalidade(@PathVariable String nac){
		ArrayList<Artista> resultado = (ArrayList<Artista>) dao.findByNacionalidade(nac);
		if (resultado.size()==0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(resultado);
	}
	
	@PostMapping("/novoartista")
	public ResponseEntity<Artista> gravar(@RequestBody Artista artista) {
		try {
			dao.save(artista);
			return ResponseEntity.ok(artista);
		}catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(500).build();
		}
		
	}
}
