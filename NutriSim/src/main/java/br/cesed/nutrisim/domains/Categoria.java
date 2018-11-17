package br.cesed.nutrisim.domains;

public class Categoria {
	private String tipoDeRefeicao;

	public Categoria() {
		
	}
	public Categoria(String tipoDeRefeicao) {
		super();
		this.tipoDeRefeicao = tipoDeRefeicao;
	}

	public String getTipoDeRefeicao() {
		return tipoDeRefeicao;
	}

	public void setTipoDeRefeicao(String tipoDeRefeicao) {
		this.tipoDeRefeicao = tipoDeRefeicao;
	}
}
