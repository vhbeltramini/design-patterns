package main.Prototype.prototype01.prototype01;

import java.util.ArrayList;

public class ItemPedido implements Cloneable {

	private Produto produto;
	private int qtdade;
	private double pcoUnitario;
	
	public ItemPedido(Produto produto, int qtdade, double pcoUnitario) {
		super();
		this.produto = produto;
		this.qtdade = qtdade;
		this.pcoUnitario = pcoUnitario;
	}

	public Produto getProduto() {
		return produto;
	}

	public int getQtdade() {
		return qtdade;
	}

	public double getPcoUnitario() {
		return pcoUnitario;
	}
	
	public ItemPedido clonar() throws Exception {
		return (ItemPedido) clone();
	}
	
	
	
	
}
