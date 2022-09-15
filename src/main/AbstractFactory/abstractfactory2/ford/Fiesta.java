package main.AbstractFactory.abstractfactory2.ford;

import main.AbstractFactory.abstractfactory2.abstractFactory.CarroPopular;

public class Fiesta implements CarroPopular {

	@Override
	public void exibirInfoPopular() {
		System.out.println("Modelo: Fiesta\nF�brica: Ford\nCategoria:Popular");
	}

}
