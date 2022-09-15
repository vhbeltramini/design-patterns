package main.Prototype.prototype01.prototype01;

public class Produto implements Cloneable{

	private String descricao;
	private double peso;
	private double dimensoes;
	
	public Produto clonar() throws Exception {
		return (Produto) super.clone();
	}
	
	public Produto(String descricao, double peso, double dimensoes) {
		super();
		this.descricao = descricao;
		this.peso = peso;
		this.dimensoes = dimensoes;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getPeso() {
		return peso;
	}

	public double getDimensoes() {
		return dimensoes;
	}
	
	@Override
	public String toString() {
		return descricao + " " + peso + " " + dimensoes;
	}

	
	
}
