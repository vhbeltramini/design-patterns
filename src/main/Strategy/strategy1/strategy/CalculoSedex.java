package main.Strategy.strategy1.strategy;

import main.Strategy.strategy1.pedido.ItemPedido;
import main.Strategy.strategy1.pedido.Pedido;

public class CalculoSedex implements CalculoFrete {

	@Override
	public double calcular(Pedido pedido) {
		double total = 0;
		for (ItemPedido item:pedido.getItensPedido())
			total += item.getProduto().getPeso();
		return total * 3;
	};

}
