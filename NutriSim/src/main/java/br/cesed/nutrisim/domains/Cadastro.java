package br.cesed.nutrisim.domains;

import java.util.Date;

public class Cadastro {
	private String nome;
	private long telefone;
	private String email;
	private String senha;
	private Date idade;
	private double altura;
	private double peso;
	
	public Cadastro() {
		
	}
	
	public Cadastro(String nome, long telefone, String email, String senha, Date idade, double altura, double peso) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.senha = senha;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getTelefone() {
		return telefone;
	}
	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Date getIdade() {
		return idade;
	}
	public void setIdade(Date idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	

}
