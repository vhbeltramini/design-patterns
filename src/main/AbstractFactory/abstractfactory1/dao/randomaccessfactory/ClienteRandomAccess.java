package main.AbstractFactory.abstractfactory1.dao.randomaccessfactory;

import main.AbstractFactory.abstractfactory1.dao.abstractfactory.ClienteDados;

public class ClienteRandomAccess extends ClienteDados {

	@Override
	public void ler() {
		System.out.println("Vou ler um cliente de um arquivo de acesso aleatorio");
	}

	public void gravar() {
		System.out.println("Vou gravar um cliente de um arquivo de acesso aleatorio");
	}


}
