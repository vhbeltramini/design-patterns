package main.Visitor.visitor1.visitor;

import main.Visitor.visitor1.pedido.ItemPedido;

public interface Visitor {

	void visit(ItemPedido itemPedido) throws Exception;
	
}
