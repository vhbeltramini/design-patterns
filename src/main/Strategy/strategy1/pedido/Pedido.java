package main.Strategy.strategy1.pedido;

import java.util.ArrayList;
import java.util.List;
import main.Strategy.strategy1.strategy.CalculoFrete;

public class Pedido {

	public double calcularFrete() throws Exception {
		return calculoFrete.calcular(this);
	}
	
	private List<ItemPedido> itensPedido = new ArrayList<>();
	
	public void addItemPedido(ItemPedido itemPedido) {
		itensPedido.add(itemPedido);
	}
	
	public List<ItemPedido> getItensPedido() {
		return itensPedido;
	}
	 
	private CalculoFrete calculoFrete;
	
	public Pedido(CalculoFrete calculoFrete) {
		this.calculoFrete = calculoFrete;
	}

	public CalculoFrete getCalculoFrete() {
		return calculoFrete;
	}
	
	public void setCalculoFrete(CalculoFrete calculoFrete) {
		this.calculoFrete = calculoFrete;
	}
	
}
