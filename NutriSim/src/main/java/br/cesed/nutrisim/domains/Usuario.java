package br.cesed.nutrisim.domains;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
/*{"id":"1", "email":"lucas@gmail.com","senha":"123456"}
 * 
 */
public class Usuario {
	private String id;
	private String email;
	private String senha;
	
	public Usuario() {
		
	}
	
	public Usuario(String id, String email, String senha) {
		super();
		this.id = id;
		this.email = email;
		this.senha = senha;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	

}
