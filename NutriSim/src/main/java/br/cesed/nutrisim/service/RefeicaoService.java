package br.cesed.nutrisim.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import br.cesed.nutrisim.domains.Refeicao;
import br.cesed.nutrisim.repository.RefeicaoRepository;

@Service
@Validated
public class RefeicaoService {

	@Autowired
	public RefeicaoRepository repository;
	
	public List<Refeicao> listRefeicao(){
		return repository.findAll();
	}
	
	public Refeicao listRefeicaoId(String id) {
		return repository.findById(id).get();
	}
	
	public Refeicao createRefeicao(Refeicao refeicao) {
		return repository.insert(refeicao);
	}
	
	public Refeicao updateRefeicao(Refeicao refeicao,String id) {
		if(repository.findById(id) != null) {
			return repository.insert(refeicao);
		}else {
			return null;
		}
	}
	
	public void deleteRefeicao(String id) {
		repository.deleteById(id);
	}
}
