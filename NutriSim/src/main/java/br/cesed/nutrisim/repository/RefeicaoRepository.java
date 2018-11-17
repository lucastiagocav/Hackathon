package br.cesed.nutrisim.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.cesed.nutrisim.domains.Refeicao;

public interface RefeicaoRepository extends MongoRepository<Refeicao, String>{

}
