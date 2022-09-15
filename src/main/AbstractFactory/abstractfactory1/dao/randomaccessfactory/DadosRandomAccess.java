package main.AbstractFactory.abstractfactory1.dao.randomaccessfactory;

import main.AbstractFactory.abstractfactory1.dao.abstractfactory.ClienteDados;
import main.AbstractFactory.abstractfactory1.dao.abstractfactory.DadosFactory;
import main.AbstractFactory.abstractfactory1.dao.abstractfactory.PedidoDados;

/**
 *  Essa eh uma versao do factory em que atende os requisitos se houver uma 
 *  unica instancia do objeto. 
 *
 */
public class DadosRandomAccess extends DadosFactory {

	private ClienteDados clienteDados;
	private PedidoDados pedidoDados;

	@Override
	public ClienteDados createCliente() {
		if (clienteDados == null)
			clienteDados = new ClienteRandomAccess();
		return clienteDados;
	}

	@Override
	public PedidoDados createPedido() {
		if (pedidoDados == null)
			pedidoDados = new PedidoRandomAccess();
		return pedidoDados;
	}

}
