package main.Strategy.strategy1.strategy;

import main.Strategy.strategy1.pedido.ItemPedido;
import main.Strategy.strategy1.pedido.Pedido;

public class CalculoTransportadora implements CalculoFrete {

	@Override
	public double calcular(Pedido pedido) {
		double totalDim = 0;
		double totalPeso = 0;
		for (ItemPedido item:pedido.getItensPedido()) {
			totalDim += item.getProduto().getDimensoes();
			totalPeso += item.getProduto().getPeso();
		}
		return (totalDim * 0.3) + (totalPeso * 1.2);
	}

}
