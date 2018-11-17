package br.cesed.nutrisim.domains;

public class Alimento {
	private int id;
	private String description;
	private int energy;
	private int carbohydrate;
	private int protein;
	private int lipid;
	
	public Alimento() {
		
	}

	public Alimento(int id, String description, int energy, int carbohydrate, int protein, int lipid) {
		super();
		this.id = id;
		this.description = description;
		this.energy = energy;
		this.carbohydrate = carbohydrate;
		this.protein = protein;
		this.lipid = lipid;
	}
	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getCarbohydrate() {
		return carbohydrate;
	}
	public void setCarbohydrate(int carbohydrate) {
		this.carbohydrate = carbohydrate;
	}
	public int getProtein() {
		return protein;
	}
	public void setProtein(int protein) {
		this.protein = protein;
	}
	public int getLipid() {
		return lipid;
	}
	public void setLipid(int lipid) {
		this.lipid = lipid;
	}

}
