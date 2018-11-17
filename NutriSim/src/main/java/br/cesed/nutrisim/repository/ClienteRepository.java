package br.cesed.nutrisim.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.cesed.nutrisim.domains.Cliente;

public interface ClienteRepository extends MongoRepository<Cliente, String> {

}
