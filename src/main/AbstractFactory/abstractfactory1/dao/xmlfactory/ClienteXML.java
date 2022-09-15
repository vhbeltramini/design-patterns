package main.AbstractFactory.abstractfactory1.dao.xmlfactory;

import main.AbstractFactory.abstractfactory1.dao.abstractfactory.ClienteDados;

public class ClienteXML extends ClienteDados {

	@Override
	public void ler() {
		System.out.println("Vou ler um cliente de um arquivo XML");
	}

	@Override
	public void gravar() {
		System.out.println("Vou gravar um cliente em um arquivo XML");
	}


}
