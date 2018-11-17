package br.cesed.nutrisim.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.cesed.nutrisim.domains.Refeicao;
import br.cesed.nutrisim.domains.Usuario;
import br.cesed.nutrisim.service.RefeicaoService;


@RestController
@RequestMapping("/refeicao")
public class RefeicaoController {

	@Autowired
	private RefeicaoService service;
	
	
	
	

	@GetMapping("/")
	public ResponseEntity<List<Refeicao>> listarRefeicoes() {
		return new ResponseEntity<List<Refeicao>>(service.listRefeicao(), HttpStatus.OK);
	}
	@GetMapping("/{id}")
	public ResponseEntity<Refeicao> buscarRefeicaoId(@PathVariable String id) {
		return new ResponseEntity<Refeicao>(service.listRefeicaoId(id), HttpStatus.OK);
	}
	@PostMapping("/")
	public ResponseEntity<Refeicao> criarRefeicao(@RequestBody Refeicao refeicao) {
		return new ResponseEntity<Refeicao>(service.createRefeicao(refeicao), HttpStatus.CREATED);
	}
	@PutMapping("/{id}")
	public ResponseEntity<Refeicao> atualizarRefeicao(@PathVariable String id, @RequestBody Refeicao refeicao) {
		if(service.listRefeicaoId(id) != null) {
			return new ResponseEntity<Refeicao>(service.updateRefeicao(refeicao, id), HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Usuario> deletarAlimento(@PathVariable int id) {
		service.deleteAlimento(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
