package main.AbstractFactory.abstractfactory1.dao.xmlfactory;

import main.AbstractFactory.abstractfactory1.dao.abstractfactory.ClienteDados;
import main.AbstractFactory.abstractfactory1.dao.abstractfactory.DadosFactory;
import main.AbstractFactory.abstractfactory1.dao.abstractfactory.PedidoDados;

public class DadosXML extends DadosFactory {

	@Override
	public ClienteDados createCliente() {
		return new ClienteXML();
	}

	@Override
	public PedidoDados createPedido() {
		return new PedidoXML();
	}

}
