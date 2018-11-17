package br.cesed.nutrisim.domains;

import java.util.Date;
import java.util.List;

public class Refeicao {
	private Categoria categoria;
	private List<Alimento> alimentos;
	private String id;
	private int valorCal;
	private int valorCarb;
	private int valorProt;
	private int valorLip;
	private Date data;

	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
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
				this.valorCal += alimentos.get(i).getEnergy() ;
				this.valorCarb += alimentos.get(i).getCarbohydrate() ;
				this.valorProt += alimentos.get(i).getProtein();
				this.valorLip += alimentos.get(i).getLipid();
				
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
