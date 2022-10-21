package main.Strategy.strategy1.strategy;

import main.Strategy.strategy1.pedido.Pedido;

public interface CalculoFrete {

	double calcular(Pedido pedido) throws Exception;
	
}
