package main.Strategy.strategy2.strategy;

import main.Strategy.strategy1.pedido.ItemPedido;
import main.Strategy.strategy1.pedido.Pedido;
import main.Strategy.strategy2.loja.Venda;

public class CalculoTaxaDescontoMenorTrezentos implements CalculoDesconto {

	@Override
	public double calcular(Venda venda) {
		if (venda.getValorTotalBruto() < 300) {
			return venda.getValorTotalBruto() * 0.15;
		}
		return 0;
	}

}
