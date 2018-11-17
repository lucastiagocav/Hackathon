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

import br.cesed.nutrisim.domains.Cliente;
import br.cesed.nutrisim.domains.Usuario;
import br.cesed.nutrisim.service.ClienteService;

@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteService service;
	/** 
	 * No ClienteRepository, eu posso efetuar cadastro (POST)
	 * listarei os usuarios, e as tabelas com todos os campos preenchidos
	 * efetuarei buscas sobre as refeições 
	 * - GET COM TODOS
	 *  - GET COM USUARIO(ID)
	 *  - POST PARA CRIAR OU ATUALIZAR
	 *  - DELETE POR ID
	 * 
	 */
	@GetMapping("/")
	public ResponseEntity<List<Cliente>> listarClientes() {
		return new ResponseEntity<List<Cliente>>(service.listCliente(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Cliente> buscarClienteId(@PathVariable String id) {
		return new ResponseEntity<Cliente>(service.listClienteId(id), HttpStatus.OK);
	}
	
	@PostMapping("/")
	public ResponseEntity<Cliente> criarCliente(@RequestBody Cliente cliente) {
		return new ResponseEntity<Cliente>(service.createCliente(cliente), HttpStatus.CREATED);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Cliente> atualizarCliente(@PathVariable String id, @RequestBody Cliente cliente) {
		if(service.listClienteId(id) != null) {
			return new ResponseEntity<Cliente>(service.createCliente(cliente), HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Usuario> deletarCliente(@PathVariable String id) {
		service.deleteCliente(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
