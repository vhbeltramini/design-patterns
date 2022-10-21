package main.Strategy.strategy2.loja;

import main.Strategy.strategy2.strategy.CalculoTaxaDescontoGrandesValores;
import main.Strategy.strategy2.strategy.CalculoTaxaDescontoMenorTrezentos;

public class Sistema {

	public static void main(String[] args) throws Exception {
		Venda v = new Venda();
		v.add(new ItemVenda(10, 100));
		v.add(new ItemVenda(1.2, 500));
		v.add(new ItemVenda(30, 300));
		Venda v2 = new Venda();
		v2.add(new ItemVenda(1, 100));

		System.out.println("Total venda 1 = " + v.pagar());


		v.setDesconto(new CalculoTaxaDescontoGrandesValores());

		System.out.println("Desconto 1 = " + v.pagar());


		v.setDesconto(new CalculoTaxaDescontoMenorTrezentos());

		System.out.println("Desconto 2 = " + v.pagar());


		System.out.println("Total venda 2 = " + v2.pagar());

		v2.setDesconto(new CalculoTaxaDescontoGrandesValores());

		System.out.println("Desconto 1 = " + v2.pagar());


		v2.setDesconto(new CalculoTaxaDescontoMenorTrezentos());

		System.out.println("Desconto 2 = " + v2.pagar());
	}

}
