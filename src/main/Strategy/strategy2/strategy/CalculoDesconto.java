package main.Strategy.strategy2.strategy;

import main.Strategy.strategy1.pedido.Pedido;
import main.Strategy.strategy2.loja.Venda;

public interface CalculoDesconto {

	double calcular(Venda pedido) throws Exception;
	
}
