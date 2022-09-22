package main.AbstractFactory.abstractfactory3.controle.abstractfactory;

public abstract class Encomenda {

	private int largura;
	private int altura;
	private int profundidade;
	private int peso;
	private Destino destino;

	public int getAltura() {
		return altura;
	}
	
	public int getLargura() {
		return largura;
	}
	
	public int getProfundidade() {
		return profundidade;
	}
	
	/**
	 * Cada uma das medidas deve ser em centimetros.
	 * 
	 * @param larg 
	 * @param alt
	 * @param prof
	 * @throws Exception
	 */
	public void setDimensoes(int larg, int alt, int prof) throws Exception {
	
		this.largura = larg;
		this.altura = alt;
		this.profundidade = prof;
		
	}
	
	public int getPeso() {
		return peso;
	}
	
	public float getCubagem() {
		return largura * altura * profundidade;
	}
	
	/**
	 * Peso em gramas.
	 * 
	 * @param peso
	 * @throws Exception
	 */
	public void setPeso(int peso) throws Exception {
		this.peso = peso;
	}
	
	public abstract double getPreco() throws Exception;
	
	public Destino getDestino() {
		return destino;
	}
	
	public void setDestino(Destino destino) {
		this.destino = destino;
	}
	
}
