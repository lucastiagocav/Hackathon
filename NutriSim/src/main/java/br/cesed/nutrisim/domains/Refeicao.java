package br.cesed.nutrisim.domains;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;
@Document
public class Refeicao {
	private List<Alimento> alimentos;
	private String id;
	private String tipo;
	private int valorCal;
	private int valorCarb;
	private int valorProt;
	private int valorLip;
	private Date data;
	private int quantidade;

	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}

	public Refeicao() {
		
	}
	public Refeicao(String id) {
		super();
		this.id = id;
	}
	
	public void getTotal() {
		for (int i = 0; i < alimentos.size(); i++) {
			if(alimentos.get(i) != null) {
				this.valorCal += alimentos.get(i).getEnergy() * quantidade;
				this.valorCarb += alimentos.get(i).getCarbohydrate() * quantidade ;
				this.valorProt += alimentos.get(i).getProtein() * quantidade;
				this.valorLip += alimentos.get(i).getLipid() * quantidade;
				
			}
		}
	}
	public List<Alimento> getAlimentos() {
		return alimentos;
	}
	public void setAlimentos(List<Alimento> alimentos) {
		this.alimentos = alimentos;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getValorCal() {
		return valorCal;
	}
	public void setValorCal(int valorCal) {
		this.valorCal = valorCal;
	}
	public int getValorCarb() {
		return valorCarb;
	}
	public void setValorCarb(int valorCarb) {
		this.valorCarb = valorCarb;
	}
	public int getValorProt() {
		return valorProt;
	}
	public void setValorProt(int valorProt) {
		this.valorProt = valorProt;
	}
	public int getValorLip() {
		return valorLip;
	}
	public void setValorLip(int valorLip) {
		this.valorLip = valorLip;
	}

}
