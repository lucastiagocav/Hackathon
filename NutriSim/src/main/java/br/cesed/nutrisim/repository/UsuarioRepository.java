package br.cesed.nutrisim.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.cesed.nutrisim.domains.Usuario;

public interface UsuarioRepository extends MongoRepository<Usuario, String>{

}
