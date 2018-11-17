package br.cesed.nutrisim.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import br.cesed.nutrisim.domains.Cliente;
import br.cesed.nutrisim.repository.ClienteRepository;

@Service
@Validated
public class ClienteService {
	
	@Autowired
	public ClienteRepository repository;
	
	public List<Cliente> listCliente(){
		return repository.findAll();
	}
	
	public Cliente listClienteId(String id) {
		return repository.findById(id).get();
	}
	
	public Cliente createCliente(Cliente cliente) {
		return repository.insert(cliente);
	}
	
	public Cliente updateCliente(Cliente cliente,String id) {
		if(repository.findById(id) != null) {
			return repository.insert(cliente);
		}return null;
	}
	
	public void deleteCliente(String id) {
		repository.deleteById(id);
	}
}
