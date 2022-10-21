package main.Strategy.strategy2.strategy;

import main.Strategy.strategy1.pedido.ItemPedido;
import main.Strategy.strategy1.pedido.Pedido;
import main.Strategy.strategy2.loja.Venda;

public class CalculoTaxaDescontoGrandesValores implements CalculoDesconto {

	@Override
	public double calcular(Venda venda) {
		if (venda.getValorTotalBruto() > 300) {
			return 20;
		}
		return 0;
	}

}
