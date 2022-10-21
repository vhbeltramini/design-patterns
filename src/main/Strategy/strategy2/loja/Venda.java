package main.Strategy.strategy2.loja;

import main.Strategy.strategy2.strategy.CalculoDesconto;

import java.util.ArrayList;
import java.util.List;

public class Venda {

	private List<ItemVenda> itens = new ArrayList<>();
	private CalculoDesconto desconto;
	
	public void add(ItemVenda item) {
		itens.add(item);
	}
	
	public double getValorTotalBruto() {
		double res = 0;
		for (ItemVenda item:itens)
			res += item.getPrecoUnit()*item.getQtdade();
		return res;
	}

	public CalculoDesconto getDesconto() {
		return desconto;
	}

	public double getValorDesconto() throws Exception {
		return desconto.calcular(this);
	}

	public void setDesconto(CalculoDesconto desconto) {
		this.desconto = desconto;
	}

	public double getValorTotalAPagar() {
		return getValorTotalBruto();
	}
	
	public double pagar() throws Exception {
		if (this.desconto == null) {
			return getValorTotalAPagar();
		}
		return getValorTotalAPagar() - getValorDesconto();
	}
	
}
