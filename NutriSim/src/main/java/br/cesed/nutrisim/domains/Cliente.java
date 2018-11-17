package br.cesed.nutrisim.domains;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;
@Document
public class Cliente {
	private String id;
	private Usuario usuario;
	private Cadastro cadastro;
	private List<Refeicao> refeicoes;
	
	public Cliente() {
		
	}
	
	public Cliente(String id, Usuario usuario, Cadastro cadastro, List<Refeicao> refeicoes) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.cadastro = cadastro;
		this.refeicoes = refeicoes;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Cadastro getCadastro() {
		return cadastro;
	}

	public void setCadastro(Cadastro cadastro) {
		this.cadastro = cadastro;
	}

	public List<Refeicao> getRefeicoes() {
		return refeicoes;
	}

	public void setRefeicoes(List<Refeicao> refeicoes) {
		this.refeicoes = refeicoes;
	}

	

}
