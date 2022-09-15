package main.AbstractFactory.abstractfactory1.dao.xmlfactory;

import main.AbstractFactory.abstractfactory1.dao.abstractfactory.PedidoDados;

public class PedidoXML extends PedidoDados {

	@Override
	public void lerItens() {
		System.out.println("Vou ler os itens do pedido de um arquivo XML");
	}

	@Override
	public void ler() {
		System.out.println("Vou ler um pedido de um arquivo XML");
	}

	@Override
	public void gravar() {
		System.out.println("Vou gravar um item do pedido em um arquivo XML");
	}

}
