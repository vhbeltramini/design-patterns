package main.AbstractFactory.abstractfactory1.dao.randomaccessfactory;

import main.AbstractFactory.abstractfactory1.dao.abstractfactory.PedidoDados;

public class PedidoRandomAccess extends PedidoDados {

	@Override
	public void lerItens() {
		System.out.println("Vou ler os itens do pedido de um arquivo de acesso aleatorio");
	}

	@Override
	public void ler() {
		System.out.println("Vou ler um pedido de um arquivo de acesso aleatorio");
	}

	@Override
	public void gravar() {
		System.out.println("Vou gravar um pedido em um arquivo de acesso aleatorio");
	}

}
