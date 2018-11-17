package br.cesed.nutrisim.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import br.cesed.nutrisim.domains.Usuario;
import br.cesed.nutrisim.repository.UsuarioRepository;

@Service
@Validated
public class UsuarioService {

	@Autowired
	public UsuarioRepository repository;
	
	public List<Usuario> listUsuario(){
		return repository.findAll();
	}
	
	public Usuario listUsuarioId(String id) {
		return repository.findById(id).get();
	}
	
	public Usuario createCliente(Usuario usuario) {
		return repository.insert(usuario);
	}
	
	public Usuario updateUsuario(Usuario usuario,String id) {
		if(repository.findById(id) != null) {
			return repository.insert(usuario);
		}return null;
	}
	
	public void deleteCliente(String id) {
		repository.deleteById(id);
	}
}
