package main.Visitor.visitor1;

import main.Visitor.visitor1.pedido.ItemPedido;
import main.Visitor.visitor1.pedido.Pedido;
import main.Visitor.visitor1.pedido.Produto;
import main.Visitor.visitor1.visitor.CalcPrecoBase;
import main.Visitor.visitor1.visitor.CalcValorSedex;

public class Sistema {

	public static void main(String[] args) throws Exception {

		Produto p1 = new Produto("Chocolate", 0.1, 0.01);
		Produto p2 = new Produto("Leite", 1, 0.3);
		
		Pedido p = new Pedido();
		p.addItemPedido(new ItemPedido(p1, 10, 0.9));
		p.addItemPedido(new ItemPedido(p2, 24, 1.5));
		
		CalcPrecoBase v1 = new CalcPrecoBase();
		p.accept(v1);
		System.out.println("Preco Base : " + v1.getValor());
		
		CalcValorSedex v2 = new CalcValorSedex();
		p.accept(v2);
		System.out.println("Sedex : " + v2.getValor());
	}

}
