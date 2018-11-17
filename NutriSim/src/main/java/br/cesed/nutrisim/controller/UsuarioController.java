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

import br.cesed.nutrisim.domains.Usuario;
import br.cesed.nutrisim.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioService service;

	@GetMapping("/")
	public ResponseEntity<List<Usuario>> listarUsuarios() {
		return new ResponseEntity<List<Usuario>>(service.listUsuario(), HttpStatus.OK);
	}
	@GetMapping("/{id}")
	public ResponseEntity<Usuario> buscarUsuarioId(@PathVariable String id) {
		return new ResponseEntity<Usuario>(service.listUsuarioId(id), HttpStatus.OK);
	}
	@PostMapping("/")
	public ResponseEntity<Usuario> criarUsuario(@RequestBody Usuario usuario) {
		return new ResponseEntity<Usuario>(service.createCliente(usuario), HttpStatus.CREATED);
	}
	@PutMapping("/{id}")
	public ResponseEntity<Usuario> atualizarUsuario(@PathVariable String id, @RequestBody Usuario usuario) {
		if(service.listUsuarioId(id) != null) {
			return new ResponseEntity<Usuario>(service.createCliente(usuario), HttpStatus.OK);
		}
		
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Usuario> deletarUsuario(@PathVariable String id) {
		service.deleteCliente(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
