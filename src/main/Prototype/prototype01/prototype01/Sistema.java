package main.Prototype.prototype01.prototype01;

public class Sistema {

	public static void main(String[] args) throws Exception {
		
		Produto p1 = new Produto("Chocolate", 0.1, 0.01);
		Produto p1clone = p1.clonar();
		System.out.println(p1clone);
		
		Produto p2 = new Produto("Leite", 1, 0.3);
		
		Pedido ped1 = new Pedido();
		ped1.addItemPedido(new ItemPedido(p1, 10, 0.9));
		ped1.addItemPedido(new ItemPedido(p2, 24, 1.5));
		
		Pedido ped2clone = ped1.clonar();
		System.out.println(ped2clone.getItensPedido().size());
		
		System.out.println(ped1.getItensPedido() == ped2clone.getItensPedido());
		System.out.println(ped1.getItensPedido().get(0) == ped2clone.getItensPedido().get(0));

		ItemPedido ip = new ItemPedido(p1, 1, 10.0);
		ItemPedido ipClone = ip.clonar();
		System.out.println(ip);
		System.out.println(ipClone);
		System.out.println(ip.getProduto());
		System.out.println(ipClone.getProduto());

	}

}
