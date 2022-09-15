package main.Prototype.prototype01.prototype01;

import java.util.ArrayList;
import java.util.List;

public class Pedido implements Cloneable {

	public Pedido clonar() throws Exception {
		Pedido p = (Pedido) clone();
		p.itensPedido = new ArrayList<>(itensPedido.size());
		for (ItemPedido item:itensPedido) {
			p.itensPedido.add(item.clonar());
		}
		return p;
	}

	private List<ItemPedido> itensPedido = new ArrayList<>();

	public List<ItemPedido> getItensPedido() {
		return itensPedido;
	}
	
	public void addItemPedido(ItemPedido itemPedido) {
		itensPedido.add(itemPedido);
	}
	
}
